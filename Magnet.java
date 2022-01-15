import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int temp = 0;
        int count = 1;
        for (int i = 0; i < n; i++) {
            
            int magnet = sc.nextInt();
            if(temp==0){
                temp = magnet;
            }
            if(temp!=magnet){
                count+=1;
                temp = magnet;
            }

        }
        System.out.println(count);
    }
    
}
