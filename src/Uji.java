public class Uji {

    public static void main(String[] args) {
        Dosen dosen = new Dosen("Pak Claude", 30, true, "54342532", 5000000);
        dosen.ikutPenelitian();

        Dosen dosenUp = new Dosen("Bu Diana", 27, false, "54775675", 500000);
        Civitas dosenUpCas = (Civitas) dosenUp;
        dosenUpCas.makanDiKantin("Anggrek");

        Mahasiswa mhs = new Mahasiswa("Athy", 18, false, "235150600111010", 3.9, 4);
        mhs.ngerjainTugas();

        Mahasiswa mhsUp = new Mahasiswa("Zenith", 18, false, "235150600111118", 3.8, 3);
        Civitas mhsUpCas = (Civitas) mhsUp;
        mhsUpCas.mainGameCorner();

        Asprak asprk = new Asprak("Lucas", 19, true, "225150600111004", 4.0, 5);
        asprk.mengajar("Magic");

        Asprak asprkUp = new Asprak("Ijekiel", 19, true, "225150600111029", 3.9, 6);
        Civitas asprkUpCas = (Civitas) asprkUp;
        asprkUpCas.mainGameCorner();

        Resepsionis rsp = new Resepsionis("Selsius", 29, true, 35324, "Kepala Resepsionis", 4000000);
        rsp.melayani();

        Resepsionis rspUp = new Resepsionis("Ziyan", 28, true, 33342, "Sekretaris", 3700000);
        Civitas rspUpCas = (Civitas) rspUp;
        rspUpCas.makanDiKantin("Lili");


    }
   
}
