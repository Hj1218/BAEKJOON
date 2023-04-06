import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();
        int n = in.nextInt(); //연결리스트의 길이
        int m= in.nextInt(); //뽑으려는 숫자 개수
        int []num=new int[m]; //뽑으려는 숫자를 저장할 배열
        for(int i=1;i<=n;i++){
            q.add(i); //1~n까지 저장
        }
        for(int j=0;j<m;j++){
            num[j]=in.nextInt(); //배열에 뽑으려는 숫자 저장
        }
        int count=0; //2번횟수 + 3번횟수
        for(int k=0;k<m;k++){
            int a = q.indexOf(num[k]); //뽑으려는 숫자의 위치(인덱스)
            int mid; //큐의 중간 인덱스
            if(q.size()%2==0){ //남은 요소가 짝수개인 경우
                mid=q.size()/2-1; //ex) 1 2 3 4 5 6 인 경우 mid = 3 (인덱스=2)
            }else{ //남은 요소가 홀수개인 경우
                mid=q.size()/2; //ex) 1 2 3 인 경우 mid = 2 (인덱스 = 1)
            }
            if(a<=mid){ //뽑으려는 숫자가 중간 또는 앞에 있는 경우
                for(int l=0;l<a;l++){ //2번, 뽑으려는 숫자가 맨 왼쪽으로 올 때까지
                    int b = q.pollFirst(); //뽑으려는 숫자 앞에 있는 숫자를 저장해 제거하고
                    q.addLast(b); //뒤로 보내주고
                    count++; //카운트 증가
                }
            }
            else{ //뽑으려는 숫자가 뒤에 있는 경우
                for(int l=0;l<q.size()-a;l++){ //3번, 뽑으려는 숫자가 맨 왼쪽으로 올 때까지
                    int b=q.pollLast(); //뽑으려는 숫자 포함 뒤에 있는 숫자를 저장해 제거하고
                    q.addFirst(b); //앞으로 보내주고
                    count++; //카운트 증가
                }
            }
            q.pollFirst(); //뽑으려는 숫자가 맨 왼쪽으로 온 경우 숫자 뽑기
        }
        System.out.print(count);
    }
}