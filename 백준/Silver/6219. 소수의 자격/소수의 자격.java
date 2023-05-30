import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String d = in.next();
        boolean [] prime = new boolean[b+1];
        for(int i=2;i<=b;i++){
            prime[i]=true;
        }
        for(int i=2;i<b;i++){
            if(!prime[i]){ //false인 경우
                continue;
            }
            for (int j=2*i;j<=b;j+=i){ //true인 경우
                prime[j]=false; //배수는 모두 false
            }
        }
        int count=0;
        for(int i=a;i<=b;i++){
            if(prime[i]){
                String s = Integer.toString(i);
                for(int l=0;l<s.length();l++){
                    char check = s.charAt(l);
                    if(String.valueOf(check).equals(d)){
                        count++;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}