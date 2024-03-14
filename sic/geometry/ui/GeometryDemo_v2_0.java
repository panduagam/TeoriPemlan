package sic.geometry.ui;

import sic.geometry.generalshapes.Circle;
import sic.geometry.generalshapes.Rectangle;
import java.util.Scanner;

public class GeometryDemo_v2_0 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Geometry Demo v2.0\n"
                        + "by Pandu Panatagama A. P.\n"
                        + "====================\n"
                        + "Pilih salah satu bangun geometri berikut:\n"
                        + "1. Lingkaran\n"
                        + "2. Persegi panjang\n"
                        + "Pilihan: ");
        int inputan = scn.nextInt();

        if (inputan == 1) {
            System.out.print("Dimensi lingkaran\n"
                            + "-----------------\n"
                            + "Masukkan radius (m)\t: ");
            double radius = scn.nextDouble();

            Circle lingkaran = new Circle(radius);
            
            System.out.printf("Radius\t\t\t: %.2f m\n",lingkaran.getRadius());
            System.out.printf("Luas\t\t\t: %.2f m2\n",lingkaran.getLuas());
            System.out.printf("Keliling\t\t: %.2f: m",lingkaran.getKeliling());

        } else if (inputan == 2) {
            System.out.print("Dimensi persegi panjang\n"
                            + "-----------------------\n");
            System.out.print("Masukkan panjang (m)\t: ");
            double panjang = scn.nextDouble();
            System.out.print("Masukkan lebar (m)\t: ");
            double lebar = scn.nextDouble();

            Rectangle rectangle = new Rectangle(panjang, lebar);

            System.out.printf("Panjang\t\t\t: %.2f m\n",rectangle.getPanjang());
            System.out.printf("Lebar\t\t\t: %.2f m\n",rectangle.getLebar());
            System.out.printf("Luas\t\t\t: %.2f m2\n",rectangle.getLuas());
            System.out.printf("Keliling\t\t: %.2f m",rectangle.getKeliling());
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scn.close();
    }
}
