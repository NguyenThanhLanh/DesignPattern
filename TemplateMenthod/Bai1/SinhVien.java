package TemplateMenthod.Bai1;

public class SinhVien {
    int id;
    String ten,quenQuan;
    int namSinh;

    public SinhVien(int id, String ten, String quenQuan, int namSinh) {
        this.id = id;
        this.ten = ten;
        this.quenQuan = quenQuan;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", quenQuan='" + quenQuan + '\'' +
                ", namSinh=" + namSinh +
                '}';
    }
}
