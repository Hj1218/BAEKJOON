import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<10;i++){
            int num = in.nextInt();
            map.put(i,num%42);
        }
        int count = 10;
        for(int j=0;j<10;j++){
            for(int k=j+1;k<10;k++){
                if(map.get(j)==map.get(k)){
                    count--;
                    break;
                }
            }
        }
        System.out.print(count);
    }
}