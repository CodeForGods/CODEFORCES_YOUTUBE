import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Isyourhorseshoeontheotherhoof {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Set<Integer> mySet = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            mySet.add(Integer.valueOf(sc.nextInt()));
        }
        System.out.println(4-mySet.size());
        
    }
}
