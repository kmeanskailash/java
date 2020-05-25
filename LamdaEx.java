package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface A
{
	public void display(ArrayList<Integer> i);
}
public class LamdaEx {

	public static void main(String[] args) {
		List<Integer> list = List.of(10,20,30);
		ArrayList<Integer> arrList = new ArrayList<Integer>(list);
		A obj = (i) ->
				{
					Iterator itr = i.iterator();
					while(itr.hasNext())
					{
						System.out.println(itr.next());
					}
					
				};
				obj.display(arrList);
	}

}
