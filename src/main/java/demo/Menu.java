package demo;

/**
 * Class Menu digunakan untuk menyimpan data menu makanan
 * yang terdiri dari nama menu dan harga.
 */
public class Menu {

    String namaMenu;
    int harga;

    /**
     * Constructor Menu
     * @param namaMenu nama makanan
     * @param harga harga makanan
     */
    public Menu(String namaMenu, int harga) {
        this.namaMenu = namaMenu;
        this.harga = harga;
    }
}
