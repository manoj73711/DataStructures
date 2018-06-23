package com.syntel.datastructures.stack;

public class CharStackApp {

	/*
	 * This solution is first outcome which really using the one additional data
	 * structure
	 * 
	 * public static String reverse(String input) {
	 * 
	 * CharStack charStack=new CharStack(input.length()); char[]
	 * inputArray=input.toCharArray();
	 * 
	 * for(int i=0;i<inputArray.length;i++) { charStack.push(inputArray[i]); }
	 * 
	 * input="";
	 * 
	 * for(int i=0;i<inputArray.length;i++) { input=input+charStack.pop(); }
	 * 
	 * return input;
	 * 
	 * }
	 */

	public static String reverse(String input) {

		int size = input.length();
		CharStack charStack = new CharStack(size);

		for (int i = 0; i < size; i++) {
			charStack.push(input.charAt(i));
		}

		input = "";

		for (int i = 0; i < size; i++) {
			input = input + charStack.pop();
		}

		return input;

	}

	public static void main(String[] args) {

		System.out.println(reverse("Om Nama Shivaya"));
	}
}
