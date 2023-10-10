package com.example.quanlythuvien.model;

public class LoaiSach {
    private int id;
    private String tenLoai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public LoaiSach(int id, String tenLoai) {
        this.id = id;
        this.tenLoai = tenLoai;
    }
}
