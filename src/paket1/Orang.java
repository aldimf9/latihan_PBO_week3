package paket1;

public class Orang {
    protected String nama;
    protected String asal;

    public Orang(String nama){
        this.nama = nama;
    }
    public Orang(String nama,String asal){
        this.nama = nama;
        this.asal = asal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }    
}
