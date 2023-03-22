import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        ArrayList<Integer> c = new ArrayList<>();
        while (true) {
            String a = in.nextLine();
            if (a.equals("#")) {
                break;
            }
            char[]arr={'A','E','I','O','U','a','e','i','o','u'};
            for (int i = 0; i < a.length(); i++) {
                char b = a.charAt(i);
                for (int j = 0; j < arr.length; j++) {
                    if (b == arr[j]) {
                        sum++;
                    }
                }
            }
            c.add(sum);
            sum=0;
        }
        for(int k=0;k<c.size();k++){
            System.out.println(c.get(k));
        }
    }
}