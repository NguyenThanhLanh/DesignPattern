/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTMau;

/**
 *
 * @author L_DELL
 */
public class XepLoaiThuong implements IXepLoai{
    String label;
    float max;
    IXepLoai xeploai;
    public XepLoaiThuong( String label, float max) {
        this.label = label;
        this.max = max;
    }
    
    
    
    @Override
    public IXepLoai setSucesser(IXepLoai xeploai) {
        this.xeploai=xeploai;
        return xeploai;
    }

    @Override
    public String XepLoai(float diem) {
        if(diem<max){
            return label;
        }
        else{
            if(xeploai!=null){
                return xeploai.XepLoai(diem);
            }
            else
            {
                return  "Khong xep loai duoc! ";
            }
        }
    }
    
}
