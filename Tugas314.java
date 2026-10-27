import java.util.Scanner;

public class Tugas314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukkan jumlah toko: ");
        int jumlahToko = input.nextInt();

        if (jumlahToko <= 0) {
            System.out.println("jumlah toko minimal 1");
            return;
        }

        int tokoTerbaik = 0;
        int totalBarangTertinggi = -1;
        int totalBarangSeluruhToko = 0;

        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("masukkan jumlah pelanggan toko " + i + ": ");
            int jumlahPelanggan = input.nextInt();

            if (jumlahPelanggan < 0) {
                System.out.println("jumlah pelanggan tidak boleh negatif");
                return;
            }

            int totalBarangToko = 0;
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("jumlah barang pelanggan " + j + " di toko " + i + ": ");
                int jumlahBarang = input.nextInt();

                if (jumlahBarang < 0) {
                    System.out.println("jumlah barang tidak boleh negatif");
                    return;
                }

                totalBarangToko += jumlahBarang;
            }

            totalBarangSeluruhToko += totalBarangToko;
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > totalBarangTertinggi) {
                totalBarangTertinggi = totalBarangToko;
                tokoTerbaik = i;
            }
        }

        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbaik);
        input.close();
    }
}
