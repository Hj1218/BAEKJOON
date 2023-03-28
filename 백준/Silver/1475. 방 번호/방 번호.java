import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num=in.next();
        int [] arr= new int[10];
        char []c=num.toCharArray();
        for(int i=0;i<num.length();i++){
            int n=c[i]-'0';
            if(n==6){
                arr[9]++;
            }
            else{
                arr[n]++;
            }
        }
        arr[9]=(arr[9]/2)+(arr[9]%2);
        Arrays.sort(arr);
        System.out.print(arr[9]);
    }
}