package com.javaex.practice;

public class Ex21 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2;
		
		System.out.println(i);
		//11
		System.out.println(n);
		//1
		
		//Ex20문제와 다른 점->++이 접두로 적용되어 n식에서 먼저 적용됨.
	}

}
