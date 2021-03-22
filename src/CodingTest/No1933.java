package swExpertAcademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No1933 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		 
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
 
        for (int i = 1; i * i <= num; i++) {
 
            if (num % i == 0) {
                arr.add(i);
                arr.add(num / i);
            }
        }
 
        Collections.sort(arr);
 
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }

	}

}
