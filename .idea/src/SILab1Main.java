import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.*;

public class SILab1Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }

        // Add call to makeBigStringFrom method
        System.out.println(SILab1_2.makeBigStringFrom(list));
        String bigString = SILab1_2.makeBigStringFrom(list, minLength);
        System.out.println(bigString);
    }
}
