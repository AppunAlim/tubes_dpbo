# Aplikasi Kasir Desktop - Gaming STORE

Ini adalah proyek Tugas Besar untuk mata kuliah Desain & Pemrograman Berorientasi Objek (DPBO). Aplikasi ini merupakan sebuah sistem kasir (*Point of Sale*) dalam bentuk aplikasi desktop untuk sebuah toko gaming.

Aplikasi ini dibangun menggunakan bahasa pemrograman **Java** dengan library **Swing** untuk antarmuka grafis (GUI) dan dikembangkan menggunakan **Apache NetBeans IDE**.

## Fitur Utama

-   **Splash Screen**: Tampilan pembuka saat aplikasi dimuat.
-   **Sistem Akun**:
    -   **Registrasi Pengguna**: Pengguna baru dapat membuat akun dengan validasi input untuk mencegah data kosong atau format yang salah.
    -   **Login Pengguna**: Otentikasi pengguna untuk dapat masuk ke dalam sistem.
-   **Katalog Produk**: Menampilkan daftar produk (PC Gaming) yang tersedia untuk dibeli.
-   **Manajemen Keranjang Belanja**:
    -   Menambahkan produk dari katalog ke dalam keranjang.
    -   Menghapus produk dari keranjang.
    -   Subtotal belanja diperbarui secara otomatis.
-   **Proses Checkout & Transaksi**:
    -   Pilihan berbagai metode pembayaran (Cash, QR Code, Debit).
    -   Validasi jumlah uang yang dibayarkan.
    -   Perhitungan uang kembalian secara otomatis.
-   **Cetak Invoice**: Menampilkan struk atau invoice transaksi setelah pembayaran berhasil dilakukan.

## Teknologi yang Digunakan

-   **Bahasa Pemrograman**: Java
-   **Library GUI**: Java Swing
-   **IDE**: Apache NetBeans

## Cara Menjalankan Proyek

1.  Pastikan Anda memiliki **Java Development Kit (JDK)** dan **Apache NetBeans IDE** yang sudah terpasang di komputer Anda.
2.  *Clone* atau unduh repositori ini.
3.  Buka Apache NetBeans IDE.
4.  Pilih `File > Open Project...` lalu arahkan ke direktori tempat Anda menyimpan proyek ini. NetBeans akan otomatis mengenali struktur proyek.
5.  Untuk menjalankan aplikasi, cari file `progess_bar.java` di dalam package `Akun`.
6.  Klik kanan pada file `progess_bar.java` lalu pilih **Run File** (atau tekan `Shift` + `F6`).
7.  Aplikasi akan dimulai, diawali dengan *splash screen* lalu ke halaman Login.

## Struktur Proyek

Proyek ini disusun dalam beberapa package utama untuk mengorganisir fungsionalitas:

-   `src/Akun`
    -   Berisi semua kelas yang berhubungan dengan manajemen pengguna.
    -   `Login.java`: GUI untuk halaman login.
    -   `Register.java`: GUI untuk halaman registrasi.
    -   `progess_bar.java`: GUI untuk splash screen dan titik masuk utama aplikasi.
    -   `Akun.java`: Kelas model untuk data pengguna.

-   `src/Produk`
    -   Berisi semua kelas yang berkaitan dengan produk dan keranjang belanja.
    -   `ProdukGUI.java`: GUI untuk menampilkan katalog produk.
    -   `Keranjang.java`: GUI untuk halaman keranjang belanja.
    -   `Produk.java`: Kelas *abstract* sebagai dasar untuk semua jenis produk.
    -   `PCGaming.java`: Contoh implementasi produk spesifik.

-   `src/Order`
    -   Berisi kelas-kelas untuk menangani proses transaksi dan invoice.
    -   `TransaksiGUI.java`: GUI untuk halaman pembayaran.
    -   `Order.java` & `Transaksi.java`: Kelas model untuk data pesanan dan transaksi.
    -   `Invoice.java`: Kelas untuk memformat dan menampilkan struk.
