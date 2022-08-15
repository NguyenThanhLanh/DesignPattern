/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

import java.util.Scanner;

public class mainGioHang {
    public static void main(String[] args) {
           MatHang mh1 = new MatHang("Cam", 3000, 200);
           MatHang mh2 = new MatHang("Buoi", 5000, 100);
           MatHang mh3 = new MatHang("Man", 6000, 500);
           MatHang mh4 = new MatHang("Kiqi", 6000, 100);
           GioHang gh;
           HoaDonFactory hdFactory = new HoaDonFactory();
           System.out.println("Nhap phuong thuc thanh toan: (true: online,false: COD)");
           
           Scanner sc = new Scanner(System.in);
           boolean tt = sc.nextBoolean();
           if(tt){
               gh = new GioHangOnline();
               gh.add(mh1);
                gh.add(mh2);
                gh.add(mh3);
                gh.add(mh4);
                gh.Xuat();
           }
           else
           {
               gh = new GioHangCOD();
               gh.add(mh1);
               gh.add(mh2);
               gh.add(mh3);
               gh.add(mh4);
               gh.Xuat();
           }
           System.out.println("\n\n");
           System.out.println("============================HOA DON=====================================");
           HoaDon hoaDon = hdFactory.CreateHD("Nguyen Thanh Lanh", "10-07-2001", gh);
           hoaDon.Xuat();
    }
}
