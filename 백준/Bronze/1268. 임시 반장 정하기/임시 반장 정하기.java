import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stu = in.nextInt(); //학생 수
        int [][] cla=new int[stu][5]; //학생들의 반을 저장할 배열
        for(int i=0;i<stu;i++){ //학생
            for(int j=0;j<5;j++){ //학년
                cla[i][j]=in.nextInt(); //입력 받은 반 정보를 배열에 저장
            }
        }
        int count=0; //같은 반이었던 학생 수
        int [] num=new int[stu]; //학생들의 count를 저장할 배열
        for(int i=0;i<stu;i++){ //학생
            Set<Integer> s = new HashSet<>(); //중복되는 학생을 제거하기 위한 hashset
            for(int j=0;j<5;j++){ //학년
                for(int k=0;k<stu;k++){ //다른 학생
                    if(i==k){
                        continue;
                    } else if (cla[i][j]==cla[k][j]) { //같은 반을 했던 학생이 존재하면
                        s.add(k);
                    }
                }
            }
            num[i]=s.size(); //배열에 중복 제거한 학생 수를 저장
        }
        int max= num[0]; //count값 비교를 위한 최대값 설정
        int index=0; //최대값의 인덱스 , 학생 번호 -1
        for(int l=0;l<num.length;l++){
            if(num[l]>max){ //최대값보다 큰 경우
                max=num[l]; //최대값 변경
                index=l; //인덱스 변경
            }
        }
        System.out.print(index+1); //인덱스가 0부터 시작했기 때문에 +1
    }
}