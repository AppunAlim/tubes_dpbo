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
public class Order {
     private Produk[] items;
   
    private int totalHarga;

    
    public Order(Produk[] items) {
        this.items = items;
        this.totalHarga = 0;
        for (Produk item : this.items) {
            this.totalHarga += item.getHarga();
        }
    }
   
    public int getTotalHarga() {
        return totalHarga;
    }

    
    public Produk[] getItems() {
        return items;
    }
}
