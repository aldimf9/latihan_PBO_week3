package paket2;
public class TestMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs1 = new Mahasiswa("1301213053","Aldi","Madiun","IF");
        Mahasiswa mhs2 = new Mahasiswa("1301213067","Farhan","Ngawi","DS");
        System.out.println("Data Mahasiswa 1");
        mhs1.display();
        System.out.println("Data Mahasiswa 2");
        mhs2.display();
    }
}
