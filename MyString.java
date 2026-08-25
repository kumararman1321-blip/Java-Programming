public class MyString {
    public static void main(String[] args) {
        String text = "Hello Java";
        System.out.println("String: " + text);
        System.out.println("Length of the string: " + text.length());
        System.out.println("Character at index 4: " + text.charAt(4));
        System.out.println("Substring from index 6: " + text.substring(6));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("Does the string contain 'Java'? " + text.contains("Java"));
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));
        System.out.println("Trimmed string: '" + text.trim() + "'");
    }
}
