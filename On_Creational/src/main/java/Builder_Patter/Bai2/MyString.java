
package Builder_Patter.Bai2;

public class MyString {

    String str = "Hoc sinh";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    
    public MyString(MyStringBuilder build){
        this.str = build.str;
    }

    public static class MyStringBuilder {
        String str="";
        public MyStringBuilder() {
        }
        
        public MyStringBuilder addString(String str){
            this.str+=str;
            return this;
        }
        
        public MyStringBuilder addFloat(float n){
            this.str += n;
            return this;
        }
        
        public MyStringBuilder addBoolean(Boolean b){
            this.str += b;
            return this;
        }
        
        public MyString build(){
            return new MyString(this);
        }
    }
}
