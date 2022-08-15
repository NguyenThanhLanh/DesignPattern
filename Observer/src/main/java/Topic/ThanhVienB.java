/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic;

/**
 *
 * @author L_DELL
 */
public class ThanhVienB implements Topic.INotification{
    Topic t;
    
    public void DangKyTopcic(Topic tt){
        this.t = tt;
        t.attach(this);
    }
    public void HuyDangKyTopic(){
        t.detach(this);
    }

    @Override
    public void capNhatThongTin() {
        System.out.println("cap nhat thong B: ");
        System.out.println("Danh Sach thong tin: ");
        int k=1;
        for(String i: t.dsthongtin){
            System.out.println("stt: "+k+":"+i);
            k++;
        }
    }
}
