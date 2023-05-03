import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> map = new HashMap<>();
        int count =0;
        for(int i=0;i<n;i++){
            String s = in.next();
            if(s.equals("ENTER")){
                map.clear();
            }
            else if(map.containsKey(s)){
                continue;
            }
            else{
                map.put(s,i);
                count++;
            }
        }
        System.out.print(count);
    }
}