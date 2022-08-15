package Creational_PatternFile.BT2;

public class main {
    public static void main(String[] args) {
        MyString myString = new MyStringBuilder()
                .addStr("Tri")
                .adStringd("Dep tai")
                .addFloat(18)
                .addBool(true)
                .Build();

        System.out.println(myString.inDs());
    }
}
