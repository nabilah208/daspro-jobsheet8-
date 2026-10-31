import java.util.Scanner;

public class Tugas1_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n;

        do {
            System.out.print("Masukkan nilai n = ");
            n = sc.nextInt();
            if (n < 1) {
                System.out.println("n minimal 1. Ulangi input!");
            } 
        } while (n < 1);
        
        int totalAngka = 0;

        for (int baris = 1; baris <= n; baris++) {
            for (int angka = 1; angka <= baris; angka++) {
                System.out.print(angka);
                if (angka < baris) {
                    System.out.print(" ");
                }
                totalAngka++;
            }
          System.out.println();  
        }
        System.out.println("Total angka tercetak: " + totalAngka);
        sc.close();
    }
    
}
