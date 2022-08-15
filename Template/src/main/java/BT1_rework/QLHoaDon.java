/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1_rework;

import java.util.ArrayList;

/**
 *
 * @author L_DELL
 */
public class QLHoaDon {
    ArrayList<HoaDon> dsHD = new ArrayList<HoaDon>();
    
    public void Xuat(){
        for(HoaDon i:dsHD){
            i.Xuat();
        }
    }
    
    public void add(HoaDon hd){
        dsHD.add(hd);
    }
}
