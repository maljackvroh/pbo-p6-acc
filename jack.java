package responAC;

import java.util.Scanner;

abstract class hewan{
    
    abstract void bernafas();
    abstract void bergerak();
}

class ikan extends hewan{
    String nama;
    String alat;

    ikan(String nama, String alat){
        this.nama = nama;
        this.alat = alat;
    }

    @Override
    void bernafas() {
        System.out.println(nama+ " bernafas menggunakan ingsang");
        System.out.println("============================");
    }

    @Override
    void bergerak() {
        System.out.println(nama+" bergerak dengan cara berenang");
        System.out.println("dan dia menggunakan "+ alat +" untuk berenang");
    }
}

class kucing extends hewan{
    String nama;
    String alat;

    kucing(String nama, String alat){
        this.nama = nama;
        this.alat = alat;
    }

    @Override
    void bernafas() {
        System.out.println(nama+ " bernafas menggunakan paru paru");
        System.out.println("============================");
    }

    @Override
    void bergerak() {        
        System.out.println(nama+" bergerak dengan cara berjalan");
        System.out.println("dan dia menggunakan "+ alat +" untuk bergerak");
    }

}

public class jack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("\nMasukan nama ikan: ");
        String namIkan = in.next();

        System.out.print("Masukan alat gerak ikan: ");
        String alatIkan = in.next();

        ikan ikan = new ikan(namIkan, alatIkan);
        
        ikan.bergerak();
        ikan.bernafas();

        System.out.print("\nMasukan nama hewan: ");
        String namHew = in.next();

        System.out.print("Masukan alat gerak hewan: ");
        String alatHew = in.next();

        kucing kucing = new kucing(namHew, alatHew);
        
        kucing.bergerak();
        kucing.bernafas();
    }
}
