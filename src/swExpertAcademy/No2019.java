package swExpertAcademy;

import java.util.Scanner;

public class No2019 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 1;
		
		for (int i = 0; i<=num; i++) {
			System.out.print( result + " " );
			result = result*2;
		}

	}

}
