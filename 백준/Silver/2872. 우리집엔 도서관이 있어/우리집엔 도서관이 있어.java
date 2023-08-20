import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []num = new int[n];
        int max = n;
        int index=0;
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
            if(num[i]==n){
                index = i;
            }
        }
        int count=1;
        for(int j=index;j>=0;j--){
            if(num[j]==max-1){
                max--;
                count++;
            }
        }
        System.out.println(n-count);
    }
}