import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double boy, kilo, endeks;

        Scanner scan = new Scanner(System.in);
        System.out.print("Boy: ");
        boy = scan.nextDouble();
        System.out.print("Kilo: ");
        kilo = scan.nextDouble();

        endeks=kilo/(boy*boy);
        System.out.println("endeks= "+endeks);
    }
}
