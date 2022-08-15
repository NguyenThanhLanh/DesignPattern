
package BaiTap4;

public class main {
    public static void main(String[] args) {
        QuanLyChuyenXe qlcx = new QuanLyChuyenXe();
        ChuyenXe x1 = new XeNgoaiThanh("CX001", "Nam", "0001", 60000, "Hoi Son", "20/12/2001");
        qlcx.ThemChuyenXe(x1);
        ChuyenXe x2 = new XeNgoaiThanh("CX002", "Khoa", "87974", 30000, "Nha Trang", "20/12/2002");
        qlcx.ThemChuyenXe(x2);
        ChuyenXe x3 = new XeNgoaiThanh("CX003", "Nhat", "87004", 50000, "Nha Trang", "20/12/2002");
        qlcx.ThemChuyenXe(x3);
        ChuyenXe x4 = new XeNoiThanh("CX004", "Loc", "43268", 38400, 3, 3000);
        qlcx.ThemChuyenXe(x4);
        ChuyenXe x5 = new XeNoiThanh("CX005", "Lan", "43238", 38400, 3, 3000);
        qlcx.ThemChuyenXe(x5);
        ChuyenXe x6 = new XeNoiThanh("CX006", "Len", "45238", 38400, 3, 3000);
        qlcx.ThemChuyenXe(x6);
        
        qlcx.DSChuyenXe();
        qlcx.XuatThongTinChiTietTungChuyenXe();
        System.out.println("Tong doanh thu:\t" + qlcx.TongDoanhThu());
        System.out.println("Tong doanh thu xe Noi Thanh:\t" + qlcx.TongDoanhThuXeNoiThanh());
        System.out.println("Tong doanh thu xe Ngoai Thanh:\t" + qlcx.TongDoanhThuXeNgoaiThanh());
        

    }
}
