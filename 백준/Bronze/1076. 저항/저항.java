import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> value = new HashMap<>();
        String [] color = {"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
        for(int i =0;i<color.length;i++){
            value.put(color[i],i);
        }
        String c1=in.next();
        String c2=in.next();
        String c3=in.next();
        long result = 0;
        result=value.get(c1)*10;
        result+=value.get(c2);
        result*=Math.pow(10,value.get(c3));
        System.out.print(result);
    }
}