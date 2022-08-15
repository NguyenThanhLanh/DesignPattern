/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiThi;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class Stream {
    ArrayList<User> dsUsers = new ArrayList<>();
    ArrayList<IThongBao> dsclient = new ArrayList();

    public Stream() {
    }
    
    public void listen(IThongBao t){
        this.dsclient.add(t);
    }
    
    public void add(User user){
        dsUsers.add(user);
        if(dsclient != null){
            dsclient.forEach((t) -> {
                t.ThongBaoToiClient(user);
            });
        }
    }
    public void attach(IThongBao thongbao){
        if(!dsclient.contains(thongbao)){
            dsclient.add(thongbao);
        }
    }
    
    public void detach(IThongBao thongbao){
        if(dsclient.contains(thongbao)){
            dsclient.remove(thongbao);
        }
    }
    public static interface IThongBao{
        void ThongBaoToiClient(User t);
    }
}
