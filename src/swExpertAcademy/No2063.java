package swExpertAcademy;

import java.util.ArrayList;
import java.util.Scanner;

public class No2063 {

	public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> arr = new arrayList<>();
        
        int T = sc.nextInt();
        
        for (int i=0; i<T; i++) {
        	arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        System.out.println(arr[T/2]);
	}

}
