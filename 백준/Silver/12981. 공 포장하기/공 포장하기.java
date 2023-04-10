import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int g = in.nextInt();
        int b = in.nextInt();
        int count = 0;
        while(true){
            r--;
            g--;
            b--;
            count ++;
            if((r==0)||(g==0)||(b==0)){
                break;
            }
        }
        if(r!=0){
            count +=r/3;
            r=r%3;
        }
        if(g!=0){
            count +=g/3;
            g=g%3;
        }
        if(b!=0){
            count +=b/3;
            b=b%3;
        }

        if(r!=0){
            count++;
            if((r==g)&&(r+g==2)){
                g=0;
            }
            else if((r==b)&&(r+b==2)){
                b=0;
            }
            r=0;
        }
        if(g!=0){
            count++;
            if((g==b)&&(g+b==2)){
                b=0;
            }
            g=0;
        }
        if(b!=0){
            count++;
            b=0;
        }
        System.out.print(count);
    }
}
