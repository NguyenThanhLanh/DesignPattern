
package BaiTap;


public class main {
    public static void main(String[] args) {
        BieuThuc bieuThuc = new BieuThucDonGian(6f);
        //System.out.println(bieuThuc.bieuThuc());
        bieuThuc = new Cong(9f,bieuThuc);
        bieuThuc = new Nhan(8f,bieuThuc);
        bieuThuc = new Cong(5f,bieuThuc);
        System.out.println(bieuThuc.bieuThuc());
        System.out.println("Giá trị của biểu thức là "+ bieuThuc.giaTri());
        bieuThuc = new BieuThucDonGian(8f);
        bieuThuc = new Cong(6f,bieuThuc);
        bieuThuc = new Chia(2f,bieuThuc);
        bieuThuc = new Nhan(5f,bieuThuc);
        bieuThuc = new Cong(8f,bieuThuc);
        bieuThuc = new Tru(4f,bieuThuc);
        System.out.println(bieuThuc.bieuThuc());
        System.out.println("Giá trị của biểu thức là "+ bieuThuc.giaTri());
        System.out.println(bieuThuc.bieuThuc());
    }
}
