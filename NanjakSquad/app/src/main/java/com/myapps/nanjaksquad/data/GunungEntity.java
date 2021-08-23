package com.myapps.nanjaksquad.data;

public class GunungEntity {
    private String nama;
    private int image;
    private String ketinggian;
    private String lokasi;
    private String keterangan;

    public GunungEntity(String nama, int image, String ketinggian, String lokasi, String keterangan){
        this.nama = nama;
        this.image = image;
        this.lokasi = lokasi;
        this.ketinggian = ketinggian;
        this.keterangan = keterangan;
    }

    public String getNama(){ return nama;}

    public void setNama(String nama){
        this.nama = nama;
    }

    public int getimage(){ return image;}

    public void setImage(int image){
        this.image = image;
    }

    public String getKetinggian(){ return ketinggian;}

    public void setKetinggian(String ketinggian){
        this.ketinggian = ketinggian;
    }

    public String getLokasi(){return lokasi;}

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKeterangan(){ return keterangan;}

    public void setKeterangan(String keterangan){
        this.keterangan = keterangan;
    }
}
