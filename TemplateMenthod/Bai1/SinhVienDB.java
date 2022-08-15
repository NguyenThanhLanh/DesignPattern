package TemplateMenthod.Bai1;

import java.util.Date;

public class SinhVienDB extends EntityDB<SinhVien>{
    @Override
    protected int getKey(SinhVien sinhVien) {
        return sinhVien.id;
    }

    @Override
    protected void print(SinhVien sinhVien) {
        System.out.println("id "+sinhVien.id);
        System.out.println("Ten "+sinhVien.ten);
        System.out.println("NamSinh "+sinhVien.namSinh);
        System.out.println("Que Quan "+sinhVien.quenQuan);
    }

    public void inDS(){
        StringBuilder builder= new StringBuilder();
        for (SinhVien sv:entities) {
            builder.append(sv.toString());
            builder.append("\n");
        }
        System.out.println(builder);
    }
}
