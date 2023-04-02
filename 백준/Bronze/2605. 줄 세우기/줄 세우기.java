import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); //학생의 수
        int [] num = new int[a]; //학생 번호
        int [] ch=new int[a]; //학생이 뽑은 번호
        for(int i =0;i<a;i++){
            num[i]=i+1; //학생 번호를 배열에 저장
            int b=in.nextInt(); //학생이 뽑은 번호를 입력받아
            ch[i]=b; //배열에 저장
        }
        int c=0;
        for(int j=0;j<a;j++){
            c=num[j]; //이동할 학생 번호
            for(int k=j;k>j-ch[j];k--){ //이동하려는 위치에 있는 학생부터
                num[k]=num[k-1]; //한칸씩 뒤로 이동
            }
            num[j-ch[j]]=c; //이동하려는 위치에 학생번호 저장
        }
        for(int l=0;l<a;l++){
            System.out.print(num[l]+" "); //결과 출력
        }
    }
}