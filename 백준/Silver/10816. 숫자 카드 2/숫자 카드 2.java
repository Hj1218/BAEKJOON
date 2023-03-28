import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); //상근이가 가지고 있는 숫자 카드의 개수
        StringTokenizer st = new StringTokenizer(br.readLine()); //공백 단위로 읽어 드릴 라인 추가
        HashMap<Integer, Integer> map = new HashMap<>(); //상근이가 가지고 있는 숫자 카드를 저장할 hashmap
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken()); //상근이가 가지고 있는 숫자를 입력 받아 (공백 단위로)
            if (!map.containsKey(n)) { //hashmap에 숫자가 존재하지 않는 경우
                map.put(n, 1); //hashmap에 저장, key : n (숫자) , value : 1 (개수)
            } else { //hashmap에 이미 존재하는 경우
                map.put(n, map.get(n) + 1); //key : n (숫자) , value :(개수) + 1
            }
        }
        int M = Integer.parseInt(br.readLine()); //비교할 정수 개수
        st = new StringTokenizer(br.readLine()); //공백 단위로 읽어들일  라인 추가
        for (int j = 0; j < M; j++) {
            int m = Integer.parseInt(st.nextToken()); //비교할 정수를 입력 받아 (공백 단위로)
            if (map.containsKey(m)) { //입력받은 정수가 상근이가 가지고 있는 숫자와 같다면
                bw.write(map.get(m)+" "); //결과 출력
            } else { //상근이가 가지고 있지 않은 경우
                bw.write(0+" "); //결과 출력
            }
        }
        bw.close();
    }
}