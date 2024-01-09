public class Nemo {
    public static void main(String[] args) {
        System.out.println(findNemo("I am finding Nemo !"));
        System.out.println(findNemo("Nemo is me"));
        System.out.println(findNemo("I Nemo am"));
    }

    public static String findNemo(String sentence) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("Nemo")) {
                return "I found Nemo at " + (i + 1) + "!";
            }
        }
        return "I can't find Nemo :(";
    }

}
