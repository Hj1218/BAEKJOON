import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //거스름돈 n
        int coin5=0; //5원 동전 개수
        int coin2=0; //2원 동전 개수
        if(n==1||n==3){ //거스름돈 n이 1 or 3인 경우
            System.out.print(-1);
        }
        else if((n/5)%2==0){ //거스름돈을 5로 나눈 몫이 짝수이고
            if((n%5)%2==0){ //나머지가 짝수이면
                coin5=n/5;
                n=n%5;
                coin2=n/2;
                System.out.print(coin5+coin2);
            }
            else{ //나머지가 홀수이면
                coin5=(n/5)-1;
                n=n-(5*coin5);
                coin2=n/2;
                System.out.print(coin5+coin2);
            }
        }
        else if((n/5)%2==1){ //거스름돈을 5로 나눈 몫이 홀수이고
            if((n%5)%2==0){ //나머지가 짝수이면
                coin5=n/5;
                n=n%5;
                coin2=n/2;
                System.out.print(coin5+coin2);
            }
            else{ //나머지고 홀수이면
                coin5=(n/5)-1;
                n=n-(5*coin5);
                coin2=n/2;
                System.out.print(coin5+coin2);
            }
        }
    }
}