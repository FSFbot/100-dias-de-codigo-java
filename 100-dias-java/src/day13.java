import java.util.Arrays;
import java.util.Collections;

public class day13 {
    public static boolean canFit(Integer[] items, int bags) {
        Integer[] bagWeights = new Integer[bags];
        Arrays.fill(bagWeights, 0);

        Arrays.sort(items, Collections.reverseOrder());

        for (int i = 0; i < items.length; i++) {
            boolean itemPlaced = false;
            for (int j = 0; j < bags; j++) {
                if(bagWeights[j] + items[i] <= 10){
                    bagWeights[j] += items[i];
                    itemPlaced = true;
                    break;
                }
            }
            if (!itemPlaced) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(canFit(new Integer[] {2, 1, 2, 5, 4, 3, 6, 1, 1, 9, 3, 2}, 4)); // returns true
        System.out.println(canFit(new Integer[] {2, 7, 1, 3, 3, 4, 7, 4, 1, 8, 2}, 4)); // returns false
    }
}
