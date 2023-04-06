import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //펼쳐진 카드의 개수
        HashMap<String, Integer> map = new HashMap<>(); 
        String[] f = {"STRAWBERRY","BANANA","LIME","PLUM"}; //존재하는 과일
        for(int j=0;j<4;j++){
            map.put(f[j],0); //해쉬맵에 과일 이름과 초기값 0 저장
        }
        for(int i=0;i<n;i++){
            String fruit = in.next(); //과일 이름
            int num= in.nextInt(); //개수
            map.put(fruit,map.get(fruit)+num); //과일개수 추가 
        }
        boolean flag = false;
        for(int k=0;k<4;k++){
            if(map.get(f[k])==5){ //개수가 5인 과일이 존재하면
                flag= true; 
            }
        }
        if(flag){ //개수가 5일 과일이 존재하는 경우
            System.out.print("YES"); //yes 출력
        }
        else{ //존재하지 않는 경우
            System.out.print("NO"); //no출력
        }
    }
}