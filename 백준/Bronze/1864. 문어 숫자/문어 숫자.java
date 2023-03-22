import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        char a[] = {'/', '-', '\\', '(', '@', '?', '>', '&', '%'};
        for (int i = 0; i < a.length; i++) {
            map.put(a[i], i - 1);
        }
        String[] b = new String[100];
        int count = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            String c = in.next();
            if (c.equals("#")) {
                break;
            } else {
                b[count] = c;
                count++;
            }
        }
        int sum = 0;
        for(int j=0;j<count;j++){
            if(b[j]!=null){
                char [] d = b[j].toCharArray();
                for(int k=0;k<d.length;k++){
                    sum+=map.get(d[k])*Math.pow(8,d.length-k-1);
                }
            }
            System.out.println(sum);
            sum=0;
        }
    }
}