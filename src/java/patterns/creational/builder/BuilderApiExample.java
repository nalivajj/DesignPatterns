package patterns.creational.builder;

public class BuilderApiExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This is an example");
        stringBuilder.append(" of the builder pattern.");
        stringBuilder.append(" It has methods to append");
        stringBuilder.append(" almost anything we want to a String. ");
        stringBuilder.append(42);

        System.out.println(stringBuilder.toString());
    }
}
