import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0; //모든 숫자의 합
        int result=100;
        StringBuilder sb = new StringBuilder(); //난쟁이의 모자에 쓰인 수를 저장할 StringBuilder
        int [] arr = new int[9]; //아홉 난재이의 모자에 쓰인 수를 저장할 배열
        for(int i=0;i<9;i++){
            int num=in.nextInt(); //수를 입력 받아
            arr[i]=num; //배열에 저장하고
            sum+=num; //모든 수를 합한다.
        }
        boolean check=false;
        for(int j=0;j<9;j++){
            for(int k=0;k<9;k++){
                if(j==k){ //같은 경우 무시
                    continue;
                }
                else { //다른 경우
                    if(result==sum-(arr[j]+arr[k])){ //모든 합에서 두 수를 더한 값을 뺀 결과가 100인 경우
                        for(int i=0;i<9;i++){
                            if(i==j||i==k){ //두 수를 제외하고
                                continue;
                            }
                            sb.append(arr[i]).append("\n"); //나머지 수를 StringBuilder에 저장
                            check = true;
                        }

                    }
                }
            }
            if(check) {
                break;
            }
        }
        System.out.print(sb); //결과 출력
    }
}