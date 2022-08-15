package iterator.vidu;

public class ConcreteIterator extends Iterator{
    SoNguyen soNguyen;
    int i=0;
    public ConcreteIterator(SoNguyen soNguyen) {
        this.soNguyen = soNguyen;
    }

    @Override
    Object First() {
       return soNguyen.getItem(i);
    }

    @Override
    Object Next() {
        if(isDone())
        return soNguyen.getItem(++i);
        else return null;
    }

    @Override
    boolean isDone() {
      return i< (soNguyen.count() -1);
    }

    @Override
    Object CurrentItem() {
        return soNguyen.getItem(i);
    }
}
