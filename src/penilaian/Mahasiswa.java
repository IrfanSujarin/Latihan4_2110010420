
package penilaian;

public class Mahasiswa {
    //variabel
    String npm, nama;
    
    //constructor
    public Mahasiswa(String npm, String nama, String prodi){
        this.npm = npm;
        this.nama = nama;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }
}