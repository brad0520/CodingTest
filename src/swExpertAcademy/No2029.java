package swExpertAcademy;

import java.util.Scanner;

public class No2029 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int pass = sc.nextInt();
		int input = sc.nextInt();
		int count = 0;

		for (int i = input; i <= pass; i++) {
			count += 1;
		}
		System.out.print(count);
	}

}
