import java.util.Scanner;

public class InSearchofanEasyProblem {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if(val==1){
                flag =1;
                break;

            }  
        }
        if(flag==1){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }

    }
}
