public class Strings {
    public static void main(String[] args) {
        String s = "Chetan";
        System.out.println("String is "+s);

        // String Methods
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.replace('C','V'));
        System.out.println(s.replace("Chetan","Deeraj"));
        System.out.println(s.startsWith("Ch"));
        System.out.println(s.endsWith("an"));
        System.out.println(s.charAt(3));
        System.out.println(s.substring(2,5));

        String tr = "   Shrikant   ";
        System.out.println(tr.trim());
    }
}