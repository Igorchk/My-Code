class Field {
    public String Key;
    public String Value;
}

public class TESTER {
    public static void main(String[] args) {
        Field field = new Field();
        field.Key = "0000";
        field.Value = "Poop";
        System.out.println(field.Key + field.Value);
    }
}
