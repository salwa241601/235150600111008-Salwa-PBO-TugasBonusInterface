abstract class Civitas {
    private String nama;
    private int umur;
    private boolean jenisKelamin;

    public Civitas (String nama, int umur, boolean jenisKelamin){
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-laki";
        } else {
            return "Perempuan";
        }
    }

    public void makanDiKantin(String kantin) {
        System.out.println(getNama() + " lagi makan di kantin " + kantin);
    }

    public void mainGameCorner() {
        System.out.println(getNama() + " lagi bermain game corner");
    }

    public abstract void naikLift();
}