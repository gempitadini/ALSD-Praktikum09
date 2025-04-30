public class StackSurat11 {
    Surat11[] stack;
    int size;
    int top;

    public StackSurat11(int size) {
        this.size = size;
        stack = new Surat11[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat11 s) {
        if (!isFull()) {
            stack[++top] = s;
            System.out.println("Surat berhasil diterima.");
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat lagi.");
        }
    }

    public Surat11 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat11 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("ID: " + stack[i].idSurat + ", Nama: " + stack[i].namaMahasiswa +
                        ", Kelas: " + stack[i].kelas + ", Jenis: " + stack[i].jenisIzin + ", Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
