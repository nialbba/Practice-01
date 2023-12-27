package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println(13/5);
		//->실수형이 들어가지 않아 정수형인 2의 값만 출력.
		System.out.println((double)13/5);
		System.out.println(13/(double)5);
		System.out.println((double)13/(double)5);
		System.out.println(13.0/5);
		System.out.println(13/5.0);
		System.out.println((double)(13/5));
		//->실수형인 double이 들어가 있긴 하나 13/5를 ()로 가두어 정수값인 2가 출력된 뒤에 적용되었기에 2.0으로 출력.
		
		
		
	}
}
