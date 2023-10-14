public class MyString {
    private String str;

    public MyString(String str) {
        this.str = str;
    }

    // Method to check if two strings are equal
    public boolean isEqual(String other) {
        return this.str.equals(other);
    }

    // Method to reverse the string
    public String reverse() {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    // Method to change the case of the string
    public String changeCase() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        MyString myStr = new MyString("Hello, World!");

        System.out.println("Original String: " + myStr.str);
        System.out.println("Is Equal to 'Hello, World!': " + myStr.isEqual("Hello, World!"));
        System.out.println("Reversed String: " + myStr.reverse());
        System.out.println("String with Case Changed: " + myStr.changeCase());
    }
}
