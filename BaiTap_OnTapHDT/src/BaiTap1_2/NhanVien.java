
package BaiTap1_2;

public class NhanVien {

    public NhanVien(String name, byte tuoi, String diachi, double tienluong, int sogiolam) {
        this.name = name;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.sogiolam = sogiolam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getSogiolam() {
        return sogiolam;
    }

    public void setSogiolam(int sogiolam) {
        this.sogiolam = sogiolam;
    }
    String name;
    byte tuoi;
    String diachi;
    double tienluong;
    int sogiolam;
    
    public NhanVien(){
        name="Nguyen Thanh Lanh";
        tuoi=21;
        diachi="Hoai Nhon, Binh Dinh";
        tienluong=32000.2;
        sogiolam=200;
    }
    
    public String getThongTin(){
        return "Nhan vien: \n"+
               "Ten: "+name+"\n"+
               "Tuoi: "+tuoi+"\n"+
               "Dia chi: "+diachi+"\n"+
               "Tien luong: "+tienluong+"\n"+
               "So gio lam: "+sogiolam+"\n";
    }
    
    public double tinhThuong(){
        
        if(sogiolam < 100){
            return tienluong;
        }
        else{
            if( sogiolam >=100 && sogiolam <200){
                return (tienluong + tienluong*0.1);
            }
            else{
                return (tienluong + tienluong*0.2);
            }
        }
    }
    
    
}
