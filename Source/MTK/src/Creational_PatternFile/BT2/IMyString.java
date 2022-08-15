package Creational_PatternFile.BT2;

public interface IMyString {
    MyStringBuilder adStringd(String Str);
    MyStringBuilder addStr(String Str);
    MyStringBuilder addFloat(float f);
    MyStringBuilder addBool(boolean b);

    MyString Build();
}
