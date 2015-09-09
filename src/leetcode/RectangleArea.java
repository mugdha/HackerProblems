package leetcode;

import java.util.Scanner;
class point
{
	private int x_val;
	private int y_val;
	public point(int x, int y)
	{
		x_val=x;
		y_val=y;
	}
	public int getXValue()
	{
		return x_val;
	}
	public int getYValue()
	{
		return y_val;
	}
}

public class RectangleArea {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		point Rect1_p1=new point(sc.nextInt(), sc.nextInt());
		point Rect1_p2=new point(sc.nextInt(), sc.nextInt());
		point Rect2_p1=new point(sc.nextInt(), sc.nextInt());
		point Rect2_p2=new point(sc.nextInt(), sc.nextInt());
		point overlapping1=new point(Rect2_p1.getXValue(), Rect1_p1.getYValue());
		point overlapping2=new point(Rect1_p2.getXValue(), Rect2_p2.getYValue());
		int area=(overlapping1.getXValue()-overlapping2.getXValue())*(overlapping1.getYValue()-overlapping2.getYValue());
		System.out.println(Math.abs(area));
		
	}

}
