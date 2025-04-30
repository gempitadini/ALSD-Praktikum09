import java.util.Scanner;

public class SuratDemo11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat11 stack = new StackSurat11(10);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin berdasarkan Nama Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (jam): ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    Surat11 s = new Surat11(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    break;

                case 2:
                    Surat11 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat:");
                        System.out.println("ID: " + diproses.idSurat + ", Nama: " + diproses.namaMahasiswa +
                                ", Kelas: " + diproses.kelas + ", Jenis: " + diproses.jenisIzin + ", Durasi: " + diproses.durasi + " jam");
                    }
                    break;

                case 3:
                    Surat11 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        System.out.println("ID: " + terakhir.idSurat + ", Nama: " + terakhir.namaMahasiswa +
                                ", Kelas: " + terakhir.kelas + ", Jenis: " + terakhir.jenisIzin + ", Durasi: " + terakhir.durasi + " jam");
                    } else {
                        System.out.println("Tidak ada surat di dalam stack.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        scan.close();
    }
}
