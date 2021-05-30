package com.capgemini.collectionexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HashMap<String,Integer> languages = new  HashMap<String,Integer>();
  languages.put("Java", 17);
  languages.put("Javascript", 27);
  languages.put("Python", 37);
  languages.put("Javascript", 47);
  languages.put("C", 11);
  languages.put("C++", 11);
	
System.out.println("HashmMap values" +languages);

// get() method for accessing value
int value= languages.get("Java");
System.out.println("Value in the hashmap with key 'java' is " +value);

//set of keys from the above HashMap
Set<String> languageKeySet= languages.keySet();
System.out.println("keys of the hashmap" + languageKeySet);

//set of values from the above HashMap
Collection<Integer>languageValueSet= languages.values();
System.out.println("values of the hashmap" + languageValueSet);

//Key, Values from the above HashMap using entrySet()method
Set<Entry<String,Integer>>languagesKeyValueSet= languages.entrySet();
System.out.println("keys and values of the hashmap" + languagesKeyValueSet);

// replace a HashMap value
languages.replace("Java", 9);
Set<Entry<String,Integer>>newlanguagesKeyValueSet= languages.entrySet();
System.out.println("key values of the hashmap after replacing" + newlanguagesKeyValueSet);

//iterating through the value using keySet() method
System.out.println("Keys=" );
for(String key:languages.keySet()) {
	System.out.println(key);
	System.out.println(",");
	System.out.println();
}
//Iterate through a HashMap

System.out.println("Values=" );
for(Integer values:languages.values()) {
	System.out.println(values);
	System.out.println(",");
	System.out.println();
	
	
	
}
//Iterating through the key and values using  entrySet() method
System.out.println("Key, Values using EntrySet= " );
for(Entry<String,Integer>hashmapdata:languagesKeyValueSet) {
	System.out.println(hashmapdata);
	System.out.println(",");
	
	}


//Converting HashMap to TreeMap to sort the values
Map<String, Integer> languagesSorted=new TreeMap<String, Integer>();
languagesSorted.putAll(languages);
System.out.println();
System.out.println("sorted data =" + languagesSorted);
}
}