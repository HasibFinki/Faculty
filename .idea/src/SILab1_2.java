import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
<<<<<<< HEAD
        if (el.length() % 2 != 0) { // Changed condition to check for odd length
=======
        if (el.length() >= minLength) { // Changed condition to check if length is >= minLength
>>>>>>> e762925 (Call method makeBigStringFrom in main class)
            if (el.length() < minLength) {
                sb.append(el);
            }
        }
        return sb.toString();
    }
}