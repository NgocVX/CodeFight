package ngocvx.codefight.exploringthewater;

/**
 * Tính tổng các phần tử ở vị trí chẵn và các phần tử ở vị trí lẻ trong mảng.
 *
 * @author NGOC-VX
 */
public class AlternatingSums {
    static int[] alternatingSums(int[] a) {
        int[] sums = new int[2];
        for (int i = 0; i < a.length; i++) {
            sums[i%2] += a[i];
        }

        return sums;
    }

    public static void main(String[] args) {
        int[] a = {50, 60, 60, 45, 70};
        int[] sumsA = alternatingSums(a);
        showArray(sumsA);
    }

    static void showArray(int[] a) {
        for (int i : a
             ) {
            System.out.printf(i + "\t");
        }
    }
}
