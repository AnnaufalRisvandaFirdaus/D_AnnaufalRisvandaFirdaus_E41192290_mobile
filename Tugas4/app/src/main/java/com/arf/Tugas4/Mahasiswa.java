package com.arf.Tugas4;

public class Mahasiswa {

    private String nama;
    private String npm;
    private String prodi;

    public Mahasiswa(String nama, String npm, String prodi) {
        this.nama = nama;
        this.npm = npm;
        this.prodi = prodi;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getprodi() {
        return prodi;
    }

    public void setprodi(String prodi) {
        this.prodi = prodi;
    }
}
