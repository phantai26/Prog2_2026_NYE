import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();

        if (t < 0)
            System.out.println("Fagypont alatti");
        else if (t < 30)
            System.out.println("Átlagos");
        else
            System.out.println("Túl meleg");
    }
}
