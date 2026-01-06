package demo;

/**
 * Class Main merupakan class utama yang digunakan
 * untuk menjalankan aplikasi nota pemesanan makanan.
 */
public class Main {

    /**
     * Method main berfungsi sebagai titik awal
     * eksekusi program.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {

        Menu menu = new Menu("Ayam Geprek", 12000);
        int jumlah = 2;

        int totalBayar = Nota.hitungTotal(menu.harga, jumlah);

        System.out.println("=== NOTA PEMESANAN ===");
        System.out.println("Menu   : " + menu.namaMenu);
        System.out.println("Harga  : " + menu.harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : " + totalBayar);
    }
}
