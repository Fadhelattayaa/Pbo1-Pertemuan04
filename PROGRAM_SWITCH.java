import java.util.Scanner;

public class PROGRAM_SWITCH {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("=============DAFTAR TIKET BIS===================");
        System.out.println("1. Ekonomi");
        System.out.println("2. VIP");
        System.out.println("3. Super Eksekutif");
        System.out.println("================================================");
        System.out.print("Masukan Pilihan: ");
        int pilih = masukan.nextInt();
        int harga = 0;
        switch (pilih) {
            case ( 1 ):
                harga = 70000;
                break;
            case ( 2 ):
                harga = 150000;
                break;
            case ( 3 ):
                harga = 300000;
                break;
            default:
                System.out.println("Pilihan Tidak Valid");
                System.exit(0);
                break;
        }
        System.out.print("Masukkan Jumlah tiket Yang Ingin Anda beli: ");
        Scanner jum = new Scanner(System.in);
        int jumlah = jum.nextInt();
        int ttl = harga * jumlah;
        System.out.println("Total Harga Tiket: " +ttl);
        masukan.close();
        jum.close();
    }
}