package builder.bai2;

public class MyStringBuilder {
    private String str;

    @Override
    public String toString() {
        return str;
    }

    public MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    public static class Builder {
        String str="";
        public Builder addString(String s){
            this.str= str+s;
            return this;
        }

        public Builder addFloat(float f){
            this.str= str+ f;
            return this;
        }
        public Builder addBoolean(boolean b){
            String s = b ? "true" : "false";
            this.str = str+ s;
            return this;
        }
        public MyStringBuilder build(){
            return new MyStringBuilder(this);
        }
    }
}
