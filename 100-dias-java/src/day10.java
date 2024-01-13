public class day10 {

    public static int numTrees(int n){
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for(int i = 2; i <= n; ++i){
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(3));
        System.out.println(numTrees(4));
        System.out.println(numTrees(5));
    }
}
// Given n, how many structurally unique BST's (binary search trees) that store values 1 ... n?