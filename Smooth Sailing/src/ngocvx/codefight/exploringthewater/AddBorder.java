package ngocvx.codefight.exploringthewater;

import java.util.Arrays;

/**
 * Given a rectangular matrix of characters,
 * add a border of asterisks(*) to it.
 */

public class AddBorder {

    public static void main(String[] args) {
        String[] a = {"abc",
                "ded"};
        String[] b = addBorder(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }

    static String[] addBorder(String[] picture) {

        String[] borderPicture = new String[picture.length + 2];

        /*String boder = "";
        for (int i = 0; i < picture[0].length() + 2; i++) {
            boder = boder + "*";
        }
        borderPicture[0] = boder;
        borderPicture[picture.length + 1] = boder;
        */
        int newLength = picture[0].length()+2;
        char[] line = new char[newLength];
        Arrays.fill(line, '*');

        borderPicture[0] = new String(line);
        borderPicture[picture.length + 1] = borderPicture[0];

        for (int i = 0; i < picture.length; i++) {
            String s = "*" + picture[i] + "*";
            borderPicture[i+1] = s;
        }

        return borderPicture;
    }
}
