package Creational_PatternFile.BT2;

public class MyStringBuilder implements IMyString{
    public String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }


    @Override
    public MyStringBuilder adStringd(String Str) {
        str = Str;
        return this;
    }

    @Override
    public MyStringBuilder addStr(String Str) {
        str += Str;
        return this;
    }

    @Override
    public MyStringBuilder addFloat(float f) {
        str += String.valueOf(f);
        return this;
    }

    @Override
    public MyStringBuilder addBool(boolean b) {
        str += String.valueOf(b);
        return this;
    }

    @Override
    public MyString Build() {
        return new MyString(str);
    }


}
