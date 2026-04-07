public class Main2 {
    public static void main(String[] args) {
        System.out.println("=== PEMBUATAN OBJEK & UJI VALIDASI SETTER ===");
        
        //kamar pertama pake constructor kilat
        KamarHotel kamar1 = new KamarHotel("101", "Premium", 3);
        //ketahanan Setter 
        kamar1.setTipeKamar("Presidential");
        kamar1.setHargaPerMalam(-10000);
        
        System.out.println("\n");

        //kamar kedua pake constructor lengkap, kapasitas max 2 
        KamarHotel kamar2 = new KamarHotel("201", "Suite", 2, 500000);

        System.out.println("=== UJI OPERASIONAL PEMESANAN KAMAR ===");
        
        //kamar kedua percobaan overcapacity
        System.out.println("- Pemesanan Kamar Kedua (Max: 2) -");
        kamar2.pesanKamar(4); 
        kamar2.pesanKamar(2); //pesanan sesuai
        kamar2.pesanKamar();  //tanpa parameter pada kamar yang sudah dipesan

        System.out.println("\n=== UJI SISTEM PENAGIHAN (BILLING) ===");
        
        //kamar pertama hitung biaya dengan diskon tapi kurang hari
        System.out.println("- Tagihan Kamar Pertama (2 Malam, Voucher PROMO) -");
        double tagihan1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Bayar Kamar Pertama: Rp " + tagihan1);

        System.out.println();

        //kamar kedua hitung biaya dengan diskon dan syarat terpenuhi
        System.out.println("- Tagihan Kamar Kedua (4 Malam, Voucher PROMO) -");
        double tagihan2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Bayar Kamar Kedua: Rp " + tagihan2);

        System.out.println("\n=== STRUK INFORMASI AKHIR ==="); //cetak profil kamar
        kamar1.cetakProfilKamar();
        kamar2.cetakProfilKamar();
    }
}