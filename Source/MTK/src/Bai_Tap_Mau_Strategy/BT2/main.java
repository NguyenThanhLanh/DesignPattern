package Bai_Tap_Mau_Strategy.BT2;

public class main {
    public static void main(String[] args) {
        //cach 1
        GioHang gioHang = new GioHang();
        System.out.println("Gio hang 1: \n");
        gioHang.getHh().add(new HangHoa("Nhang",5000,"Nhang Muoi"));
        gioHang.getHh().add(new HangHoa("Muoi",2000,"Muoi"));
        gioHang.getHh().add(new HangHoa("Duong",1000,"Duong"));
        gioHang.getHh().add(new HangHoa("Keo",10000,"Keo"));
        gioHang.getHh().add(new HangHoa("Thit heo",250000,"Thit heo"));

        gioHang.setHinhThucTT(new ThanhToanOnline());
        gioHang.inDS();
        System.out.println(gioHang.thanhToan());
        System.out.println("\n");

        System.out.println("Gio hang 2: \n");
        GioHang gioHang1 = new GioHang();
        gioHang1.getHh().add(new HangHoa("CaRem",5000,"Kem"));
        gioHang1.getHh().add(new HangHoa("Kem Chuoi",2000,"Kem chuoi"));
        gioHang1.getHh().add(new HangHoa("Gao",1000,"Gao"));
        gioHang1.getHh().add(new HangHoa("Keo",10000,"Keo"));
        gioHang1.getHh().add(new HangHoa("Thit heo",250000,"Thit heo"));

        gioHang1.setHinhThucTT(new ThanhToanCOD());
        gioHang1.inDS();
        System.out.println(gioHang1.thanhToan());

    }
}

