import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        int w = in.nextInt();
        int s = in.nextInt();
        long count=0;
        if(2*w>=s){
            long min = Math.min(x,y);
            count+=min*s;
            x-=min;
            y-=min;
            if(w>s){
                if(Math.max(x,y)%2!=0){
                    count+=w;
                    count+=(Math.max(x,y)-1)*s;
                }
                else{
                    count+=Math.max(x,y)*s;
                }
            }
            else{
                count+=Math.max(x,y)*w;
            }
        }
        else{
            count= (x+y)*w;
        }
        System.out.println(count);
    }
}