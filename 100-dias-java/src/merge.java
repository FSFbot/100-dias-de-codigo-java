public class merge {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        for (int num : nums1) {
            System.out.print(num + " "); // Saídas 1 2 2 3 5 6
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m + n - 1, p1 = m - 1, p2 = n - 1;

        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] < nums2[p2]) {
                nums1[i--] = nums2[p2--];
            } else {
                nums1[i--] = nums1[p1--];
            }
        }

        // se ainda houverem elementos em nums2
        while (p2 >= 0) {
            nums1[i--] = nums2[p2--];
        }
    }
}