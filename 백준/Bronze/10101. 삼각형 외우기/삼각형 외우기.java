import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        for(int i=0;i<3;i++){
            int a=in.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
            sum+=a;
        }
        if(map.containsKey(60)&&map.size()==1){
            System.out.println("Equilateral");
        } else if (sum==180&&map.size()==2) {
            System.out.println("Isosceles");
        } else if (sum==180&&map.size()==3) {
            System.out.println("Scalene");
        } else if (sum!=180) {
            System.out.println("Error");
        }
    }
}