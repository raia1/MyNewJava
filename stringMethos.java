import java.util.Locale;

public class stringMethos {
    public static void main(String[] args) {
         String name= "AkanSHa";
//         int value= name.length();
//        System.out.println(value);
        String value =name.toLowerCase();
        System.out.println(value);
        String uvalue =name.toUpperCase();
        System.out.println(uvalue);
        String nonTrimmedString="       Akansha    ";
        System.out.println(nonTrimmedString);
        String trimString= nonTrimmedString.trim();
        System.out.println(trimString);
        System.out.println(name.substring(4));
        System.out.println(name.substring(2,6));
        System.out.println(name.replace('a','m'));


    }
}
