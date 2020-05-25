package com.basi.collection;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class SetEx2 {
	public static void main(String ar[])
	{
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.addAll(List.of(29,35,47,96,10));
		System.out.println(treeSet);
		System.out.println("just lower of 30:"+treeSet.floor(30));
		System.out.println("just upper of 30:"+treeSet.ceiling(30));
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Elephant","Dog","Pig","Zebra","Monkey","Cat"));
		
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		
		

	}

}
