
package BT;

public class File extends AbstractFile{

    public File(String name, String path) {
        super(name, path);
    }

    public File(String name) {
        super(name);
    }

    
    @Override
    protected void add(AbstractFile f) {
        System.out.println("Khong the add file!");
    }

    @Override
    protected void remove(AbstractFile f) {
        System.out.println("Khong the xoa file!");
    }

    @Override
    protected String getStringTreeFolder() {
        return this.preStr + name;
    }
    
    @Override
    public String getPath() {
        return super.getPath() +"/" + this.path;
    }
    
}
