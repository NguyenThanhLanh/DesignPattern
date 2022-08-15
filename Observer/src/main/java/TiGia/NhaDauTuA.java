/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiGia;

/**
 *
 * @author L_DELL
 */
public class NhaDauTuA implements TiGia.I_TheoDoiTyGia{
    TiGia t;

    public NhaDauTuA(TiGia t) {
        this.t = t;
        t.attach(this);
    }
    public void huyDangKy(){
        t.detatach(this);
    }

    @Override
    public void capNhatTiGia(float delta) {
        if(delta >0){
            System.out.println("A: bán ra");
        }
        else System.out.println("A: mua vào");
    }
}
