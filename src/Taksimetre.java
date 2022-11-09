import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double kmUcret = 2.2, acilisUcret = 10, minUcret = 20, km, toplamUcret;

        Scanner scan = new Scanner(System.in);
        System.out.println("Mesafe giriniz (km):");
        km = scan.nextDouble();
        toplamUcret = acilisUcret + (km * kmUcret);
        toplamUcret = toplamUcret < minUcret ? minUcret : toplamUcret;
        System.out.println("Toplam Ucret= " + toplamUcret);
    }
}
