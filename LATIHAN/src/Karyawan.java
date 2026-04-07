public class Karyawan { 
    private String idKaryawan, nama;
    private double gajiPokok;
    protected String departemen;

    //Soal 1
    Karyawan(String idKaryawan, String nama, double gajiPokok, String departemen) {
        setIdKaryawan(idKaryawan);
        setNama(nama);
        setGajiPokok(gajiPokok);
        setDepartemen(departemen);
    }

    public String getidKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setIdKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    //Soal 2
    public double getGajiPokok() {
        return gajiPokok;
    }
    public void setGajiPokok(double gajiPokok) {
        if (gajiPokok < 0) System.out.println("Gaji tidak boleh 0 atau negatif");
        else this.gajiPokok = gajiPokok;
    }

    //Soal 3
    public String getDepartemen() {
        return departemen;
    }
    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }
    public void tampilkanDataKaryawan() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Departemen: " + departemen);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
