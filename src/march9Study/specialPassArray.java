package march9Study;

public class specialPassArray {
    public static void main(String[] args) {
        System.out.println(generatePass());
    }

    public static String generatePass() {
        String[][] pass = {{"A", "B", "C", "D", "E", "F", "G", "H"}, {"a", "b", "c", "d", "e", "f", "g", "h"}, {"@", "#", "-", "*", "^", "~", "."}, {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}};
        String password = "";
        int index;
        for (int i = 0; i < 3; i++) {
            index = (int) (Math.random() * pass[0].length);
            password += pass[0][index];

        }
        for (int i = 0; i < 3; i++) {
            index = (int) (Math.random() * pass[1].length);
            password += pass[1][index];
        }

            index = (int) (Math.random() * pass[2].length);
            password += pass[2][index];


        for (int i = 0; i < 4; i++) {
            index=(int)(Math.random()*pass[3].length);
            password+=pass[3][index];
    }
        return password;
    }}

