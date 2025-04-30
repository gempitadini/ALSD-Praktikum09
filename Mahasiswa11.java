public class Mahasiswa11 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    public Mahasiswa11(String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; // nilai awal
    }

    public void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}