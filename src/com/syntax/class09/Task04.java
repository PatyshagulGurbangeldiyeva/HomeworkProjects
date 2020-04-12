package com.syntax.class09;

public class Task04 {

	public static void main(String[] args) {
		//Print odd numbers between 20 and 50 (2ways)

		
		System.out.println("FIRST WAY");
		int a=20;
		while (a<=50) {
			if (a%2==1) {
				System.out.print(a+" ");
			}
			a++;
		}
		
		System.out.println();
		System.out.println("SECOND WAY");
		
		for (int z=20;z<=50;z++) {
			if (z%2==1) {
				System.out.print(z+" ");
			}
		}
		
	}

}
