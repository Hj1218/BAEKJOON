import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //듣도 못한 사람 수
        int m = in.nextInt(); //보도 못한 사람 수
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(in.next(),i); //듣도 못한 사람을 해쉬맵에 저장
        }
        ArrayList<String> list = new ArrayList<>(); //듣보잡을 저장하기 위한 동적 배열
        for(int j=0;j<m;j++){
            String s = in.next();
            if(map.containsKey(s)){ //입력 받는 보도 못한 사람이 해쉬맵에 존재하면
                list.add(s); //듣보잡 저장
            }
        }
        Collections.sort(list); //오름차순 정렬
        System.out.println(list.size()); //듣보잡 수 출력
        for(int k=0;k<list.size();k++){
            System.out.println(list.get(k)); //듣보잡 이름 출력
        }
    }
}