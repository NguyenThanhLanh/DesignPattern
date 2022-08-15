/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTStragery.BT1;

/**
 *
 * @author L_DELL
 */
public class HangHoa {
    String tenHH;
    double gia;
    String mota;

    public HangHoa(String tenHH, double gia, String mota) {
        this.tenHH = tenHH;
        this.gia = gia;
        this.mota = mota;
    }
    
    public void Xuat(){
        System.out.println("Ten mat hang: "+ this.tenHH+"\tGia: "+this.gia+"\tMo ta: "+this.mota);
    }
    
}
