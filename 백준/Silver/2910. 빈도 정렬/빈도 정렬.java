import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int c = in.nextInt();
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> map = new HashMap<>();
        int []num=new int[n];
        for(int i=0;i<n;i++){
            int a = in.nextInt();
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
                num[i]=a;
            }
        }
        int count=0;
        int index = 0;
        while(count<map.size()){
            int max=0;
            for(int i=0;i<n;i++){
                if(num[i]!=0){
                    if(max<map.get(num[i])){
                        max = map.get(num[i]);
                        index=i;
                    }
                }
            }
            for(int j=0;j<map.get(num[index]);j++){
                sb.append(num[index]).append(" ");
            }
            num[index]=0;
            count++;
        }
        System.out.print(sb);
    }
}