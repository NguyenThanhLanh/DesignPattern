
package BT;

public class main {
    public static void main(String[] args) {
        Folder Data = new Folder("Data");
        Folder Toan = new Folder("Desin Pattern");
        File ToanCC = new File("Toancaocap.pxp");
        File file1 = new File("Flutter2");
        File file2 = new File("Flutter3");
//        Folder folder3 = new Folder("Toan");
        Data.add(ToanCC);
        Data.add(Toan);
        Toan.add(file1);
        Toan.add(file2);
//        System.out.println(Data.getPath());
//        System.out.println(file1.getPath());
        System.out.println(Data.getStringTreeFolder());
    }
}
