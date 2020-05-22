//package sqporject;

import java.util.*;
import java.io.*;

public class TestDataGenerator {
	public static void main(String[] args) throws IOException{
		Random num = new Random();
		System.out.println("how many arrays do you want to generate numbers for");
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		System.out.println("filename is?");
		Scanner s = new Scanner(System.in);
		String f = s.next();
		File data = new File(f);
		if(data.createNewFile()) {
			System.out.println("created " +data.getName());
		}
		
		else {
			System.out.println("file exists");
		}
		
		FileWriter d = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(d);
		for(int x = 0; x < size; x++) {
			double[][] values = new double[2][4];
		
				
						for(int i = 0; i < values.length; i++) {
							for(int j = 0; j < values.length; j++) {
							values[i][j] = num.nextDouble();
							}
						}
						String dat = Arrays.deepToString(values);
						bw.write(dat);
						bw.newLine();
						//d.close();
					
					}
					System.out.println("your testdata has been written to your file");
					bw.close();
					d.close();