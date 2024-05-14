public class Mahasiswa extends Civitas implements PesertaKelas{

    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public void ngerjainTugas(){
        System.out.println(getNama() + " sedang  mengerjakan tugas");
    }

    public void pasrah(){
        System.out.println(getNama() + " sedang pasrah mengerjakan tugas");
    }

    public void mengikutiOrganisasi(String nama){
        System.out.println(getNama() + " sedang mengikuti organisasi " + nama);
    }

    public void presentasi(){
        System.out.println(getNama() + " sedang presentasi");
    }

    @Override
    public void naikLift() {
        System.out.println( getNama()+ " sedang menuju kelas lantai 4 menggunakan lift");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " sedang di kelas seni");
    }
    
}
