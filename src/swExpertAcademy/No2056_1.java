package swExpertAcademy;

import java.util.Scanner;

public class No2056_1 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			String date = sc.next();
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			String result = year + "/" + month + "/" + day;

			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);
			int check = -1;
			
			switch (m) {
			case 1:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 2:
				if (d <= 28) {
					check = 1;
					break;
				}
			case 3:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 4:
				if (d <= 30) {
					check = 1;
					break;
				}
			case 5:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 6:
				if (d <= 30) {
					check = 1;
					break;
				}
			case 7:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 8:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 9:
				if (d <= 3) {
					check = 1;
					break;
				}
			case 10:
				if (d <= 31) {
					check = 1;
					break;
				}
			case 11:
				if (d <= 30) {
					check = 1;
					break;
				}
			case 12:
				if (d <= 31) {
					check = 1;
					break;
				}
			default:
				break;
			}
			
			if (check == 1) {
				System.out.println("#" + i + " " + result);
			} else {
				System.out.println("#" + i + " " + -1);
			}
		}
	}
}
