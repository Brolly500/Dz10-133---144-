import java.util.Scanner;
public class N139 {
    public static void main(String args[]) {
        Scanner n = new Scanner(System.in);
        int k=0;
        int p = n.nextInt();
        k=p;
        int num = 1;
        while (n.hasNextInt()) {
            k=p;
            p = n.nextInt();
            if (p < k) {
                num++;
            }
        }
        System.out.println(num);
    }
}