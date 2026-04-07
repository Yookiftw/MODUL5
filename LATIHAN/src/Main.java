public class Main {
    public static void main(String[] args) {
        Karyawan newbie2 = new Karyawan("1052242", "Lucas", -999999, "Marketing");
        Karyawan newbie = new Karyawan("1052241", "Yooki", 9000000, "IT");
        newbie2.tampilkanDataKaryawan();
        newbie.tampilkanDataKaryawan();

        System.out.println("");
        newbie2.setGajiPokok(-9999);

        System.out.println("");
        newbie2.setGajiPokok(9000000);
        newbie2.tampilkanDataKaryawan();
    }

}
