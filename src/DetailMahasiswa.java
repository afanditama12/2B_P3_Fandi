public class DetailMahasiswa {
    public static void main(String[] args) {
        // buat method
        var mahasiswa = new Mahasiswa();

        // manipulasi field / attribute
        mahasiswa.nama = "Affandi Febrinsa Pratama";
        mahasiswa.npm = 2113020039;
        mahasiswa.alamat = "Desa Kwagean Kecamatan Loceret Kabupaten Nganjuk";
        mahasiswa.jurusan = "Teknik Informatika";
        mahasiswa.namaKampus = "Universitas Nusantara PGRI Kediri";
        mahasiswa.tahunMasuk = 2021;

        // tampilkan field/attribute yang telah dimanipulasi
        System.out.println("Nama Mahasiswa : " + mahasiswa.nama);
        System.out.println("NPM Mahasiswa : " + mahasiswa.npm);
        System.out.println("Alamat Mahasiswa : " + mahasiswa.alamat);
        System.out.println("Jurusan Mahasiswa : " + mahasiswa.jurusan);
        System.out.println("Nama Kampus Mahasiswa : " + mahasiswa.namaKampus);
        System.out.println("Tahun Masuk Mahasiswa : " + mahasiswa.tahunMasuk);
    }
}
