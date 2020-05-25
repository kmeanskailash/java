package com.basi.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
	public static  void main(String ar[])
	{
		//HashMap , HashTable , TreeMap , LinkedHashMap 
		//HashMap allow key with null value
		Map<Character , Integer> map = Map.of('V',1,'A',11,'B',2,'C',5 , 'D',6,'E',7);
		//System.out.println(map);
		Map<Character,Integer> hashmap = new HashMap(map);
		Map<Character,Integer> hashtable = new Hashtable<>(map);
		Map<Character,Integer> linkedhashmap = new LinkedHashMap<>(map);
		Map<Character,Integer> treemap = new TreeMap<>(map);
		System.out.println("No ordered with HasMap:"+hashmap);
		System.out.println("This is Hashtable:"+hashtable);
		linkedhashmap.put('V',12);
		linkedhashmap.put('M',12);
		System.out.println("Insertion Ordered with LinkedHashMap:"+linkedhashmap);

		System.out.println("Sorted ordered maintained with TreeMap:"+treemap);

	}

}
