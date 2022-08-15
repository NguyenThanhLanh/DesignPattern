/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer.BT1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author L_DELL
 */
public class Topic {
    public ArrayList<String> dstt = new ArrayList<>();
    private ArrayList<IThongBao> dstb = new ArrayList<IThongBao>();
    public Topic() {
//        this.dstt=null;
//        this.dstb = null;
    }
    
    public void TaoThongTinMoi(String tt){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap thong tin muon tao: ");
//        String tt = scanner.nextLine();
        dstt.add(tt);
        if(dstb!=null){
        dstb.forEach((t) -> {
        t.CapNhatThongTin();
        });       
        }
    }
    
    public void attach(IThongBao tb){
        if(!dstb.contains(tb)){
            dstb.add(tb);
        }
    }
    
    public void detach(IThongBao tb){
        if(dstb.contains(tb)){
            dstb.remove(tb);
        }
    }
    
    public static interface IThongBao{
        void CapNhatThongTin();
    }
}
