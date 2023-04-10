import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=in.nextInt();
        }
        int sum=0;
        for(int j=0;j<10;j++){
            sum=sum+num[j];
            if(sum==100){
                System.out.print(100);
                break;
            }
            else if(sum>100){
                int a = sum-100;
                int b = 100-sum+num[j];
                if(a>b){
                    System.out.print(sum-num[j]);
                    break;
                }
                else if(a<b){
                    System.out.print(sum);
                    break;
                }
                else{
                    System.out.print(sum);
                    break;
                }
            }
        }
        if(sum<100){
            System.out.print(sum);
        }
    }
}