package swExpertAcademy;

import java.util.Scanner;

public class No2029 {

	public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
 
        for (int i = 1; i <= T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("#" + i + " ");
            System.out.print(a / b + " ");
            System.out.println(a % b);
 
        }
	}

}
