/**
 * 
 */
package com.practice;

import java.util.ArrayList;
import java.util.HashMap;

import com.practice.map.StringFreqWithKeys;

/**
 * @author Debamrita
 *
 */
public class CreatePalindrome {
	String str = "";
	public void getPalindrome(int w, int x, int y, int z) {
		if((w==x+y+z)&&(w<=20)&&(w>0)&&(x>0)&&(y>0)&&(z>0)) {
			getWord(w, x, y, z);
			ArrayList<Character> aList = new ArrayList<>();
			for(int i=0;i<str.length();i++) {
				//System.out.println(str.charAt(i));
				if(aList.contains(str.charAt(i))) {
					aList.remove((Character)str.charAt(i));
				} else {
					aList.add(str.charAt(i));
				}
				
			}
			if(str.length()%2==0&&aList.isEmpty() || (str.length()%2==1 && aList.size()==1)) {
				System.out.println("Valid Palindrome");
				String first = "";
				String second = "";
				String middle= "";
				HashMap<String, Integer> map = new HashMap<>();
				for(int i=0;i<str.length();i++) {
					String temp="";
					temp=Character.toString(str.charAt(i));
					for(int j=i+1;j<str.length();j++) {
						if(str.charAt(i)==str.charAt(j)) {
							first=first+(Character.toString(str.charAt(i)));
							second=second+Character.toString(str.charAt(j));
						}
					}
					if(!first.contains((temp))) {
						middle=middle+temp;
					}
						
				}
				String reverse = new StringBuffer(second).reverse().toString();
				System.out.println(first+middle+reverse);
				/*
				 * if(x%2==0&y%2==0&z%2==0) { System.out.println(aList); } else {
				 * System.out.println("Invalid Palindrome"); }
				 */
			} else {
				System.out.println("Invalid Palindrome");
			}
		} else {
			System.out.println("Word count does not match, please check your inputs");
		}
			
	}
	
	private String getWord(int word, int alphabet, int no, int specialChar) {
			String alph="abcdefghijklmnopqrstuvwxyz";
			for(int i=0;i<alphabet/2;i++) {
				str=str+alph.charAt(i);
				str=str+alph.charAt(i);
			}
			if(alphabet%2!=0) {
				for(int i=0;i<alphabet%2;i++) {
					str=str+alph.charAt(i);
				}
			}
			for(int i=0;i<no/2;i++) {
				str=str+i;
				str=str+i;
			}
			if(no%2!=0) {
				for(int i=0;i<no%2;i++) {
					str=str+i;
				}
			}
			
			String sChar="~`@#$%^&*";
			for(int i=0;i<specialChar/2;i++) {
				str=str+sChar.charAt(i);
				str=str+sChar.charAt(i);
			}
			if(specialChar%2!=0) {
				for(int i=0;i<specialChar%2;i++) {
					str=str+sChar.charAt(i);
				}
			}
		//System.out.println("String is "+str);
		return str;
		
	}

}
