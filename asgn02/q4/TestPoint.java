package tester;

import com.sunbeam.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(12.5,15);
		
		Point2D p2 = new Point2D(13.5,15);
		
		p1.stringForm(p2);
		
		boolean bo = p1.isEqual(p2);
		
		if(bo) {
			System.out.println("Points are same.");
		}else {
			double  dist = p1.calculateDistance(p2);
			System.out.println("Distance bet two points = "+dist);
		}
	}

}
