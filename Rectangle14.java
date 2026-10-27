import java.util.Scanner;

public class Rectangle14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah baris: ");
        int baris = input.nextInt();
        System.out.print("masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
