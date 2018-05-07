package ngocvx.codefight.exploringthewater;

/**
 * Two arrays are called similar
 * if one can be obtained from another
 * by swapping at most one pair of elements in one of the arrays.
 *
 * Given two arrays a and b, check whether they are similar.
 */
public class AreSimilar {

    public static void main(String[] args) {

        int[] a1 = {2, 3, 9};
        int[] b1 = {10, 3, 2};
        int[] a2 = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b2 = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};

        int[] a3 = {8, 998, 148, 570, 533, 561, 455, 147, 894, 3};
        int[] b3 = {12, 998, 148, 570, 533, 561, 455, 147, 894, 2};

        boolean value1 = areSimilar(a1, b1);
        boolean value2 = areSimilar(a2, b2);

        boolean value3 = areSimilar(a3, b3);
        boolean value4 = areSimilarGood(a3, b3);

        System.out.println("Value 1 = " + value1);
        System.out.println("Value 2 = " + value2);
        System.out.println("Value 3 = " + value3);
        System.out.println("Value 4 = " + value4);
    }

    // cách này hơi dài nhưng luôn đúng.
    static boolean areSimilar(int[] a, int[] b) {
        // check length 2 array
        if (a.length != b.length){
            return false;
        }

        int diffTimes = 0;
        int[] indexDiff = new int[3];

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                indexDiff[diffTimes] = i;
                diffTimes++;

                if (diffTimes > 2) {
                    return false;
                }
            }

        }

        if (diffTimes == 1){
            return false;
        }
        else if (diffTimes == 2){
            if ((a[indexDiff[0]] != b[indexDiff[1]]) || a[indexDiff[1]] != b[indexDiff[0]]) {
                return false;
            }
        }

        return true;
    }

    // cách này vẫn có điểm sai.
    static boolean areSimilarGood(int[] a, int[] b) {
        int rs = 0, s1 = 1, s2 = 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                rs++;
            s1 *= a[i];
            s2 *= b[i];
        }
        return rs <= 2 && s1 == s2;
    }
}
