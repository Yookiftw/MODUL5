public class KamarHotel {
    //private untuk encapsulation yang ketat
    private String nomorKamar, tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    //Cons.pertama pendaftaran kilat
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); //pake setter supaya konsisten
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0; //otomatis harga 0
        this.isTersedia = true; //otomatis tersedia
    }

    //cons.kedua pendaftaran lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); //pake setter lagi
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); //ini juga pake setter
        this.isTersedia = true; //otomatis tersedia
    }

    //Getter
    public String getNomorKamar() {return nomorKamar;}
    public String getTipeKamar() {return tipeKamar;}
    public int getKapasitasMaksimal() {return kapasitasMaksimal;}
    public double getHargaPerMalam() {return hargaPerMalam;}
    public boolean getIsTersedia() {return isTersedia;}

    //Setter
    public void setNomorKamar(String nomorKamar) {this.nomorKamar = nomorKamar;}
    
    public void setKapasitasMaksimal(int kapasitasMaksimal) {this.kapasitasMaksimal = kapasitasMaksimal;}
    
    public void setTersedia(boolean isTersedia) {this.isTersedia = isTersedia;}

    // Validasi Setter Tipe Kamar
    public void setTipeKamar(String tipeKamar) {
        if (tipeKamar.equalsIgnoreCase("Reguler") || 
            tipeKamar.equalsIgnoreCase("Premium") || 
            tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar;
        } 
        else {
            System.out.println("Tipe kamar '" + tipeKamar + "' tidak valid. Mengubah ke 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }

    //setter harga per malam
    public void setHargaPerMalam(double hargaPerMalam) {
        if (hargaPerMalam < 50000) {
            System.out.println("Harga " + hargaPerMalam + " terlalu rendah. Mengubah ke 50000.");
            this.hargaPerMalam = 50000;
        } else {
            this.hargaPerMalam = hargaPerMalam;
        }
    }

    //pemesanan overloading
    //tanpa parameter
    public void pesanKamar() {
        if (isTersedia) {
            isTersedia = false;
            System.out.println("Memesan kamar " + nomorKamar);
        } 
        else {
            System.out.println("kamar " + nomorKamar + " terisi!");
        }
    }

    //dengan parameter jumlahTamu
    public void pesanKamar(int jumlahTamu) {
        if (!isTersedia) System.out.println("Kamar " + nomorKamar + "terisi!");
        else if (jumlahTamu > kapasitasMaksimal) System.out.println("Gagal! Jumlah tamu melebihi kapasitas maksimal (" + kapasitasMaksimal + ").");
        else {
            isTersedia = false;
            System.out.println("Berhasil memesan kamar " + nomorKamar + " untuk " + jumlahTamu + " orang.");
        }
    }

    //batal pesan
    public void batalPesan() {
        isTersedia = true;
        System.out.println("Kamar " + nomorKamar + " berhasil dibatalkan.");
    }

    //penagihan overloading
    //tanpa voucher
    public double hitungTotalBayar(int jumlahMalam) {
        return hargaPerMalam * jumlahMalam;
    }

    // Dengan voucher
    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) {
        double totalTagihan = hargaPerMalam * jumlahMalam;
        if (kodeVoucher.equalsIgnoreCase("PROMO") && jumlahMalam >= 3) {
            double diskon = totalTagihan * 0.20;
            System.out.println("Diskon 20% diterapkan.");
            return totalTagihan - diskon;
        } 
        else {
            System.out.println("Voucher tidak valid atau syarat minimal 3 malam tidak terpenuhi. Harga normal diterapkan.");
            return totalTagihan;
        }
    }

    // --- Method Cetak Profil ---
    public void cetakProfilKamar() {
        System.out.println("===================================");
        System.out.println("       PROFIL KAMAR HOTEL");
        System.out.println("    Nomor Kamar : " + nomorKamar);
        System.out.println("    Tipe Kamar  : " + tipeKamar);
        System.out.println("    Kapasitas   : " + kapasitasMaksimal + " Orang");
        System.out.println("    Harga/Malam : Rp " + hargaPerMalam);
        System.out.println("    Status      : " + (isTersedia ? "Tersedia" : "Terisi"));
        System.out.println("===================================");
    }
}