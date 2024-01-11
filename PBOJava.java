public class PBOJava {
    public static void main(String[] args) {
        System.out.println("Semangat belajar PBO Java");
        PBOJava b = new PBOJava();
        b.TampilNama();
        // tampilNama();
        System.out.println("usia: "+b.usia(2007));
    }
    public void TampilNama(){
        String nama = "RYAN GHOSLING";
        System.out.println("hallo "+nama);
    }

    public int usia(int tahunLahir){
        int usia= 2024-tahunLahir;
        return usia;
    }

}
