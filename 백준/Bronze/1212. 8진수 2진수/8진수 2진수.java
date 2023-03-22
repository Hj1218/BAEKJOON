import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        String a = in.next(); //입력받을 수를 위한 변수, 문자 하나씩 넣기 위해 string형으로 선언
        String[] b = {"000", "001", "010", "011", "100", "101", "110", "111"}; //0~7에 대응하는 2진수
        char[] c = a.toCharArray(); //입력받은 수를 하나씩 저장할 배열
        for (int i = 0; i < b.length; i++) { // hashmap을 이용하여 각 8진수와 2진수를 대응시킴
            map.put(i, b[i]);
        }
        String[] result = new String[c.length]; //2진수로 변환한 결과를 저장하기 위한 배열
        for (int j = 0; j < c.length; j++) {
            int n = Character.getNumericValue(c[j]);
            result[j] = map.get(n);
            //result[j] =Integer.parseInt(map.get(c[j])); //결과 배열에 대응하는 2진수 넣기
            switch (result[0]) { //0으로 시작하는 경우 0 제외하기
                case "001":
                    result[0] = "1";
                    break;
                case "010":
                    result[0] = "10";
                    break;
                case "011":
                    result[0] = "11";
                    break;
                case "000":
                    result[0] = "0";
            }
            System.out.print(result[j]);
        }
    }
}