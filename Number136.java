import java.util.Scanner;
public class Number136 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pr1;
        int pr;
        int posMax = 1;
        int num1 = sc.nextInt();
        int pos2 = 0;
        int num2 = sc.nextInt();
        if (num2 == num1) {
            posMax+=1;
        }
        else {
            pos2+=1;
        }
        while (sc.hasNextInt()) {
            pr = sc.nextInt();
            if (pr == num1) {
                posMax+=1;
            }
            else if (pr==num2){
                num2 = pr;
                pos2+=1;
            }
            else {
                num2 = pr;
                pos2=1;
            }
            if (pos2 == posMax) {
                pr1=num1;
                num1 = num2;
                num1 = pr;
                pos2 = 0;
            }
        }
        sc.close();
        System.out.println("Максимальное количество введённых подряд чисел " + posMax);
    }
}