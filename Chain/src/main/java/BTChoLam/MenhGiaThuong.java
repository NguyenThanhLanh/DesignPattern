/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTChoLam;

/**
 *
 * @author L_DELL
 */
public class MenhGiaThuong implements IXepLLoaiTien{
    int menhgia;
    IXepLLoaiTien xepLoaiThapHon;

    public MenhGiaThuong(int menhgia) {
        this.menhgia = menhgia;
    }

    @Override
    public IXepLLoaiTien ThapHon(IXepLLoaiTien XepLoaiTien) {
        this.xepLoaiThapHon=XepLoaiTien;
        return XepLoaiTien;
    }

    @Override
    public int TienThua(int tien) {
        int soto=0;
        if(tien>=this.menhgia){
            soto= (int)tien/this.menhgia;
            tien=tien-soto*this.menhgia;
            System.out.println("So to "+this.menhgia+"k: "+soto);
            if(tien>0||this.xepLoaiThapHon!=null){
                return this.xepLoaiThapHon.TienThua(tien);
            }
        }
        else{if(tien!=0){
            return this.xepLoaiThapHon.TienThua(tien);
            }
        }
        return 0;
    }
}
