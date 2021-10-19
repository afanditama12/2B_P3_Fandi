public class Binatang {
    // buat atribute/ field
    String nama;
    String jenis;
    int umur;
    int jumlah;

    // constructor dengan nama hewan, dengan parameter sesuai dengan atribute
    Binatang(String nama, String jenis, int umur, int jumlah) {
        this.nama = nama;
        this.jenis = jenis;
        this.umur = umur;
        this.jumlah = jumlah;
    }

    // method untuk menampung constructor yang telah dibuat
    public void printBinatang() {
        System.out.println("Nama Hewan :" + nama);
        System.out.println("Jenis Hewan :" + jenis);
        System.out.println("Umur Hewan :" + umur + " tahun");
        System.out.println("Jumlah Hewan :" + jumlah + " ekor");
    }
}
