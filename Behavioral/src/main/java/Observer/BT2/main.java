
package Observer.BT2;

public class main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        TaiKhoang tk1 = new TaiKhoang("ThanhLanh", 3000000, atm);
        TaiKhoang tk2 = new TaiKhoang("ThanhLong", 5000000, atm);
        TaiKhoang tk3 = new TaiKhoang("ThanhChu", 8000000, atm); 
        System.out.println("Giao dich lan 1: ");
        tk1.DuaTheVao();
        System.out.println("Kiem tra so du: " + tk1.kiemTraSoDu());
        atm.RutTien(2000000, atm.kiemtraTienRut(2000000));
        System.out.println("Kiem tra so du: " + tk1.kiemTraSoDu());
        tk1.RutThe();
        
        System.out.println("Giao dich lan 2: ");
        tk2.DuaTheVao();
        System.out.println("Kiem tra so du: " + tk2.kiemTraSoDu());
        atm.RutTien(6000000, atm.kiemtraTienRut(6000000));
        System.out.println("Kiem tra so du: " + tk2.kiemTraSoDu());
        tk2.RutThe();
        
        System.out.println("Giao dich lan 3: ");
        tk3.DuaTheVao();
        System.out.println("Kiem tra so du: " + tk3.kiemTraSoDu());
        atm.RutTien(7000000, atm.kiemtraTienRut(7000000));
        System.out.println("Kiem tra so du: " + tk3.kiemTraSoDu());
        tk3.RutThe();
        System.out.println("Thu rut khong co the: ");
        atm.RutTien(7000000, atm.kiemtraTienRut(7000000));
        
        
    }
}
