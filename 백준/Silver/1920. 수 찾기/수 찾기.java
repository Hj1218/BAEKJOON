import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            map.put(in.nextInt(),i);
        }
        int m=in.nextInt();
        for(int j=0;j<m;j++){
            if(map.containsKey(in.nextInt())){
                sb.append(1).append("\n");
            }
            else{
                sb.append(0).append("\n");
            }
        }
        System.out.print(sb);
    }
}