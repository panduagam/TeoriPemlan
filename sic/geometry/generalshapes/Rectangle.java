package sic.geometry.generalshapes;

public class Rectangle {
    private double panjang;
    private double lebar;

    public Rectangle() {
        this.panjang = 0;
        this.lebar = 0;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getLebar() {
        return lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public double getKeliling() {
        return 2 * (panjang + lebar);
    }
}
