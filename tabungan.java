import java.util.Scanner;
 
public class tabungan {
      public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int menu;
            boolean quit = false;
            float keluar = 0f;
            do {
				  System.out.println("==================================");
				  System.out.println("SELAMAT DATANG DI BANK SELALU AMAN");
				  System.out.println("==================================");
				  System.out.println("1. DEPOSIT");
                  System.out.println("2. TARIK TUNAI");
                  System.out.println("3. CEK SALDO");
                  System.out.print("Pilihan Anda, Tekan 0 Untuk Keluar: ");
                  menu = in.nextInt();
                  switch (menu) {
                  case 1:
                        float jumlah;
                        System.out.print("Jumlah deposit: ");
                        jumlah = in.nextFloat();
                        if (jumlah <= 0)
                             System.out.println("Tidak Dapat Menyimpan Uang Mata Uang Harus Positif.");
                        else {
                             keluar += jumlah;
						     System.out.println("Rp." + jumlah + " \nBerhasil Disimpan.");
                        }
                        break;
                  case 2:
                        System.out.print("Jumlah penarikan: ");
                        jumlah = in.nextFloat();
                        if (jumlah <= 0 || jumlah > keluar)
                             System.out.println("Penarikan Tidak Berhasil.");
                        else {
                             keluar -= jumlah;
							 System.out.println("\nRp." + jumlah + " \nBerhasil Disimpan.");
                        }
                        break;
                  case 3:
                        System.out.println("Saldo Anda: Rp." + keluar);
                        break;
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("Pilihan Anda Salah.");
                        break;
                  }
                  System.out.println();
            } while (!quit);
            System.out.println("Bye!");
      }
}