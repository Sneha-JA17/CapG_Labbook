package com.capgemini.collectionexample;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer, String> shoppingList= new HashMap<Integer,String>();
  shoppingList.put(101,"Laptop");
  shoppingList.put(102,"Speaker");
  shoppingList.put(103,"Headphone");
  shoppingList.put(104,"Keyboard");
  System.out.println("HashMap values= " + shoppingList);
  
  String item= shoppingList.get(102);
  System.out.println("Value in the hashmap with keyid '102' is " + item);
  
  Set<Integer> shoppingListKeySet= shoppingList.keySet();
  System.out.println("keys of the hashmap" + shoppingListKeySet );
  
  Collection<String>shoppingListValueSet= shoppingList.values();
  System.out.println("values of the hashmap" + shoppingListValueSet);
  
  Set<Entry<Integer, String>>shoppingListKeyValueSet= shoppingList.entrySet();
  System.out.println("keys and values of the hashmap" + shoppingListKeyValueSet);
  
  shoppingList.replace(104, "Mouse");
  Set<Entry<Integer, String>>newshoppingListKeyValueSet= shoppingList.entrySet();
  System.out.println("keys and values of the  new hashmap" + newshoppingListKeyValueSet);
  
  System.out.println("Keyids=" );
  for(Integer key:shoppingList.keySet()) {
  	System.out.println(key);
  	System.out.println(",");
  	System.out.println();
  }
  //Iterate through a HashMap

  System.out.println("items=" );
  for(String values:shoppingList.values()) {
  	System.out.println(values);
  	System.out.println(",");
  	System.out.println();
  	
  	
  	
  }
  //Iterating through the key and values using  entrySet() method
  System.out.println("Key, Values using EntrySet= " );
  for(Entry<Integer, String>hashmapdata: shoppingListKeyValueSet) {
  	System.out.println(hashmapdata);
  	System.out.println(",");
  	
  	}

  //Converting HashMap to TreeMap to sort the values
  Map< Integer, String> shoppingListSorted=new TreeMap<Integer, String>();
  shoppingListSorted.putAll(shoppingList);
  System.out.println();
  System.out.println("sorted data =" + shoppingListSorted);
  }
  
	}


