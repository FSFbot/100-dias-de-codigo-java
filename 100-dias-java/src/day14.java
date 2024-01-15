public class day14 {
    public static void main(String[] args) {
        System.out.println(encrypt("banana"));
        System.out.println(encrypt("karaca"));
        System.out.println(encrypt("burak"));
        System.out.println(encrypt("alpaca"));
    }

    public static String encrypt(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        String replaced = reversed.replace('a', '0')
                .replace('e', '1')
                .replace('i', '2')
                .replace('o', '2')
                .replace('u', '3');
        return replaced + "aca";
    }
}