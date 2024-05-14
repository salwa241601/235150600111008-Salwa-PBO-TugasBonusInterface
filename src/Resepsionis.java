public class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public Resepsionis(String nama, int umur, boolean jenisKelamin, int idResepsionis, String jabatan, double gaji) {
        super(nama, umur, jenisKelamin);
        this.idResepsionis = idResepsionis;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public void melayani(){
        System.out.println(getNama() + " bersedia melayani anda");
    }

    public void melapor(){
        System.out.println(getNama() + " melapor ke atasan jika terjadi masalah");
    }

    @Override
    public void naikLift() {
        System.out.println(getNama() + "menuju lantai ruang resepsionis menggunakan lift");
    }
}
