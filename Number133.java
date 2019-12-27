import java.util.Scanner;
public class Number133 {
    public static void main(String args[])  {
        Scanner n = new Scanner(System.in);
        int max = n.nextInt();
        int num = max;
        int k=1;
        while (n.hasNextInt()) {
            num = n.nextInt();
            if (num==max) {
                k+=1;
            }
            if (num>max) {
                max = num;
                k = 1;
            }

        }
        System.out.println("Максимальных чисел: "+ k);
        n.close();
    }
}