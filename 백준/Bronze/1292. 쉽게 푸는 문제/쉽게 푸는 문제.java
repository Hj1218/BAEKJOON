import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int [] num = new int[1001];
        int count =1;
        for(int i=1;i<=1000;i++){
            for(int j=0;j<i;j++){
                if(count==1001){
                    break;
                }
                num[count]=i;
                count++;
            }
        }
        int sum = 0;
        for(int i=A;i<=B;i++){
            sum+=num[i];
        }
        System.out.println(sum);
    }
}