import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        char [] c = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String s = in.next();
        int []num=new int[26];
        for(int i =0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                continue;
            }
            map.put(s.charAt(i),i);
        }
        for(int j=0;j<c.length;j++){
            if(map.containsKey(c[j])){
                map2.put(c[j],map.get(c[j]));
            }
            else{
                map2.put(c[j],-1);
            }
            System.out.print(map2.get(c[j])+" ");
        }
    }
}