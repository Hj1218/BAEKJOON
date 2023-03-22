import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int K=N;K>=0;K--){
            if(K==0){
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                if(N==1){
                    System.out.println("Go to the store and buy some more, 1 bottle of beer on the wall.\n");
                }else{
                    System.out.println("Go to the store and buy some more, "+N+" bottles of beer on the wall.\n");
                }
            } else if (K==1) {
                System.out.println("1 bottle of beer on the wall, 1 bottle of beer.");
                System.out.println("Take one down and pass it around, no more bottles of beer on the wall.\n");
            } else if (K==2) {
                System.out.println("2 bottles of beer on the wall, 2 bottles of beer.");
                System.out.println("Take one down and pass it around, 1 bottle of beer on the wall.\n");
            }else{
                System.out.println(K + " bottles of beer on the wall, " + K + " bottles of beer.");
                System.out.println("Take one down and pass it around, " + (K - 1) + " bottles of beer on the wall.\n");
            }
        }
    }
}