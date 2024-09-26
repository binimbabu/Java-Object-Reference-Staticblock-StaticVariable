package com.bini.babu;

public class StaticReference {
    static StaticReference sr;
    
    static {
    	   System.out.println(sr);
    	   sr = new StaticReference();
    }
	public static void main(String[] args) {
     System.out.println(StaticReference.sr);
	}

}
