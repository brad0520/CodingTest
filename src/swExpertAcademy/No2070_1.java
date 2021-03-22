package swExpertAcademy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class No2070_1 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int tc = Integer.parseInt(br.readLine());
        for (int i = 1; i <= tc; i++) {
            double sum = 0;
            String[] sp = br.readLine().split(" ");
            int a = Integer.parseInt(sp[0]);
            int b = Integer.parseInt(sp[1]);
            String res = "";
            if (a < b) {
                res = "<";
            } else if (a > b) {
                res = ">";
            } else {
                res = "=";
            }
 
            sb.append("#" + i + " " + res + "\n");
        }
        System.out.println(sb.toString());
    }
 
}
