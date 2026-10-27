import java.util.Scanner;
public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah kelompok: ");
        int jumlahKelompok = input.nextInt();
        System.out.print("masukkan jumlah penilai: ");
        int jumlahPenilai = input.nextInt();

        if (jumlahKelompok <= 0 || jumlahPenilai <= 0) {
            System.out.println("jumlah kelompok dan penilai harus > 0!");
        } else {
            int nomorKelompok = 1, kelompokTerbaik = 0;
            double rataTertinggi = -1;
            while (nomorKelompok <= jumlahKelompok) {
                System.out.println("kelompok " + nomorKelompok);
                double totalNilai = 0;

                for (int j = 1; j <= jumlahPenilai; j++) {
                    int nilai;
                    do {
                        System.out.print(" Nilai dari penilai " + j + ": ");
                        nilai = input.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("nilai haris 0-100, ulangi input");
                        }
                    } while (nilai < 0 || nilai > 100);
                    totalNilai += nilai;
                }
                double rataNilai = totalNilai / jumlahPenilai;
                System.out.println("Kelompok " + nomorKelompok + " Nilai rata rata : " + rataNilai);

                if (rataNilai > rataTertinggi) {
                    kelompokTerbaik = nomorKelompok;
                    rataTertinggi = rataNilai;
                }
            nomorKelompok++;
            }
            System.out.println();
            System.out.println("============================");
            System.out.println("Kelompok Terbaik : Kelompok " + kelompokTerbaik);
            System.out.println("rata rata tertinggi :" + rataTertinggi);
        }
    }
}
