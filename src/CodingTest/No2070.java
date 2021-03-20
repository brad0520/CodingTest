package javaStudy;

import java.util.Scanner;

public class No2070 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		int T = sc.nextInt(); 

		for (int i = 0; i < T; i++) {

			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 > num2) {
				str = ">";
			} else if (num1 < num2) {
				str = "<";
			} else {
				str = "=";
			}
			System.out.println("#" + (i + 1) + " " + str);
			
		}
	}
}
