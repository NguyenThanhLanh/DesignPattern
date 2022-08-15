/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM;

/**
 *
 * @author L_DELL
 */
public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoang A = new TaiKhoang("Ku Ti", 1000, atm);
        TaiKhoang lanh = new TaiKhoang("Lanh", 2000, atm);
        System.out.println("----------------------------");
        System.out.println("giao dich lan 1");
        A.duaTheVao();
        System.out.println("kiem tra so du: " + A.KiemTraSodu());
        atm.rutTien(940);
        System.out.println("kiem tra so du: " + A.KiemTraSodu());
        A.rutThe();
        System.out.println("----------------------------");
        System.out.println("giao dich lan 2");
        A.duaTheVao();
        System.out.println("kiem tra so du: " + A.KiemTraSodu());
        atm.rutTien(940);
        System.out.println("kiem tra so du: " + A.KiemTraSodu());
        A.rutThe();
        System.out.println("----------------------------");
        System.out.println("giao dich lan 3");
        lanh.duaTheVao();
        System.out.println("kiem tra so du: " + lanh.KiemTraSodu());
        atm.rutTien(940);
        System.out.println("kiem tra so du: " + lanh.KiemTraSodu());
        lanh.rutThe();
        System.out.println("----------------------------");
        System.out.println("giao dich lan 4");
        atm.rutTien(940);
    }
}
