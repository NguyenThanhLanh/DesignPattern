/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic;

/**
 *
 * @author L_DELL
 */
public class ThanhVienA implements Topic.INotification{
    Topic t;
    
    public void DangKyTopic(Topic tt){
        this.t=tt;
        t.attach(this);
    }
    
    public void HuyDangKyTopic(){
        t.detach(this);
    }

    @Override
    public void capNhatThongTin() {
        System.out.println("thong tin cap nhat A: ");
        System.out.println("có thong tin moi!");
        System.out.println("thong tin moi là: "+t.dsthongtin.get(t.dsthongtin.size()-1));
    }
}
