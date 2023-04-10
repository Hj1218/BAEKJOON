import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            int a=in.nextInt();
            for(int j=2;j<a;j++){
                if(a%j==0){
                    flag=true;
                    break;
                }
            }
            if(a==1){
                flag=true;
            } else if (!flag) {
                count++;
            }
        }
        System.out.print(count);
    }
}