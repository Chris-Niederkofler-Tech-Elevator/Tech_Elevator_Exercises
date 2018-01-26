package com.techelevator;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class Exercises {

	/*
	 * Dictionary/Map Exercises
	 */
	
	/*
	 * Given the name of an animal, return the name of a group of that animal
	 * (e.g. "Elephant" -> "Herd", "Rhino" - "Crash").  
	 * 
	 * The animal name should be case insensitive so "elephant", "Elephant", and 
	 * "ELEPHANT" should all return "herd". 
	 * 
	 * If the name of the animal is not found, null, or empty, return "unknown". 
	 * 
	 * Rhino -> Crash
	 * Giraffe -> Tower
	 * Elephant -> Herd
	 * Lion -> Pride
	 * Crow -> Murder
	 * Pigeon -> Kit
	 * Flamingo -> Pat
	 * Deer -> Herd
	 * Dog -> Pack
	 * Crocodile -> Float
	 *
	 * animalGroupName("giraffe") → "Tower"
	 * animalGroupName("") -> "unknown"
	 * animalGroupName("walrus") -> "unknown"
	 * 
	 */
	public String animalGroupName(String animalName) {
		Map<String, String> animalToGroup = new HashMap<String, String>();
		
		
		
		animalToGroup.put("Rhino", "Crash");
		animalToGroup.put("Giraffe", "Tower");
		animalToGroup.put("Elephant", "Herd");
		animalToGroup.put("Lion", "Pride");
		animalToGroup.put("Crow", "Murder");
		animalToGroup.put("Pigeon", "Kit");
		animalToGroup.put("Flamingo", "Pat");
		animalToGroup.put("Deer", "Herd");
		animalToGroup.put("Dog", "Pack");
		animalToGroup.put("Crocodile", "Float");
		
				
		for(String name : animalToGroup.keySet()) {
			if(name.toLowerCase().equals(animalName.toLowerCase())){
				return animalToGroup.get(name);
			}
		}
		
		return "unknown";
		}
		
	

	/*
	 * Given an String item number (a.k.a. SKU), return the discount percentage if the item is on sale.
	 * If the item is not on sale, return 0.00.
	 * 
	 * If the item number is empty or null, return 0.00.
	 * 
	 * "KITCHEN4001" -> 0.20
	 * "GARAGE1070" -> 0.15
	 * "LIVINGROOM"	-> 0.10
	 * "KITCHEN6073" -> 0.40
	 * "BEDROOM3434" -> 0.60
	 * "BATH0073" -> 0.15
	 * 
	 * The item number should be case insensitive so "kitchen4001", "Kitchen4001", and "KITCHEN4001"
	 * should all return 0.20.
	 *  
	 * isItOnSale("kitchen4001") → 0.20
	 * isItOnSale("") → 0.00
	 * isItOnSale("GARAGE1070") → 0.15
	 * isItOnSale("dungeon9999") → 0.00 
	 * 
	 */
	public Double isItOnSale(String itemNumber) {
		Map<String, Double> unitDiscount = new HashMap<String, Double>();
		
		unitDiscount.put("Kitchen4001", 0.20);
		unitDiscount.put("Garage1070", 0.15);
		unitDiscount.put("Livingroom", 0.10);
		unitDiscount.put("Kitchen6073", 0.40);
		unitDiscount.put("Bedroom3434", 0.60);
		unitDiscount.put("Bath0073", 0.15);
		
		for(String item : unitDiscount.keySet()) {
			if(item.toLowerCase().equals(itemNumber.toLowerCase())) {
				return unitDiscount.get(item);
			}
		}
		return 0.00;
	}
	
	/*
	 * Modify and return the given map as follows: if "Peter" has more than 0 money, transfer half of it to "Paul",
	 * but only if Paul has less than $10s.
	 * 
	 * Note, monetary amounts are specified in cents: penny=1, nickel=5, ... $1=100, ... $10=1000, ...
	 * 
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 99}) → {"Peter": 1000, "Paul": 1099}
	 * robPeterToPayPaul({"Peter": 2000, "Paul": 30000}) → {"Peter": 2000, "Paul": 30000}
	 * 
	 */
	public Map<String, Integer> robPeterToPayPaul(Map<String, Integer> peterPaul) {
		
		int peterFunds = peterPaul.get("Peter");
		int paulFunds = peterPaul.get("Paul");
		int newPeterFunds = (peterFunds / 2);
		//int newPaulFunds = 0;
		
		if(paulFunds <= 999 && peterFunds >= 0) {
			peterPaul.put("Peter", (peterFunds - newPeterFunds));
			peterPaul.put("Paul", (paulFunds + newPeterFunds));
		}
		return peterPaul;
	}
	
    /*
	 * Modify and return the given map as follows: if "Peter" has $50 or more, AND "Paul" has $100 or more,
	 * then create a new "PeterPaulPartnership" worth a combined contribution of a quarter of each partner's
	 * current worth.
	 * 
	 * peterPaulPartnership({"Peter": 5000, "Paul": 10000}) → {"Peter": 3750, "Paul": 7500, "PeterPaulPartnership": 3750}
	 * peterPaulPartnership({"Peter": 3333, "Paul": 1234567890}) → {"Peter": 3333, "Paul": 1234567890}
	 * 
	 */
	public Map<String, Integer> peterPaulPartnership(Map<String, Integer> peterPaul) {
		int peterWorth = peterPaul.get("Peter");
		int paulWorth = peterPaul.get("Paul");
		int peterPartnership = (peterWorth / 4);
		int paulPartnership = (paulWorth / 4);
		
		
		if(peterWorth >= 5000 && paulWorth >= 10000) {
			peterPaul.put("Peter", (peterWorth - peterPartnership));
			peterPaul.put("Paul", (paulWorth - paulPartnership));
			peterPaul.put("PeterPaulPartnership", (peterPartnership + paulPartnership));
		}
		return peterPaul;
				
	}
		
	
	
	/*
	 * Given an array of non-empty strings, return a Map<String, String> where for every different string in the array, 
	 * there is a key of its first character with the value of its last character.
	 *
	 * beginningAndEnding(["code", "bug"]) → {"b": "g", "c": "e"}
	 * beginningAndEnding(["man", "moon", "main"]) → {"m": "n"}
	 * beginningAndEnding(["muddy", "good", "moat", "good", "night"]) → {"g": "d", "m": "t", "n": "t"}
	 */
	public Map<String, String> beginningAndEnding(String[] words) {
		Map<String, String> letterHell = new HashMap<>();
		
		for (String fL: words) {
            letterHell.put(fL.substring(0, 1), String.valueOf(fL.charAt(fL.length()-1)));
		}
		return letterHell;
	}
	/*
	 * Given an array of strings, return a Map<String, Integer> with a key for each different string, with the value the 
	 * number of times that string appears in the array.
	 * 
	 * ** A CLASSIC **
	 * 
	 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
	 * wordCount([]) → {}
	 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
	 * 
	 */
	public Map<String, Integer> wordCount(String[] words) {
		Map<String, Integer> newWordMap = new HashMap<String, Integer>();
		for(String wC : words) {
			if(!newWordMap.containsKey(wC)) {
				newWordMap.put(wC, 1);
			}
			else {
				int count = newWordMap.get(wC);
				newWordMap.put(wC, count +1);
			}
		}
		return newWordMap;
		
	}
	
	/*
	 * Given an array of int values, return a Map<Integer, Integer> with a key for each int, with the value the 
	 * number of times that int appears in the array.
	 * 
	 * ** The lesser known cousin of the the classic wordCount **
	 * 
	 * integerCount([1, 99, 63, 1, 55, 77, 63, 99, 63, 44]) → {1: 1, 44: 1, 55: 1, 63: 3, 77: 1, 99:2}
	 * integerCount([107, 33, 107, 33, 33, 33, 106, 107]) → {33: 4, 106: 1, 107: 3}
	 * integerCount([]) → {}
	 * 
	 */
	public Map<Integer, Integer> integerCount(int[] ints) {
		Map<Integer, Integer> newNumCount = new HashMap<Integer, Integer>();
		for(Integer nC : ints) {
			if(!newNumCount.containsKey(nC)) {
				newNumCount.put(nC, 1);
			}
			else {
				int count = newNumCount.get(nC);
				newNumCount.put(nC, count + 1);
				
			}
			
		}
		return newNumCount;
	}
	
	/*
	 * Given an array of strings, return a Map<String, Boolean> where each different string is a key and value
	 * is true only if that string appears 2 or more times in the array.
	 * 
	 * wordMultiple(["a", "b", "a", "c", "b"]) → {"b": true, "c": false, "a": true}
	 * wordMultiple(["c", "b", "a"]) → {"b": false, "c": false, "a": false}
	 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
	 * 
	 */
	public Map<String, Boolean> wordMultiple(String[] words) {
		Map<String, Boolean> multWords = new HashMap<>();
			for(String wM : words) {
				if(!multWords.containsKey(wM)) {
				multWords.put(wM, false);
		}
			else {
				multWords.put(wM, true);
			}
				
			}
		return multWords;
	}
	
	/*
	 * Given two maps, Map<String, Integer>, merge the two into a new map, Map<String, Integer> where keys in Map2, 
	 * and their Integer values, are added to the Integer values of matching keys in Map1. Return the new map.
	 * 
	 * Unmatched keys and their Integer values in Map2 are simply added to Map1.
	 *  
	 * consolidateInventory({"SKU1": 100, "SKU2": 53, "SKU3": 44} {"SKU2":11, "SKU4": 5})
	 * 	 → {"SKU1": 100, "SKU2": 64, "SKU3": 44, "SKU4": 5}
	 * 
	 */
	public Map<String, Integer> consolidateInventory(Map<String, Integer> mainWarehouse, Map<String, Integer> remoteWarehouse){
			
				for (String key: mainWarehouse.keySet()) { 
			    	if(remoteWarehouse.containsKey(key) && mainWarehouse.get(key).equals(remoteWarehouse.get(key))) {
			    		int consolidateMain = mainWarehouse.get(key);
			    		int consolidateRemote = remoteWarehouse.get(key);
			    		
			    	}
				}
	}

			  
	//having a hard time figuring this out this morning after I fell asleep on my computer last night//
				
			
				
			


	/*
	 * Just when you thought it was safe to get back in the water --- last2Revisited!!!!
	 * 
	 * Given an array of strings, for each string, the count of the number of times that a substring length 2 appears 
	 * in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1. 
	 * 
	 * We don't count the end substring, but the substring may overlap a prior position by one.  For instance, "xxxx"
	 * has a count of 2, one pair at position 0, and the second at position 1. The third pair at position 2 is the
	 * end substring, which we don't count.  
	 * 
	 * Return Map<String, Integer>, where the key is string from the array, and its last2 count.
	 *  
	 * last2Revisited(["hixxhi", "xaxxaxaxx", "axxxaaxx"]) → {"hixxhi": 1, "xaxxaxaxx": 1, "axxxaaxx": 2}
	 * 
	 */
	public Map<String, Integer> last2Revisted(String[] words) {
		
		//I will come back to you last2Revisited, the last one is kicking my brain in the face//
		
		return null;
	}
}
