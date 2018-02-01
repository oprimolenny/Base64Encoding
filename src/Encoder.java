import javax.xml.bind.DatatypeConverter;

public class Encoder {

    public static void main(String[] args) {

        String str = "Hello";

        byte[] utf8Bytes = str.getBytes();
        String b64Str = DatatypeConverter.printBase64Binary(utf8Bytes);

        System.out.printf("UTF8 string: %s %n", str);
        System.out.printf("Base64 string: %s", b64Str);
    }
}
