package com.bini.babu;

public class ObjectRefernceStaticBlock {

	static {
		ObjectRefernceStaticBlock orsb = new ObjectRefernceStaticBlock();
		System.out.println(orsb);
	}

}
