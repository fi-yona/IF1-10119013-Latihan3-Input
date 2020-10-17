/**
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan3.input;


import java.util.Scanner;

/**
 *
 * @author Fiona Avila
 */


public class if110119013Latihan3Input {

    public static void main(String[] args) {
        System.out.print("Masukkan nama anda : ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
