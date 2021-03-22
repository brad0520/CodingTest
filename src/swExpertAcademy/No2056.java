package swExpertAcademy;

import java.util.Scanner;

public class No2056 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 1; i <= T; i++) {

			String date = sc.next();
			String year = date.substring(0, 4);
			String month = date.substring(4, 6);
			String day = date.substring(6, 8);
			String result = year + "/" + month + "/" + day;

			int d = Integer.parseInt(day);

			switch (month) {
			case "01":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "02":
				if (d <= 28) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "03":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "04":
				if (d <= 30) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "05":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "06":
				if (d <= 30) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "07":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "08":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "09":
				if (d <= 3) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "10":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "11":
				if (d <= 30) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			case "12":
				if (d <= 31) {
					System.out.println("#" + i + " " + result);
					break;
				} else {
					System.out.println("#" + i + " " + -1);
					break;
				}
			default:
				System.out.println("#" + i + " " + -1);
				break;
			}
		}
	}
}
