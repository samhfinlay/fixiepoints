package fixiepoints;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class data {

    public static int partScore(ArrayList<parts> listVal, String input) {
        for (int i = 0; i < listVal.size(); i++) {
            if (listVal.get(i).getPart().equals(input)) {
                return listVal.get(i).getScore();
            }
        }
        return 5;
    }

    public static String getInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static String[] toLowerCase(String[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            list[i].toLowerCase();
        }
        return list;
    }

    public static boolean isSamsBike(String[] parts) {
        if (
                parts[0].equals("all city") &&
                        parts[1].equals("sugino pista") &&
                        parts[2].equals("mavic") &&
                        parts[3].equals("origin 8") &&
                        parts[4].equals("straps") &&
                        parts[5].equals("no")
        ) {
            return true;
        } else {
            return false;
        }

    }

}
