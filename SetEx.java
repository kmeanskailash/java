package com.basi.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		List<Character> alpha = List.of('A','D','B','V','S','A','E','V','A');
		
	Set<Character> treeSet = new TreeSet<>(alpha);
	Set<Character> hashSet = new HashSet<>(alpha);
	Set<Character> linkedHashSet = new LinkedHashSet<>(alpha);
	 System.out.println("All Character: "+alpha);
	 System.out.println("Arranged in Sorted order: "+treeSet);
	 System.out.println("inserted manner: "+linkedHashSet);
	 System.out.println("no manner "+hashSet);
	 
		

	}

}
