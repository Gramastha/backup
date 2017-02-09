package com.psl.day5;

public class WrappersText {

	public static void main(String[] args) {
		test(125, 2521741);

	}
	static void test(int i, long l){
		
		System.out.println("For integer:\n\n bitcount:- "+Integer.bitCount(i)+"\ntobinaryString:- "+Integer.toBinaryString(i)+"\ntoOctal String: "+Integer.toOctalString(i)+"\ntoHexString: "+Integer.toHexString(i)+"\nhighestOneBit "+Integer.highestOneBit(i)+"\nlowestOnebit: "+Integer.lowestOneBit(i)+"\nNumberofleading zeros: "+Integer.numberOfLeadingZeros(i)+"\nreverse: "+Integer.reverse(i)+"\nreverseBytes "+Integer.reverseBytes(i));
	
		System.out.println("For long:\n\n bitcount:- "+Long.bitCount(l)+"\ntobinaryString:- "+Long.toBinaryString(l)+"\ntoOctal String: "+Long.toOctalString(l)+"\ntoHexString: "+Long.toHexString(l)+"\nhighestOneBit "+Long.highestOneBit(l)+"\nlowestOnebit: "+Long.lowestOneBit(l)+"\nNumberofleading zeros: "+Long.numberOfLeadingZeros(l)+"\nreverse: "+Long.reverse(l)+"\nreverseBytes "+Long.reverseBytes(l));

	
	
	}

}
