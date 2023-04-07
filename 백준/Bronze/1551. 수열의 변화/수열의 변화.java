import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        StringTokenizer st = new StringTokenizer(in.next(), ",");
        for (int j = 0; j < n; j++) {
            a[j] = Integer.parseInt(st.nextToken());
        }
        int[] b = new int[0];
        while (k != 0) {
            b = new int[a.length - 1];
            for (int i = 0; i < a.length - 1; i++) {
                b[i] = a[i + 1] - a[i];
            }
            a = new int[b.length];
            for (int j = 0; j < b.length; j++) {
                a[j] = b[j];

            }
            k--;
        }
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i]);
            } else {
                System.out.print(a[i] + ",");
            }
        }
    }
}
