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
public class Invoice {

    private String idInvoice;
    private Produk[] produk;
    private int totalPembayaran;
    private String metodePembayaran;
    private String alamat;
    
    private static int invoiceCounter = 1001;
    public Invoice(Produk[] produk, int totalPembayaran, String metodePembayaran, String alamat) {
        this.idInvoice = "INV-" + invoiceCounter++;
        this.produk = produk;
        this.totalPembayaran = totalPembayaran;
        this.metodePembayaran = metodePembayaran;
        this.alamat = alamat;
    }
    
    public String cetakInvoice() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("========================================\n");
        sb.append("              INVOICE RESMI\n");
        sb.append("========================================\n");
        sb.append("ID Invoice       : ").append(idInvoice).append("\n");
        sb.append("Metode Pembayaran: ").append(metodePembayaran).append("\n");
        sb.append("Alamat Pengiriman: ").append(alamat).append("\n");
        sb.append("----------------------------------------\n");
        sb.append("Rincian Produk:\n");
        
        for (Produk item : produk) {
            sb.append(String.format("- %-25s Rp %,d\n", item.getNama(), item.getHarga()));
        }
        
        sb.append("----------------------------------------\n");
        sb.append(String.format("Total Pembayaran : Rp %,d\n", totalPembayaran));
        sb.append("========================================\n");
        sb.append("   Terima kasih telah berbelanja!   \n");
        
        return sb.toString();
    }
    
    public String getIdInvoice() { 
        return idInvoice; 
    }
    public Produk[] getProduk() { 
        return produk; 
    }
    public int getTotalPembayaran() { 
        return totalPembayaran; 
    }
    public String getMetodePembayaran() { 
        return metodePembayaran; 
    }
    public String getAlamat() { 
        return alamat; 
    }
    
    
    
    
   
}
