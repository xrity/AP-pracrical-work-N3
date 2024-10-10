import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write byte:");
        byte byteValue = Byte.parseByte(scanner.nextLine());

        System.out.println("Write short:");
        short shortValue = Short.parseShort(scanner.nextLine());

        System.out.println("Write int:");
        int intValue = Integer.parseInt(scanner.nextLine());

        System.out.println("Write long:");
        long longValue = Long.parseLong(scanner.nextLine());

        System.out.println("Write float:");
        float floatValue = Float.parseFloat(scanner.nextLine());

        System.out.println("Write double:");
        double doubleValue = Double.parseDouble(scanner.nextLine());

        System.out.println("Write char:");
        char charValue = scanner.nextLine().charAt(0);

        System.out.println("Write boolean:");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());


        System.out.println("1. Your data: Byte " + byteValue + ", Short " + shortValue 
            + ", Int " + intValue + ", Long " + longValue + ", Float " + floatValue 
            + ", Double " + doubleValue + ", Char " + String.valueOf(charValue) + ", Boolean " + booleanValue);


        String template = "2. Your data: Byte {0}, Short {1}, Int {2}, Long {3}, Float {4}, Double {5}, Char {6}, Boolean {7}";
        String message = MessageFormat.format(template, byteValue, shortValue, intValue, longValue, floatValue, doubleValue, String.valueOf(charValue), booleanValue);
    
        System.out.println(message);


        String format = "3. Your data: Byte %d, Short %d, Int %d, Long %d, Float %f, Double %f, Char %c, Boolean %b";

        System.out.printf(format, byteValue, shortValue, intValue, longValue, floatValue, doubleValue, charValue, booleanValue);
    }
}
