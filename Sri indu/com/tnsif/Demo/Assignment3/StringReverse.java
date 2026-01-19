package com.tnsif.Demo.Assignment3;

public class StringReverse{
	  public static void main(String [] args){
	    String original="TEAM WORK";
	    System.out.println("Original: "+original);
	    String[] words = original.split(" ");
	    String reversedString = "";
	    for(String word : words){
	      StringBuilder sb = new StringBuilder(word);
	      sb.reverse();
	      reversedString += sb.toString() + " ";
	    }
	    System.out.println("Reversed: "+reversedString.trim());
	  }
	}
	  