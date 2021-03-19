package swExpertAcademy;

import java.util.Arrays;
import java.util.Scanner;

public class No2072 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {
			int[] arr = new int[10];

			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int sum = Arrays.stream(arr).filter(j -> j % 2 == 1).sum();
			System.out.println("#" + i + " " + sum);

		}
		
		sc.close();
	}

}
