
package BT3;

public class main {
    public static void main(String[] args) {
        QLSV dsSV = new QLSV();
        SinhVien sv0 = new SinhVien("Lanh", "01/10/2021", 7.8f);
        SinhVien sv1 = new SinhVien("Canh", "01/10/2021", 7.3f);
        SinhVien sv2 = new SinhVien("Hanh", "01/10/2021", 7.4f);
        dsSV.ThemSV(sv0);
        dsSV.ThemSV(sv1);
        dsSV.ThemSV(sv2);
        System.out.println(sv1.getDiem()>sv2.getDiem());
        dsSV.SapXep();
       
        dsSV.Xuat();
    }
}
