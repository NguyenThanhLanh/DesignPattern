/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTSV;

/**
 *
 * @author L_DELL
 */
public class SinhVienDB extends EntityDB<SinhVien>{

    public SinhVienDB() {
        super();
    }

    
    @Override
    protected int getKey(SinhVien t) {
        return t.id;
    }
    
    public void Xuat(){
        int i=1;
        
        for(SinhVien t: entities){
            System.out.println("Sinh vien "+i);
            System.out.println("         Id: "+t.id);
            System.out.println("         Ten: "+t.ten);
            System.out.println("         Que quan: "+t.queQuan);
            System.out.println("         Nam sinh: "+t.queQuan);
            i++;
        }
        
    }
    
}
