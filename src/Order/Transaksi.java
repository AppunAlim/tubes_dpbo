/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Order;

import Produk.Produk;

/**
 *
 * @author AFFAN SALIM
 */
public class Transaksi {
    
    private Produk[] produkDiBeli;
    private int totalHarga;
    private String metodePembayaran;
    private String alamatPengiriman;

    public Transaksi(Produk[] produkDiBeli, String metodePembayaran, String alamatPengiriman) {
        this.produkDiBeli = produkDiBeli;
        this.metodePembayaran = metodePembayaran;
        this.alamatPengiriman = alamatPengiriman;
        this.hitungTotal(); 
    }

    public void hitungTotal() {
        this.totalHarga = 0; 
        for (Produk p : this.produkDiBeli) {
            this.totalHarga += p.getHarga();
        }
    }
    

    public Invoice checkout() {
        System.out.println("Proses checkout berhasil. Invoice sedang dibuat...");
        return new Invoice(this.produkDiBeli, this.totalHarga, this.metodePembayaran, this.alamatPengiriman);
    }

    public int getTotalHarga() {
        return totalHarga;
    }
}
