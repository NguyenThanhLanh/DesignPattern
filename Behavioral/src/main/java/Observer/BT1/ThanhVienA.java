/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.BT1;

/**
 *
 * @author L_DELL
 */
public class ThanhVienA implements Topic.IThongBao{
    Topic t;

    public ThanhVienA() {
    }
    
    public void DangKiTopic(Topic tt){
        this.t=tt;
        t.attach(this);
    }
    
    public void HuyDangKiTopic(){
        t.detach(this);
    }
    
    @Override
    public void CapNhatThongTin() {
        System.out.println("Thong tin cap nhat A: ");
        System.out.println("Co thong tin moi! ");
        System.out.println("Thong tin moi la: " + t.dstt.get(t.dstt.size()-1));
    }
    
}
