/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTTienDien;

import java.util.Scanner;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        ITinhTienDien T1 = new GiaThuong(1.678, 50);
        ITinhTienDien T2 = new GiaThuong(1.734, 50);
        ITinhTienDien T3 = new GiaThuong(2.014, 100);
        ITinhTienDien T4 = new GiaThuong(2.536, 100);
        ITinhTienDien T5 = new GiaThuong(2.834, 100);
        ITinhTienDien T6 = new GiaCaoNhat(2.927, 100);
        T1.setSuccessor(T2).setSuccessor(T3).setSuccessor(T4).setSuccessor(T5).setSuccessor(T6);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien tieu thu: ");
        int kw = sc.nextInt();
        System.out.println("So kw tieu thu: "+kw);
        System.out.println("Tong tien: "+T1.tinhTien(kw));
    }
}
