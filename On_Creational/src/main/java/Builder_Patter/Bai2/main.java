
package Builder_Patter.Bai2;

public class main {
    public static void main(String[] args) {
        MyString str = new MyString.MyStringBuilder()
            .addString("Ten: Nguyen Thanh Lanh , Diem: ")
            .addFloat(7.8f)
            .addString(" \tGioi Tinh: ")
            .addBoolean(Boolean.TRUE)
            .build();
        System.out.println(str.str);
    }
   
}
