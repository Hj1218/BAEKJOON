import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(num[i]>num[j]){
                    int a = num[i];
                    num[i]=num[j];
                    num[j]=a;
                }
            }
        }
        for(int k=0;k<num.length;k++){
            System.out.println(num[k]);
        }
    }
}