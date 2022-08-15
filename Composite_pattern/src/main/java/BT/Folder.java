
package BT;

import java.util.ArrayList;


public class Folder extends AbstractFile{
    
    ArrayList<AbstractFile> folder = new ArrayList<AbstractFile>();

    public Folder(String name, String path) {
        super(name, path);
    }

    public Folder(String name) {
        super(name);
    }
    
    
    @Override
    protected void add(AbstractFile f) {
        if(!folder.contains(f)){
            folder.add(f);
            f.path=this.path + "\\" + f.name;
        }
    }

    @Override
    protected void remove(AbstractFile f) {
        if(folder.contains(f)){
            folder.remove(f);
        }
        else{
            System.out.println("File khong ton tai! ");
        }
    }

    @Override
    protected String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(preStr)
                .append(name);
        for (AbstractFile f:folder){
            f.preStr = this.preStr + "..";
            builder.append("\n")
                    .append(f.getStringTreeFolder());
            f.preStr="";
        }
        return builder.toString();
    }
    
    @Override
    public String getPath(){
        return this.path +"/" + this.name;
    }
}
