import java.util.Scanner;

/**
 * Uts10
 */
public class Uts10 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.print("Apakah Memiliki Usaha?(y/n) = ");
        String usaha = input10.nextLine();
        double penghasilan = 0;
        if (usaha.equalsIgnoreCase("y")) {
            System.out.print("Masukkan Total Penghasilan Anda Dalam Satu Tahun = ");
            penghasilan = input10.nextDouble();
            input10.nextLine();
            double pajakPenghasilan = penghasilan * 0.15;
            System.out.print("Masukkan Jumlah Harta Kekayaan = ");
            int harta = input10.nextInt();
            input10.nextLine();
        double totalKekayaan = 0;
        for (int i = 0; i < harta; i++) {
            System.out.print("Masukkan Nama/Bentuk Harta " + (i + 1) + " = ");
            String namaHarta = input10.nextLine();
            System.out.print("Masukkan Nilai Jual " + namaHarta + " Saat Ini = ");
            double jual = input10.nextDouble();
            input10.nextLine();
            totalKekayaan += jual;
        }
        System.out.print("Apakah Anda Sudah Berkeluarga? (y/n) = ");
        String keluarga = input10.nextLine();
        double potonganPajak = 0;
        if (keluarga.equalsIgnoreCase("y")) {
            System.out.print("Berapa Anak Anda Yang Sedang Dijenjang Kuliah? = ");
            int kuliah = input10.nextInt();
            System.out.print("Berapa Anak Anda yang Sedang Dijenjang SMA? = ");
            int sma = input10.nextInt();
            if (kuliah == 1 && sma == 1 && totalKekayaan >= 50000000) {
                potonganPajak = 0.10;
            } else if (kuliah == 0 && sma == 0 && totalKekayaan < 50000000) {
                potonganPajak = 0.05;
            }
        }
        double totalPajak =  (pajakPenghasilan + totalKekayaan ) * (1 - potonganPajak);
        System.out.print("Total Pajak Yang Harus Dibayar Sebesar = Rp" + totalPajak);
        }
        
    }
}