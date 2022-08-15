package On_Tap_Lap_trinh_huong_doi_tuong.BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyNhanVien {
    List<NhanVien> nhanVien = new ArrayList();
    IQuanLy iQuanLy;

    public List<NhanVien> getNhanVien() {
        return nhanVien;
    }
    public void setNhanVien(List<NhanVien> nhanVien) {
        this.nhanVien = nhanVien;
    }
    public IQuanLy getiQuanLy() {
        return iQuanLy;
    }
    public void setiQuanLy(IQuanLy iQuanLy) {
        this.iQuanLy = iQuanLy;
    }

    public void setThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String Name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        int Age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String Direction = scanner.nextLine();
        System.out.println("Nhap tien luong: ");
        double Salary = scanner.nextDouble();
        System.out.println("Nhap gio lam");
        int WorkTime = scanner.nextInt();
        scanner.nextLine();
        nhanVien.add(new NhanVien(Name,Age,Direction,Salary,WorkTime));
    }

    public void inDS(){
        nhanVien.forEach(nhanVien1 -> {
            System.out.println(nhanVien1.getThongTin());;
        });
    }
}
