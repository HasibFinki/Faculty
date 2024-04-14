import java.util.List;

public class SILab1_2 {

    private static String makeBigStringFrom (List<String> list, int minLength) {
        StringBuilder sb = new StringBuilder();
        if (el.length() % 2 != 0) { // Changed condition to check for odd length
            if (el.length() < minLength) {
                sb.append(el);
            }
        }
        return sb.toString();
    }
}