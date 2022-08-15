/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTChoLam;

/**
 *
 * @author L_DELL
 */
public class MenhGiaThapNhat implements IXepLLoaiTien{

    int menhgia;
    
    public MenhGiaThapNhat(int menhgia) {
        this.menhgia = menhgia;
    }

    @Override
    public IXepLLoaiTien ThapHon(IXepLLoaiTien XepLoaiTien) {
        return null;
    }

    @Override
    public int TienThua(int tien) {
        System.out.println("So to "+this.menhgia+"k: "+tien);
        return tien;
    }
    
}
