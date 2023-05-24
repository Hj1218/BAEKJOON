import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //나무의 수 n
        int m = in.nextInt(); //나무의 길이 m
        long [] num = new long[n];
        long end = 0;
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
            end = Math.max(end,num[i]);
        }
        long start = 0;
        long mid = 0;
        while(start<=end){
            long count = 0;
            mid=(start+end)/2;
            for(int i=0;i<n;i++){
                if(mid<num[i]){
                    count+=num[i]-mid;
                }
            }
            if(count<m){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        System.out.print(end);
    }
}