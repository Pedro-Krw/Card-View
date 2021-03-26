package com.example.cardview_demo;

public class MyMovieData {
    private String Nama;
    private String Date;
    private Integer image;

    public MyMovieData(String nama, String date, Integer image) {
        Nama = nama;
        Date = date;
        this.image = image;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
