class Dosen extends Civitas implements PesertaKelas, Pengajar {

    private String nip;
    private double gaji;

    public Dosen(String nama, int umur, boolean jenisKelamin, String nip, double gaji) {
        super(nama, umur, jenisKelamin);
        this.nip = nip;
        this.gaji = gaji;
    }

    public void ikutPenelitian(){
        System.out.println(getNama() + " sedang melakukan penelitian");
    }

    @Override
    public void masukKelas() {
        System.out.println(getNama() + " masuk ke kelas untuk mengajar");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(getNama() + " sedang mengajar matkul " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(getNama() + " memberi tugas di Brone");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(getNama() + " menilai tugas projek");
    }

    @Override
    public void naikLift() {
        System.out.println(getNama() + " sedang naik lift untuk menuju ke kelas");
    }
}
