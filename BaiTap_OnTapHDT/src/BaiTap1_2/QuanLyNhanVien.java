package BaiTap1_2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien implements IQuanLy{
    
    List<NhanVien> dsnv = new ArrayList<NhanVien>();

    
    public void QuanLyNhanVien(){
        dsnv=null;
    }
    @Override
    public void ThemNV(NhanVien nv){
        dsnv.add(nv);          
    }

    @Override
    public void inDS() {
        dsnv.forEach(nv -> {System.out.println(nv.getThongTin());});
    }

    @Override
    public void ThemNV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten sv: ");
        String name= scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        byte tuoi= scanner.nextByte();
        System.out.println("Nhap dia chi: ");
        String diachi = scanner.nextLine();
        System.out.println("Nhap tien luong: ");
        double tienluong = scanner.nextDouble();
        System.out.println("Nhap so gio lam: ");
        int sogiolam= scanner.nextInt();
        
        dsnv.add( new NhanVien(name, tuoi, diachi, tienluong, sogiolam) );
    }
    
    
}
