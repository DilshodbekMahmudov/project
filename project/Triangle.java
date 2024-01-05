package com.project;

public class Triangle {

    private int katet1;
    private int katet2;

    private int gipotenuza;

    public int getKatet1() {
        return katet1;
    }

    public void setKatet1(int katet1) {
        this.katet1 = katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public void setKatet2(int katet2) {
        this.katet2 = katet2;
    }

    public int getGipotenuza() {
        return gipotenuza;
    }

    public void setGipotenuza(int gipotenuza) {
        this.gipotenuza = gipotenuza;
    }

    public int yuziniHisoblash(){
        return (katet1 * katet2) / 2;

    }

    public int perimetriHisoblash() {
        return katet1 + katet2 + gipotenuza;

    }

    public static void main(String[] args) {
        Triangle triangle=new Triangle();

        triangle.setKatet1(5);
        triangle.setKatet2(3);
        triangle.setGipotenuza(4);

        int yuzi = triangle.yuziniHisoblash();
        int perimetri = triangle.perimetriHisoblash();

        System.out.println("Uchburchak yuzi: " + yuzi);
        System.out.println("Uchburchak perimetri: " + perimetri);


    }
}
