package builder.bai2;

public class main {
    public static void main(String[] args) {
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder()
                .addString("xyz")
                .addFloat(12.3f)
                .addBoolean(true)
                .build();

       System.out.println(myStringBuilder.toString());
       StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.append("abc");
       stringBuilder.append(12.2);
       stringBuilder.append(true);
       System.out.println(stringBuilder.toString());
    }
}
