
package BT;

public abstract class AbstractFile {
    String name;
    String path;
    String preStr="";

    public AbstractFile(String name, String path) {
        this.name = name;
        this.path = path;
    }
    
    public AbstractFile(String name){
        this.name=name;
    }
    
    protected abstract void add(AbstractFile f);
    protected abstract void remove(AbstractFile f);
    protected abstract String getStringTreeFolder();
    public String getPath(){
        return path;
    }

}
