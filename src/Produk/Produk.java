/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Produk;

/**
 *
 * @author AFFAN SALIM
 */
public abstract class Produk {
    private String id;
    private String nama;
    private int harga;
    private String kategori;
    private int stok;

    public Produk(String id, String nama, int harga, String kategori, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStok() {
        return stok;
    }

    public void kurangStok() {
        if (stok > 0) {
            stok--;
        } else {
            System.out.println("Stok habis untuk produk: " + nama);
        }
    }

    public void printDetail() {
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Kategori: " + kategori);
        System.out.println("Stok: " + stok);
        System.out.println("Spesifikasi:");
        for (String s : getSpesifikasi()) {
            System.out.println("  - " + s);
        }
    }

    public abstract String[] getSpesifikasi();
}
