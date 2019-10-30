package com.example.kuis_1_1718116;

import android.graphics.drawable.Drawable;

class family {
    private String nama, status;
    private Drawable gambar;

    public family(String nama, String status, Drawable gambar) {
        this.nama = nama;
        this.status = status;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getStatus() {
        return status;
    }

    public Drawable getGambar() {
        return gambar;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setGambar(Drawable gambar) {
        this.gambar = gambar;
    }
}

