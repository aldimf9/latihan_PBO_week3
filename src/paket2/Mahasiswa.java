package paket2;
import paket1.Orang;
public class Mahasiswa extends Orang {
    protected String nim;
    protected String prodi;
    public Mahasiswa(String nim,String nama,String asal,String prodi){
      super(asal,nama);
      this.asal = asal;
      this.nama = nama;
      this.nim = nim;
      this.prodi = prodi;
    }
        public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
     public void display(){
            System.out.println("Nim  : "+getNim());
            System.out.println("Nama : "+getNama());
            System.out.println("Asal : "+getAsal());
            System.out.println("Prodi: "+getProdi());
     }

}
