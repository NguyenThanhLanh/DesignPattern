package On_Tap_Lap_trinh_huong_doi_tuong.BT1;
import java.util.List;
import java.util.Scanner;

public class NhanVien {
    String Name;
    int Age;
    String Direction;
    double Salary;
    int WorkTime;

    //Contructor
    public NhanVien(String name, int age, String direction, double salary, int workTime) {
        Name = name;
        Age = age;
        Direction = direction;
        Salary = salary;
        WorkTime = workTime;
    }

//    public void setThongTin(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap ten: ");
//        String Name = scanner.nextLine();
//        System.out.println("Nhap tuoi: ");
//        int Age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Nhap dia chi: ");
//        String Direction = scanner.nextLine();
//        System.out.println("Nhap tien luong: ");
//        double Salary = scanner.nextDouble();
//        System.out.println("Nhap gio lam");
//        int WorkTime = scanner.nextInt();
//        scanner.nextLine();
//    }

    public String getThongTin(){
        return "NhanVien{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Direction='" + Direction + '\'' +
                ", Salary=" + Salary +
                ", WorkTime=" + WorkTime +
                '}';
    }

    double tinhThuong(){
        if (WorkTime >= 200)
            return Salary + Salary*0.2;
        if (WorkTime < 200 && WorkTime >= 100)
            return Salary + Salary*0.1;
        else
            return Salary;
    }

}
