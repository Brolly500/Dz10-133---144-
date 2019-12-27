import java.util.Scanner;
public class N144 {
    public static void main(String args[]) {
        int a=0, b=0, d=0, e=0, c=0, f=0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()){
            int n = in.nextInt();
            if (n==1 && a==1){
                b=0;
                d=0;
                e=0;
                c=0;
            }
            else if(n==1 && a==0){
                a=1;
            }
            if (n==2 && b==2){
                a=0;
                b=0;
                d=0;
                e=0;
                c=0;
            }
            else if(n==2 && b==0){
                b=2;
            }
            if (n==3 && d==3){
                a=0;
                b=0;
                d=0;
                e=0;
                c=0;
            }
            else if(n==3 && d==0){
                d=3;
            }
            if (n==4 && e==4){
                a=0;
                b=0;
                d=0;
                e=0;
                c=0;
            }
            else if(n==4 && e==0){
                e=4;
            }
            if (n==5 && c==5){
                a=0;
                b=0;
                d=0;
                e=0;
                c=0;
            }
            else if(n==5 && c==0){
                c=5;
            }
            if (n==6 && a==1 && b==2 && d==3 && e==4 && c==5) {
                f++;
                a=0;
                b=0;
                d=0;
                e=0;
                c=0;
            }
        }
        System.out.println("Количество входящих в последовательность фрагмента 1,2,3,4,5,6: " + f);
    }
}