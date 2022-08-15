
package Builder_Patter.Bai1;

import java.util.ArrayList;

public class HoaDon {
    HoaDonHeader hoaDonHeader;
    ArrayList<CTHD> dsSP = new ArrayList<CTHD>();
    
    public HoaDon( Builder build){
        this.hoaDonHeader = build.hoaDonHeader;
        this.dsSP = build.dsSP;
    }
    
    public void Xuat(){
        hoaDonHeader.Xuat();
        for(CTHD i:dsSP){
            i.Xuat();
        }
    }

    public static class Builder {
        HoaDonHeader hoaDonHeader;
        ArrayList<CTHD> dsSP = new ArrayList<CTHD>();
        public Builder() {
            
        }
        
        public Builder addHoaDonHeader(HoaDonHeader hdHD){
            this.hoaDonHeader=hdHD;
            return this;
        }
        
        public Builder addCTHD(CTHD cthd){
           this.dsSP.add(cthd);
           return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
    
}
