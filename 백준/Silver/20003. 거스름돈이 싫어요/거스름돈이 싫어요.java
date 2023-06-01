import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //아이템의 개수
        long [] bj = new long[n]; //분자 배열
        long [] bm = new long[n]; //분모 배열
        long [] bb = new long[n]; //분모 배열
        for(int i=0;i<n;i++){
            bj[i]=in.nextLong(); //분자 저장
            bm[i]=in.nextLong(); //분모 저장
            bb[i]=bm[i]; //분모 저장
        }
        long bmgcd=1; //분모의 최대공약수를 위한 변수
        for(int i=1;i<n;i++){
            bmgcd=gcd(bm[i],bm[i-1]); //최대 공약수를 구해
            bm[i]=bm[i]*bm[i-1]/bmgcd; //bm[i]에 최소공배수를 저장하고 다음 배열 값과의 최소공배수 구하기를 반복
            //최소공배수는 모두 곱한 값을 최대공약수로 나눈 값
        }
        long [] b = new long[n]; //분자 배열
        for(int i=0;i<n;i++){
            b[i]=bm[n-1]/bb[i]*bj[i];
        }
        long bjgcd=b[0];
        for(int i=1;i<n;i++) {
            bjgcd = gcd(b[i], b[i - 1]); //최대 공약수를 구해
            b[i]=bjgcd; //b[i]에 그 값을 저장하고 다음 배열 값과의 최대 공약수 구하기를 반복
        }
        long c = gcd(bjgcd,bm[n-1]); //출력 값을 기약분수 꼴로 만들어주기 위한 변수
        System.out.print(bjgcd/c+" "+bm[n-1]/c); //최대공약수로 나눠 기약분수 꼴로 출력
    }
    public static long gcd(long num1, long num2){ //유클리드 호제법 (최대공약수 구하기)
        if(num1%num2==0){
            return num2;
        }
        return gcd(num2,num1%num2);
    }
}