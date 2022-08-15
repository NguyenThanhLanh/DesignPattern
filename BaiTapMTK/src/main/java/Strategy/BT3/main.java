package Strategy.BT3;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws ParseException {
        QLSV qlsv = new QLSV();
        SinhVien sv;
        String ten;
        Date ngsinh; 
        String day_tam;
        float diem;
        boolean pt;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap ten sv: ");
            ten = sc.nextLine();
            System.out.println("Nhap ngay sinh sv: ");
            day_tam = sc.nextLine();
            ngsinh = new SimpleDateFormat("dd/MM/yyyy").parse(day_tam);
            sc.nextLine();
            System.out.println("Nhap diem: ");
            diem = Float.parseFloat(sc.nextLine());
            sv = new SinhVien(ten, ngsinh, diem);
            qlsv.dssv.add(sv);
            System.out.println("Ban co muon nhap tiep? (true: co, false: khong)");
            pt = Boolean.parseBoolean(sc.next());
            sc.nextLine();
            
        }while (pt);       
            qlsv.Xuat();
            qlsv.SapXep();
                    
            qlsv.Xuat();
            qlsv.SapXep();
            qlsv.Xuat();
        
    }
}
