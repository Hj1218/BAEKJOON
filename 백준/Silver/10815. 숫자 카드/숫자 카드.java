import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //상근이가 가지고 있는 카드의 개수 n
        int [] num = new int[n]; //카드에 적힌 숫자
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        Arrays.sort(num); //오름차순 정렬
        int m = in.nextInt(); //비교할 카드의 개수 m
        int [] check = new int[m]; //카드에 적힌 숫자
        for(int i=0;i<m;i++){
            check[i]=in.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<m;i++){ //비교할 카드의 개수만큼
            int start=0;
            int end=n-1;
            boolean flag = false; //카드 존재 여부
            while(start<=end){
                int mid = (start+end)/2;
                if(num[mid]==check[i]){ //카드가 존재하면
                    sb.append(1).append(" "); //1 저장
                    flag = true;
                    break;
                }
                if(num[mid]<check[i]){ //비교할 숫자가 상근이가 가지고 있는 숫자보다 큰 경우
                    start = mid+1;
                }
                else{ //비교할 숫자가 상근이가 가지고 있는 숫자보다 작은 경우
                    end = mid-1;
                }
            }
            if(!flag){ //카드가 존재하지 않는 경우
                sb.append(0).append(" "); //0 저장
            }
        }
        System.out.print(sb);
    }
}