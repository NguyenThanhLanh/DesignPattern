/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BTMau;

/**
 *
 * @author L_DELL
 */
public class XepLoaiCaoNhat implements IXepLoai{
    String label;
    float max;

    public XepLoaiCaoNhat(String label, float max) {
        this.label = label;
        this.max = max;
    }
    @Override
    public IXepLoai setSucesser(IXepLoai xeploai) {
        return null;
    }

    @Override
    public String XepLoai(float diem) {
        if(diem<=max){
            return label;
        }
        else
            {
                return "khong xep loai duoc";
            }
    }
    
}
