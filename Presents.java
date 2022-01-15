import java.util.Arrays;
import java.util.Scanner;

public class Presents {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        // int[] new_arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            int element = sc.nextInt();
            arr[element-1] = i+1;

        }
     
        System.out.println(Arrays.toString(arr) 
        .replace(",", "")  
        .replace("[", "")  
        .replace("]", "")  
        .trim());



    }

   
}
