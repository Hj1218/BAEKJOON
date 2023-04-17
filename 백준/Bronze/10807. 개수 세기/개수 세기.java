import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        int v = in.nextInt();
        if(map.containsKey(v)){
            System.out.print(map.get(v));
        }
        else{
            System.out.print(0);
        }
    }
}