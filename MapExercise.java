package com.basi.collection;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

	public static void main(String[] args) {
		String str = "This is sample sentence "
				 + "You can use thid sample sentence for your program";
		Map<Character,Integer> map = new HashMap<>();
		char characters[] = str.toCharArray();
		//for finding each occurances of character
		for(char ch:characters)
		{
			if(ch==' ')
				continue;
			if(map.containsKey(ch))
			{  int i = map.get(ch);
			   map.put(ch, i+1);
			}
			else
			{
				map.put(ch,1);
			}
			
		}
		System.out.println(map);
		//for each occurance of words
		Map<String,Integer> map2  = new HashMap<>();
		String[] words = str.split(" ");
		for(String word:words)
		{
			if(word==" ")
				continue;
			
			if(map2.containsKey(word))
			{
				int i= map2.get(word);
				map2.put(word, i+1);
				
			}
			else
				map2.put(word, 1);
			
		}
		System.out.println("\nOccurance of each word:\n"+map2);
		

	}

}
