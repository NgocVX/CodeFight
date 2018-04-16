package ngocvx.codefight.smoothsailing;

public class ReverseParentheses {
    static String reverseParenthesesGood(String s) {

        int bracketStart, bracketEnd;
        StringBuilder stringBuilder;

        bracketStart = s.lastIndexOf("(");

        while (bracketStart != -1) {
            bracketEnd = s.indexOf(")", bracketStart);
            String temp = s.substring(bracketStart+1, bracketEnd);
            temp = reverseString(temp);

            stringBuilder = new StringBuilder(s);
            stringBuilder.replace(bracketStart, bracketEnd+1, temp);
            s = stringBuilder.toString();
            bracketStart = s.lastIndexOf("(");
        }

        return s;
    }

    static String reverseParentheses (String s) {
        System.out.println(s);
        /***
         * Stupid code - Wrong
        // kiểm tra S có chứa dấu ngoặc ko, nếu ko return
        if (!s.contains("(")) {
            return s;
        }

        StringBuilder strBuider = new StringBuilder(s);
        int bracketStart;
        int bracketEnd;

        bracketStart = s.indexOf("(");
        bracketEnd = s.lastIndexOf(")");
        if (bracketEnd <  0) {
            return s;
        }

        System.out.println(bracketStart);
        System.out.println(bracketEnd);

        String str1 = strBuider.substring(bracketStart+1, bracketEnd);
        System.out.println(str1);

        StringBuilder strBuilder1 =new StringBuilder(str1);

        if (str1.contains("(")) {
            return (strBuider.replace(bracketStart, bracketEnd+1, reverseString(reverseParentheses(str1)))).toString();
        } else {
          //strBuilder1 = new StringBuilder(str1);;
          return (strBuider.replace(bracketStart, bracketEnd+1, reverseString(str1))).toString();
        }
        //StringBuilder strResult = strBuider.replace(bracketStart, bracketEnd+1, reverseString(str1));

        //return strResult.toString();
        **/

        int bracketStart = 0;
        int bracketEnd = s.length()-1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                bracketStart = i;
            }
            if (s.charAt(i) == ')') {
                bracketEnd = i;
                String tem  = s.substring(bracketStart+1, bracketEnd);
                return reverseParentheses(s.substring(0, bracketStart) + reverseString(tem) + s.substring(bracketEnd+1));
            }
        }
        return s;
    }

    static String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return  sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("a(b(ef)c)d"));
        System.out.println("--");
        System.out.println(reverseParenthesesGood("a(b(ef)c)d"));
        System.out.println("-----------------");
        System.out.println(reverseParentheses("abc(cba)ab(bac)c"));
        System.out.println("--");
        System.out.println(reverseParenthesesGood("abc(cba)ab(bac)c"));
    }
}
