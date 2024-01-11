public class Kalkulator {
    public static void main(String[] args) {
        System.out.println("============BangunDatar============");
        BangunDatar b = new BangunDatar();
        System.out.println("Luas Persegi: "+b.Persegi(5));
        System.out.println("Luas Persegi Panjang: "+b.PersegiPanjang(5, 6));
        System.out.println("Luas Segitiga: "+b.Segitiga(5, 6));
        System.out.println("Luas Lingkaran: "+b.Lingkaran(5));
        System.out.println("Luas Jajar Genjang: "+b.JajarGenjang(5, 6));
        System.out.println("Luas Belah Ketupat: "+b.BelahKetupat(5, 6));
        System.out.println();
        System.out.println("============Simple============");
        Simple s = new Simple();
        System.out.println("Hasil tambah: "+s.tambah(5, 6));
        System.out.println("Hasil kurang: "+s.kurang(5, 6));
        System.out.println("Hasil kali: "+s.kali(5, 6));
        System.out.println("Hasil bagi: "+s.bagi(5, 6));
        System.out.println("Hasil pangkat: "+s.pangkat(5, 6));
        System.out.println("Hasil modulus: "+s.modulus(5, 6));
    }
}