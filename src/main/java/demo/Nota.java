package demo;

/**
 * Class Nota digunakan untuk mengatur proses perhitungan
 * pada nota pemesanan makanan.
 */
public class Nota {

    /**
     * Method untuk menghitung total harga berdasarkan
     * harga satuan dan jumlah pesanan.
     *
     * @param harga harga satuan makanan
     * @param jumlah jumlah pesanan
     * @return total harga yang harus dibayar
     */
    public static int hitungTotal(int harga, int jumlah) {
        int total = harga * jumlah;
        return total;
    }
}
