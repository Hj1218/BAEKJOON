import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int []num1 = new int[8];
        int []num2 = new int[8];
        for(int i=0;i<8;i++){
            int a = in.nextInt();
            num1[i]=num2[i]=a;
        }
        Arrays.sort(num2);
        int []arr = new int[3];
        for(int i=0;i<3;i++){
            for(int j=0;j<num1.length;j++){
                if(num2[i]==num1[j]){
                    arr[i]=j;
                }
            }
        }
        int sum=0;
        for(int i=0;i<num1.length;i++){
            if(i==arr[0]||i==arr[1]||i==arr[2]){
                continue;
            }
            sum+=num1[i];
        }
        System.out.println(sum);
        for(int i=0;i<num1.length;i++){
            if(i==arr[0]||i==arr[1]||i==arr[2]){
                continue;
            }
            System.out.print(i+1+" ");
        }
    }
}