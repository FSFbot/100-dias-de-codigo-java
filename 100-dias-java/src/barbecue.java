public class barbecue {
    public static int[] countSkewers(String[] grill) {
        int vegCount = 0;
        int nonVegCount = 0;

        for (String skewer : grill) {
            if (skewer.contains("x")) {
                nonVegCount++;
            } else {
                vegCount++;
            }

        }
        return new int[] { vegCount, nonVegCount };
    }

    public static void main(String[] args) {
        String[] grill1 = { "--oooo-ooo--", "--xx--x--xx--", "--o---o--oo--", "--xx--x--ox--", "--xx--x--ox--" };
        String[] grill2 = { "--oooo-ooo--", "--xxxxxxxx--", "--o---", "-o-----o---x--", "--o---o-----" };
        int[] result1 = countSkewers(grill1);
        int[] result2 = countSkewers(grill2);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");
    }

}