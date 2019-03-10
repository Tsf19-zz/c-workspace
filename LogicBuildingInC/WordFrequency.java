package com.java.basic;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WordFrequency {

	public static void main(String[] args) {

		String s = "Hello to ABC Students Welcome to ABC Welcome to Students of Welcome Students ABC End of Line";
		String a[] = s.split(" ");
		//CREATED HASH MAP :
		Map<String, Integer> hm = new HashMap<>();

		//COUNTED FREQUENCY :
		for (String str : a) {
			if (hm.containsKey(str)) {
				hm.put(str, hm.get(str) + 1);
			} else {
				hm.put(str, 1);
			}
		}
		System.out.println("PRINTING UNSORTED DATA : ");
		System.out.println(hm);	
		System.out.println();

		//CREATING LINKED_LIST AND SORTING THE LIST ACCORDING TO THE VALUE :
		List <Map.Entry <String, Integer> > list = new LinkedList <Map.Entry <String, Integer> >(hm.entrySet());

		//SORTING LIST USING COMPARATOR BY MAKING USE OF ANONYMOUS CLASS :
		Collections.sort(list, new Comparator<Map.Entry <String, Integer> >() {	
			public int compare(Map.Entry <String, Integer> obj1, Map.Entry <String, Integer> obj2) {
				return(obj1.getValue()).compareTo(obj2.getValue());
			}

		});

		//PUTTING DATA FROM SORTED LIST TO LINKED_HASH_MAP :
		HashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();

		for(Map.Entry<String, Integer> temp : list) {

			lhm.put( temp.getKey(), temp.getValue() );
		}

		//PRINTING SORTED DATA :
		System.out.println("PRINTING SORTED DATA : ");
		for( Map.Entry<String, Integer> out : lhm.entrySet() ) {
			System.out.println("<Key, Value> = <" + out.getKey() +" "+ out.getValue() + ">");
		}

	}
}