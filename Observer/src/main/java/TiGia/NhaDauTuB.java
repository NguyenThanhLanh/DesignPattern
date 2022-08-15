/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiGia;

/**
 *
 * @author L_DELL
 */
public class NhaDauTuB implements TiGia.I_TheoDoiTyGia{
    TiGia t;

    public NhaDauTuB(TiGia t) {
        this.t = t;
        t.attach(this);
    }

    public void huyDangKy(){
        t.detatach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta >0){
            System.out.println("B: bán ra");
        }
        if(delta == 0) System.out.println("B: ngồi chờ");
        if(delta <0) System.out.println("B: mua vào");
    }
}
