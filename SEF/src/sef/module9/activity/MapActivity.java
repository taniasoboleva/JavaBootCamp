package sef.module9.activity;
//Needs to be completed

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import sef.module9.sample.MapSample;


public class MapActivity {



		public static void main(String[] args) {
			//1 - Type code to create a HashMap of key value pair
			Map map = new HashMap();
			

			map.put("id1", "Alise");
			map.put("id2", "Fred");
			map.put("id3", "Leo");
			
			//where key is id of type String and value is a name
			
			//2 - Call print method to print the map passed as its parameter.
			new MapActivity().print(map);
		}
		
		void print(Map map)
		{
			Set keySet = map.keySet();
			
			//You can use an iterator to access keys
			System.out.println("*************************************");
			System.out.println("Key\tValue");
			Iterator it=keySet.iterator();
			while(it.hasNext())
			{
				String key=(String)it.next();
				System.out.println(key+"\t"+map.get(key));
			}
			
			System.out.println("*************************************");
			//3 - Type code to print this map
		
		}
	}
