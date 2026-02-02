package com.tnsif.Demo.Day16;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("java",67);
		hm.forEach((key,value)->System.out.println("key is:"+key+"value is:"+value));
		
		
	}

}