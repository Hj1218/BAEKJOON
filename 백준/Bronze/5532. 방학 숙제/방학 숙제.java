import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L=0,A = 0,B=0,C=0,D=0; //방학일수, 국어페이지 , 수학페이지 , 국어 최대, 수학 최대
        L=in.nextInt();
        A=in.nextInt();
        B=in.nextInt();
        C=in.nextInt();
        D=in.nextInt();
        int lan=0; //최소 국어를 풀어야하는 일수
        int mat=0; //최소 수학을 풀어야하는 일수
        lan=A/C;
        if(A%C!=0) {
            lan += 1;
        }
        mat=B/D;
        if(B%D!=0){
            mat+=1;
        }
        int a =0; // 놀 수 있는 날
        if(lan>mat){
            a=L-lan;
            System.out.println(a);
        } else if (lan<mat) {
            a=L-mat;
            System.out.println(a);
        }else {
            a=L-lan;
            System.out.println(a);
        }
    }
}