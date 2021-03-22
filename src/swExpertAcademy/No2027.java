package swExpertAcademy;

public class No2027 {

	public static void main(String[] args) throws Exception {

		int num = 5;
		
		for (int i = 1; i <= num; i++) {

			for(int j = i-1; j>0; j--) {
				System.out.print("+");
			}			
			
			System.out.print("#");
			
			for(int k = num-i; k>0; k--) {
				System.out.print("+");
			}
			
			System.out.println("");
		}

	}

}
