import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        int []num = new int[n];
        int []change = new int[n];
        for(int i=0;i<n;i++){
            num[i]=change[i]=in.nextInt();
        }
        Arrays.sort(change);
        int rank = 0;
        for(int a : change){
            if(!map.containsKey(a)){
                map.put(a,rank);
                rank++;
            }
        }
        for(int b : num){
            int ranking = map.get(b);
            sb.append(ranking).append(" ");
        }
        System.out.println(sb);
    }
}