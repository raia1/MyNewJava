import java.util.Locale;

public class string2 {
    public static void main(String[] args) {
        String name="Akansha";
//        int value=name.length();
        System.out.println(name.length());
        String fname="AkanSHa";
        System.out.println(fname.toLowerCase());
        System.out.println(fname.toUpperCase());
        String nonTrimmedString="    Akansha  ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        System.out.println(name.substring(1));
        System.out.println(name.substring(1,7));
        System.out.println(name.replace("A","aa"));
        System.out.println(name.startsWith("Aka"));
        System.out.println(name.endsWith("ha"));
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('a'));
        String lname="akkkkanshaaakkkk";
        System.out.println(lname.indexOf("akkkk",4));

    }
}
