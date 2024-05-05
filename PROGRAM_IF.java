import java.util.Scanner;
public class PROGRAM_IF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Nilai: ");
        int angka = input.nextInt();
        if (angka >= 86 && angka <= 95){
            System.out.println("PREDIKAT A");
        }
        else if (angka >= 70 && angka <= 85){
            System.out.println("PREDIKAT B");
        }
        else if (angka >= 59 && angka <= 69){
            System.out.println("PREDIKAT C");
        }
        else if (angka >= 46 && angka <= 58){
            System.out.println("PREDIKAT D");
        }
        else if (angka >= 0 && angka <= 45) {
            System.out.println("PREDIKAT E");
        }
        else {
            System.out.println("NILAI YANG LEBIH BATAS DARI 95");
        }
        input.close();
    }
    
}