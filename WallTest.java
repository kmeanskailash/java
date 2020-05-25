package com.basic.TimBuchhk;

class Wall
{
	private double height , width;
	public Wall()
	{
		super();
	}
	public Wall(double width , double height ) {
		
		this.height=height;
		this.width=width;
		if(height<0)
			this.height=0;
		if(width<0)
			this.width=0;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public void setHeight(double height) {
		if(height<0)
		this.height=0.0;
		else
		this.height = height;
	}
	
	public void setWidth(double width) {
		if(width<0)
			this.width=0.0;
		else
		this.width = width;
	}
	public double getArea()
	{
		return height*width;
	}
	
	
}
public class WallTest {

	public static void main(String[] args) {
		 Wall wall = new Wall(1.125 ,-1.0);
		   System.out.println(wall.getWidth());
		   System.out.println(wall.getHeight());
		   System.out.println(wall.getArea());

	}

}
