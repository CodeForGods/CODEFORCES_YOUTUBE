import java.util.Scanner;

public class Hulk{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
       
       
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                if(i!=n-1){
                 s+="I hate that ";
                }
                else{
                    s+="I hate it";
                }


            }
            else{
                if(i!=n-1){
                    s+="I love that ";
                }else{
                    s+="I love it";
                }
            }
        }
        System.out.println(s);
    }


    
}