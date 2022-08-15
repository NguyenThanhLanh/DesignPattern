/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT_TiGia;

/**
 *
 * @author L_DELL
 */
public class NhaDauTuA implements TiGia.I_TheDoiTiGia {

    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
        t.attach(this);
    }
    
    public void HuyDangKy(){
        t.detach(this);
    }
    
    @Override
    public void capNhatTiGia(float delta) {
        if(delta > 0){
            System.out.println("A: Mua vao");
        }
        else{
            if(delta == 0){
                System.out.println("A: doi");
            }
            else{
                System.out.println("A: Ban ra ");
            }
        }      
    }
    
}
