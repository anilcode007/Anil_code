package com.assignment;

import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		int len = A.length();
		String rev = "";
		for (int i = len - 1; i >= 0; i--) {
			rev += A.charAt(i);
		}
		if (A.equals(rev)) {
			System.out.println("YES");
		}else {
			System.out.println(rev);
		}
	}

}
