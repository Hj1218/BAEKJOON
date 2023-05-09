import java.util.Scanner;

public class Main {
    public static int gcd(int x, int y){
        //유클리드 호제법 (최대 공약수 구하기)
        //gcd(x,y)=gcd(y,z)이고 z가 0이면 그때 y가 최대공약수
        while(y!=0){
            int z=x%y;
            x=y;
            y=z;
        }
        return x; //최대공약수
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //심어져 있는 가로수의 수
        int []num=new int[n]; //가로수가 심어진 위치
        for(int i=0;i<n;i++) {
            num[i] = in.nextInt();
        }
        int []a = new int[n-1]; //가로수가 심어진 간격
        for(int j=0;j<n-1;j++){
            a[j]=num[j+1]-num[j];
        }
        int g=0;
        for(int k=0;k<n-1;k++){
            g=gcd(a[k],g); //유클리드 호제법으로 최대공약수 구하기
        }
        int result=0;
        result = num[n-1]-num[0]; //전체 거리
        result = result/g; //전체거리를 최대공약수로 나눈 값이 필요한 가로수의 수
        result = result-n+1; //이미 심어져 있는 가로수의 수를 빼준 값이 심어야 하는 가로수의 수 
        System.out.print(result);
    }
}