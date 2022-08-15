/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.BT1;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class ThanhVienB implements Topic.IThongBao{
    ArrayList<String> dstt = new ArrayList<String>();
    Topic t;
    public ThanhVienB() {
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
        System.out.println("Thong tin cap nhat B: ");
        System.out.println("Danh sach thong tin: ");
        int k=1;
        for(String i:t.dstt){
            System.out.println("STT "+k+": " + i);
            k++;
        }
        
    }
    
}
