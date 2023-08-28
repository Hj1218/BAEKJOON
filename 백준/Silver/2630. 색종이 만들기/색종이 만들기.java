import java.util.Scanner;

public class Main {
    static int white,blue;
    static int [][] paper;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        paper = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                paper[i][j]=in.nextInt();
            }
        }
        white=0;
        blue=0;
        check(0,0,n);
        System.out.println(white);
        System.out.println(blue);
    }
    static void check(int a, int b, int size){
        if(colorCheck(a,b,size)){
            if(paper[a][b]==0){
                white++;
            }
            else{
                blue++;
            }
            return;
        }
        int newSize = size/2;
        check(a,b,newSize);
        check(a,b+newSize,newSize);
        check(a+newSize,b,newSize);
        check(a+newSize,b+newSize,newSize);
    }
    static boolean colorCheck(int a, int b, int size){
        int color = paper[a][b];
        for(int i=a;i<a+size;i++){
            for(int j=b;j<b+size;j++){
                if(paper[i][j]!=color){
                    return false;
                }
            }
        }
        return true;
    }
}