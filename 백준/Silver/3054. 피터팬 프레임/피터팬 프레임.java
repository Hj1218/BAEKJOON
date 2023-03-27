import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(); //입력 받을 문자열(알파벳)
        char[] c = new char[s.length()]; //문자열을 문자로 나눠 저장할 문자배열
        StringBuilder sb15 = new StringBuilder(); //결과 출력을 위한 StringBuilder 1,5줄
        StringBuilder sb24 = new StringBuilder(); //결과 출력을 위한 StringBuilder 2,4줄
        StringBuilder sb3 = new StringBuilder(); //결과 출력을 위한 StringBuilder 3줄
        String []print=new String[4]; //반복되는 4열을 저장할 배열
        String sign; //기호
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i); //입력받은 문자열을 문자로 배열에 하나씩 저장
        }
        for(int j=0;j<c.length;j++){
            if(j%3==2){ //3의 배수에 위치한 알파벳은
                sign="*"; //기호를 웬디 프레임으로
                print[0]=".."+sign+"..";
                print[1]="."+sign+"."+sign+".";
                print[2]=sign+"."+c[j]+"."+sign;
                print[3]="."+sign+"."+sign+".";
                for(int k=0;k<4;k++){
                    sb15.append(print[0].charAt(k));
                    sb24.append(print[1].charAt(k));
                    sb3.append(print[2].charAt(k));
                }
                if(j==c.length-1){ //마지막 문자인 경우
                    String f=".."+sign+"..";
                    sb15.append(f.charAt(0));
                    sb24.append(f.charAt(1));
                    sb3.append(f.charAt(2));
                }
            }
            else{ //아닌 경우
                if(j/3>0&&j%3==0){ //알파벳의 길이가 3 초과인 경우 웬디프레임 다음 피터팬 프레임의 첫 줄을 웬디프레임을 출력하기 위해
                    sign="#"; //기호를 피터팬 프레임으로
                    print[0]=".."+sign+"..";
                    print[1]="."+sign+"."+sign+".";
                    print[2]="*."+c[j]+"."+sign; //웬디 프레임 출력
                    print[3]="."+sign+"."+sign+".";
                    for(int k=0;k<4;k++){
                        sb15.append(print[0].charAt(k));
                        sb24.append(print[1].charAt(k));
                        sb3.append(print[2].charAt(k));
                    }
                    if(j==c.length-1){ //마지막 문자인 경우
                        String f=".."+sign+"..";
                        sb15.append(f.charAt(0));
                        sb24.append(f.charAt(1));
                        sb3.append(f.charAt(2));
                    }
                }
                else { //알파벳의 길이가 3이하인 경우
                    sign="#"; //기호를 피터팬 프레임으로
                    print[0]=".."+sign+"..";
                    print[1]="."+sign+"."+sign+".";
                    print[2]=sign+"."+c[j]+"."+sign;
                    print[3]="."+sign+"."+sign+".";
                    for(int k=0;k<4;k++){
                        sb15.append(print[0].charAt(k));
                        sb24.append(print[1].charAt(k));
                        sb3.append(print[2].charAt(k));
                    }
                    if(j==c.length-1){ //마지막 문자인 경우
                        String f=".."+sign+"..";
                        sb15.append(f.charAt(0));
                        sb24.append(f.charAt(1));
                        sb3.append(f.charAt(2));
                    }
                }
            }

        }
        System.out.println(sb15);
        System.out.println(sb24);
        System.out.println(sb3);
        System.out.println(sb24);
        System.out.println(sb15);
    }
}