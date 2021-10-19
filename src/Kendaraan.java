public class Kendaraan {
    // field / attribute dari class kendaraan
    String merek;
    int kecepatan;
    int jumlahRoda;
    int tahunProduksi;

    // buat method untuk menyimpan nilai dari field yang telah dibuat
    void attrKendaraaan(String merek, int kecepatan, int jumlahRoda, int tahunProduksi) {
        System.out.println("Merek Kendaraan :" + merek);
        System.out.println("Merek Kendaraan :" + kecepatan + " km/jam");
        System.out.println("Merek Kendaraan :" + jumlahRoda);
        System.out.println("Merek Kendaraan :" + tahunProduksi);
    }
}
