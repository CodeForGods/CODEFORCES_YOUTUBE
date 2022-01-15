import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s = "";

        for (int i = 0; i < a.length(); i++) {
            if(String.valueOf(a.charAt(i)).equals(String.valueOf(b.charAt(i)))){
                s+="0";
            }
            else{
                s+="1";
            }
            
        }
        
        System.out.println(s);

    }
    
}
