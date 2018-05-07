package ngocvx.codefight.exploringthewater;

/**
 * Given a string,
 * find out if its characters can be rearranged to form a palindrome.
 */
public class PalindromeRearranging {

    static boolean palindromeRearranging(String inputString) {
        /*
        StringBuilder sb = new StringBuilder(inputString);
        StringBuilder sbReverse = sb.reverse();
        return inputString.equals(sbReverse);
        */

        int[] characterArray = new int[26];
        int countOdd = 0;
        for (char c:inputString.toCharArray()) {
            characterArray[c-'a']++;
        }

        for (int count : characterArray
             ) {
            if (count%2 == 1) countOdd++;
        }

        return countOdd == 0 || (countOdd == 1 && inputString.length() % 2 == 1);
    }

    static int addTwoDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + n%10;
            n = n/10;
        }

        return sum;
    }
}
