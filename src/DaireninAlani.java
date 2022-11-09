import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        double yaricap, alan, cevre, pi = 3.14;

        Scanner scan = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz: ");
        yaricap = scan.nextDouble();

        alan = (yaricap * yaricap) * pi;
        cevre = 2 * pi * yaricap;
        System.out.println("Dairenin Alani= "+alan);
        System.out.println("Dairenin Cevresi="+cevre);
    }
}
