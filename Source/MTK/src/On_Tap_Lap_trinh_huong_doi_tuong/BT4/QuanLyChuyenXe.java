package On_Tap_Lap_trinh_huong_doi_tuong.BT4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLyChuyenXe {
    List<ChuyenXe> chuyenXes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //them chuyen xe
    public void Them() {

        byte lc;
        System.out.println("MENU");
        System.out.println("\nBan muon them xe:" +
                "\n1.Chua quy dinh loai xe" +
                "\n2.Xe ngoai thanh" +
                "\n3.Xe noi thanh");
        lc = scanner.nextByte();
        switch (lc) {
            case 1: {
                //them chuyen xe chung (chua phan loai xe noi thanh hat ngoai thanh)
                byte n;
                System.out.println("So luong: ");
                n = scanner.nextByte();
                scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ma So Chuyen Xe: ");
                    String mscx = scanner.nextLine();
                    System.out.println("Ho ten tai xe: ");
                    String httx = scanner.nextLine();
                    System.out.println("So xe: ");
                    String sx = scanner.nextLine();
                    scanner.nextLine();
                    chuyenXes.add(new ChuyenXe(mscx, httx, sx));
                }
                break;
            }
            case 2: {
                byte n;
                System.out.println("So luong: ");
                n = scanner.nextByte();
                scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ma So Chuyen Xe: ");
                    String mscx = scanner.nextLine();
                    System.out.println("Ho ten tai xe: ");
                    String httx = scanner.nextLine();
                    System.out.println("So xe: ");
                    String sx = scanner.nextLine();
                    System.out.println("Noi den");
                    String nd = scanner.nextLine();
                    System.out.println("So ngay di duoc: ");
                    byte sndc = scanner.nextByte();
                    System.out.println("Doanh Thu");
                    double dt = scanner.nextDouble();
                    scanner.nextLine();
                    chuyenXes.add(new XeNgoaiThanh(mscx, httx, sx, nd, sndc, dt));
                }
                break;
            }
            case 3: {
                byte n;
                System.out.println("So luong: ");
                n = scanner.nextByte();
                scanner.nextLine();
                for (int i = 0; i < n; i++) {
                    System.out.println("Ma So Chuyen Xe: ");
                    String mscx = scanner.nextLine();
                    System.out.println("Ho ten tai xe: ");
                    String httx = scanner.nextLine();
                    System.out.println("So xe: ");
                    String sx = scanner.nextLine();
                    System.out.println("So tuyen");
                    byte st = scanner.nextByte();
                    System.out.println("So KM di duoc: ");
                    double skmdc = scanner.nextDouble();
                    System.out.println("Doanh Thu");
                    double dt = scanner.nextDouble();
                    scanner.nextLine();
                    chuyenXes.add(new XeNoiThanh(mscx, httx, sx, st, skmdc, dt));
                }
                break;
            }
            default:
                break;
        }
    }

    public void inDS() {
        chuyenXes.forEach(chuyenXe -> {
            chuyenXe.inDS();
        });
    }

    void inDSXNgT() {
        chuyenXes.forEach(XeNgoaiThanh -> {
            System.out.println(XeNgoaiThanh.inDS());
        });
    }

    void inDSXNoT() {
        chuyenXes.forEach(XeNoiThanh -> {
            System.out.println(XeNoiThanh.inDS());
        });
    }

    public void indtnt() {
        double tongTien = 0;
        for (int i = 0; i < chuyenXes.toArray().length; i++) {
            if (chuyenXes instanceof XeNoiThanh) {

            }
//        return tongTien;
        }
    }
}
