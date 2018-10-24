package Program;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pil;
        do{
        System.out.println("1. Input data");
        System.out.println("2. Tampilkan data");
        System.out.println("3. Keluar");
        System.out.print("Masukan Pilhan : ");
        pil=s.nextInt();
        }while(pil!=3);
    }
}
