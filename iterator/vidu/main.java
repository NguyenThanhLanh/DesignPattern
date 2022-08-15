package iterator.vidu;

public class main {
    public static void main(String[] args) {
        SoNguyen soNguyen = new SoNguyen(new int[]{1, 2, 3,4,5,6,7});
        Iterator A= soNguyen.CreateIterator();
        System.out.println(A.First());
        while (A.Next() != null){
            System.out.println(A.CurrentItem());
        }
    }
}
