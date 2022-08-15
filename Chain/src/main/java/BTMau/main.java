/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTMau;

import jdk.jfr.Label;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        IXepLoai Gioi = new XepLoaiCaoNhat("Gioi", 10);
        IXepLoai Kha  = new XepLoaiThuong("kha", 8);
        IXepLoai TrungBinh = new XepLoaiThuong("Trung binh", 7);
        IXepLoai Yeu = new XepLoaiThuong("yeu", 5);
        Yeu.setSucesser(TrungBinh)
                .setSucesser(Kha)
                .setSucesser(Gioi);
        System.out.println("Xep loai 5: "+ Yeu.XepLoai(5));
        System.out.println("Xep loai 3: "+ Yeu.XepLoai(3));

        System.out.println("Xep loai 6.5: "+ Yeu.XepLoai((float)6.5f));
        System.out.println("Xep loai 7.5: "+ Yeu.XepLoai((float)7.5f));
        System.out.println("Xep loai 8.5: "+ Yeu.XepLoai((float)8.5f));
        System.out.println("Xep loai 9.5: "+ Yeu.XepLoai((float)9.5f));
        
    }
}
