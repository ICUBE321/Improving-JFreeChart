package testcase;

import static org.junit.Assert.*;

import org.jfree.chart.plot.ContourPlot;
import org.jfree.data.contour.ContourDataset;
import org.junit.Test;

public class ContourPlot_test {

	public ContourDataset dataset;
	public ContourPlot test = new ContourPlot();
	
	
	@Test
	public void Dataset() {
		//double display = dataset.getMaxZValue();
		ContourDataset dataset2 = test.getDataset();
		assertEquals(null, dataset2);
		test.setDataset(dataset);
		//System.out.print(display);
	}

}
