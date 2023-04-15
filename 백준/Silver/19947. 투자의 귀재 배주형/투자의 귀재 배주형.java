import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int y = in.nextInt();
        long [] money = new long[y+1];
        money[0]= h;
        for(int i=1;i<=y;i++){
            money[i]= (long)Math.floor(money[i-1]*1.05);
            if(i>=3){
                money[i]= (long) Math.max(Math.floor(money[i-3]*1.2),money[i]);
            }
            if(i>=5){
                money[i]= (long) Math.max(Math.floor(money[i-5]*1.35),money[i]);
            }
        }
        System.out.print(money[y]);
    }
}