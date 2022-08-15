
package Builder_Patter.Bai1;

public class HoaDonHeader {
    String maHD, ngayBan, tenKH;

    public HoaDonHeader(String maHD, String ngayBan, String tenKH) {
        this.maHD = maHD;
        this.ngayBan = ngayBan;
        this.tenKH = tenKH;
    }
    
    public void Xuat(){
        System.out.println("Ma hoa don: " + maHD);
        System.out.println("Ngay ban: " + ngayBan);
        System.out.println("Ten khach hang: " + tenKH );
    }
    
}
