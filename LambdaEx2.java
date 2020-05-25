package com.java8;
interface Cab
{
	public void booked();
}
class Ola implements Cab
{
	@Override
	public void booked()
	{
		System.out.println("Ola booked successfully | Please wait ! Arriving Soon!!");
	}
}
class Uber implements Cab
{
	@Override
	public void booked()
	{
		System.out.println("Uber booked successfully | Please wait ! Arriving Soon!!");
	}
}

/*
 * class Dunzo implements Cab {
 * 
 * @Override public void booked() { System.out.
 * println("Dunzo booked successfully | Please wait ! Arriving Soon!!"); } }
 */
public class LambdaEx2 {

	public static void main(String[] args) {
		Cab ola1 = new Ola();
		//using inner annonymous class 
		Cab dunzo = new Cab() {

			@Override
			public void booked() {

				System.out.println("Dunzo booked successfully | Please wait ! Arriving Soon!!");
			}};
		//using lambda expression
		Cab zoom = ()->System.out.println("Zoom booked successfully | Please wait ! Arriving Soon!!");
		
		
	
	}

}
