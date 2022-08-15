
package BT1;

import java.util.ArrayList;


public class Sach {
    String tuaDe;
    int soTrang;
    String tacGia;
    ArrayList<String> chuong = new ArrayList<String>();

    public Sach(Builder builder) {
        this.tuaDe = builder.tuaDe;
        this.soTrang = builder.soTrang;
        this.tacGia = builder.tacGia;
        this.chuong = builder.chuong;
    }

    
    
    private static Sach uniqueIstance;
    
    public static Sach GetInstance(Builder builder){
        if(uniqueIstance == null){
            uniqueIstance = new Sach(builder);
            return uniqueIstance;
        }
        return uniqueIstance;
    }
    
    public void Xuat(){
        System.out.println("Sach");
        System.out.println("\tTua de: "+ tuaDe + "\tSo trang: "+ soTrang + "\tTac gia: " + tacGia);
        for(String i:chuong){
            System.out.println("\t\tChuong: " + i);
        }
    }

    public static class Builder {
        String tuaDe;
        int soTrang;
        String tacGia;
        ArrayList<String>chuong = new ArrayList<String>();

        public Builder() {
            
        }
        
        public Builder addTuaDe(String td){
            this.tuaDe=td;
            return this;
        }
        
        public Builder addTacGia(String tg){
            this.tacGia=tg;
            return this;
        }
        
        public Builder addSoTrang(int s){
            this.soTrang=s;
            return this;
        }
        
        public Builder addChuong(String str){
            this.chuong.add(str);
            return this;
        }
        
        public Sach build(){
//            return new Sach(this);
              return GetInstance(this);
        }
    } 
}
