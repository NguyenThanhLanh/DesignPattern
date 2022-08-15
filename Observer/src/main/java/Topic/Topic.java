/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class Topic {
    public ArrayList<String> dsthongtin = new ArrayList();
    private ArrayList<INotification> dsthongbao = new ArrayList<INotification>();
    
    
    public void taoThongTinMoi(String thongtin){
        dsthongtin.add(thongtin);
        if(dsthongbao!=null){
            dsthongbao.forEach((tt) -> {
                tt.capNhatThongTin();
            });
        }
    }
    
    public void attach(INotification thongbao){
        if(!dsthongbao.contains(thongbao)){
            dsthongbao.add(thongbao);
        }
    }
    
    public void detach(INotification thongbao){
        if(dsthongbao.contains(thongbao)){
            dsthongbao.remove(thongbao);
        }
    }
    
    public static interface INotification{
        void capNhatThongTin();
    }
}
