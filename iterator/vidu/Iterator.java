package iterator.vidu;

public abstract class Iterator<T> {
    abstract T First();
    abstract T Next();
    abstract boolean isDone();
    abstract T CurrentItem();
}
