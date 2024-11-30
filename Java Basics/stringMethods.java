public class stringMethods {
    public static void main(String[] args) {
        String str = "Hello World!!";

        for (char c : str.toCharArray()) {
            System.out.println(c);
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(7));
        System.out.println(str.substring(0, 5));
        System.out.println(str.substring(7));
        System.out.println(str.substring(7, 12));
        System.out.println(str.indexOf("World"));
        System.out.println(str.indexOf("World", 7));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.replace("World", "Universe"));
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("World!"));
        System.out.println(str.contains("World"));
        System.out.println(str.equals("Hello, World!"));
        System.out.println(str.equalsIgnoreCase("hello, world!"));

    }
}
