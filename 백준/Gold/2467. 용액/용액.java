import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //전체 용액의 수 n
        long [] num = new long[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt(); //용액들의 특성값 저장
        }
        int start =0; //시작 인덱스
        int end =n-1; //끝 인덱스
        long min= 2000000000; //최솟값 비교를 위한 변수
        int l=0; //왼쪽 인덱스
        int r=0; //오른쪽 인덱스
        while(start<end){
            long sum = num[start]+num[end];
            if(min>Math.abs(sum)){ //sum의 절대값이 min보다 작은 경우
                min=Math.abs(sum); //최솟값 변경
                l=start; //최솟값일 때 왼쪽 인덱스와
                r=end; //최솟값일 때 오른쪽 인덱스 저장
            }
            if(sum<0){ //합이 0보다 작은 경우
                start++; //왼쪽 인덱스를 +1 (오름차순이라 오른쪽이 더 큰 값)
            }
            else{ //합이 0보다 크거나 같은 경우
                end--; //오른족 인덱스를 -1 (오름차순이라 왼쪽이 더 작은 값)
            }
        }
        System.out.print(num[l]+" "+num[r]);
    }
}