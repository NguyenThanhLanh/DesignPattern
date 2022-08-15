/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buider.BT2;

/**
 *
 * @author L_DELL
 */
class MyString {
    String str;

    public MyString(MyStringBuilder b) {
        this.str=b.mystr;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public static class MyStringBuilder{
        String mystr="";

        public MyStringBuilder() {
        }
        
        public MyStringBuilder addString(String str){
            this.mystr+=str;
            return this;
        }
        
        public MyStringBuilder addFloat(float f){
            this.mystr+=f;
            return this;
        }
        
        public MyStringBuilder addBoolean(boolean b){
            this.mystr+=b;
            return this;
        }
        
        public MyString build(){
            return new MyString(this);
        }
    }
}
