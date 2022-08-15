package Creational_PatternFile.BT2;

public class MyString {
    public String Str;

    public String getStr() {
        return Str;
    }

    public void setStr(String str) {
        Str = str;
    }

    public MyString(String str) {
        Str = str;
    }

    public String inDs(){
        return "MyString{" +
                "Str='" + Str + '\'' +
                '}';
    }
}
