package Akun;

import java.util.ArrayList;

public class Akun {
    private String username;
    private String password;
    private String noTelp;

    public static ArrayList<Akun> daftarAkun = new ArrayList<>();

    public Akun(String username, String password, String noTelp) {
        this.username = username;
        this.password = password;
        this.noTelp = noTelp;
        daftarAkun.add(this);  
    }

    public String getUsername() {
        return username;
    }

    public boolean cekPassword(String pass) {
        return this.password.equals(pass);
    }
}
