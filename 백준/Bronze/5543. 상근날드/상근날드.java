import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] b = new int[3];
        int [] d = new int[2];
        for(int i=0;i<3;i++){
            b[i]=in.nextInt();
        }
        int minb=b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]<minb){
                minb=b[i];
            }
        }
        for(int j=0;j<2;j++){
            d[j]=in.nextInt();
        }
        int mind=d[0];
        for(int j=0;j<d.length;j++){
            if(d[j]<mind){
                mind=d[j];
            }
        }
        System.out.print(minb+mind-50);
    }
}