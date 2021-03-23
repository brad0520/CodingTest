package swExpertAcademy;

import java.util.Scanner;

public class No2071 {

	public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i=1; i<=T; i++) {
        	Double sum = 0.0;
        	for (int j=0; j<10; j++) {
        		sum += sc.nextInt();
        	}
        	int avg = (int) Math.round(sum / 10);
        	System.out.println("#" + i + " " + avg);
        }
        
	}

}
