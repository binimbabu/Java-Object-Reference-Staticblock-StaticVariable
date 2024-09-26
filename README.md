package com.bini.babu;

public class ObjectRefernceInStaticBlock {

	static {
		ObjectRefernceInStaticBlock orsb = new ObjectRefernceInStaticBlock();
		System.out.println(orsb);
	}
	public static void main(String[] args) {

	}

}


Output

com.bini.babu.ObjectRefernceInStaticBlock@378fd1ac


In the above code the 'orsb' variable is created as an instance and the variable 'orsb' prints the address location where the ObjectRefernceInStaticBlock is allocated.



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



Output

null
com.bini.babu.StaticReference@378fd1ac


In the above code we globally created a static variable sr and in the static block we printed sr bu the output is 'null' because after printing new line (i.e  System.out.println(sr);) we are creating an object reference (i.e sr = new StaticReference();). Hence sr will get the address location, that why the second line of output is 'com.bini.babu.StaticReference@378fd1ac'.
