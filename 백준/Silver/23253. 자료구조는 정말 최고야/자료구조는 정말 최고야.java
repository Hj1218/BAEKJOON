import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //교과서의 수
        int m = in.nextInt(); //더미의 수
        boolean flag = false; //올바른 순서로 꺼낼 수 있다면 false
        for(int i=0;i<m;i++){
            int k = in.nextInt(); //더미에 쌓인 교과서의 수
            int [] num=new int[k]; //교과서 번호를 저장할 배열
            for(int j=0;j<k;j++){ //아래에 있는 교과서 번호부터
                num[j]=in.nextInt(); //배열에 저장
            }
            for(int l=1;l<k;l++){
                if(num[l]>num[l-1]){ //위에 있는 교과서가 아래 교과서 번호보다 크다면
                    flag = true; //올바른 순서로 꺼낼 수 없다
                    break;
                }
            }
        }
        if(flag){ //올바른 순서로 꺼낼 수 없으면
            System.out.print("No"); //No 출력
        }else{ //꺼낼 수 있다면
            System.out.print("Yes"); //Yes 출력
        }
    }
}