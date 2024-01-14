public class day12 {
    public static String landscapeType(int[] arr) {
        if (arr == null || arr.length < 3)
            return "Neither";

        int peakIndex = -1;
        boolean isAscending = true;

        for (int i = 1; i < arr.length; i++) {
            if (isAscending) {
                if (arr[i] < arr[i - 1]) {
                    peakIndex = i - 1;
                    isAscending = false;
                }
            } else {
                if (arr[i] > arr[i - 1]) return "Neither";
            }
        }

        if (peakIndex == 0 || peakIndex == -1 || peakIndex == arr.length - 1) {
            return "Neither";
        } else {
            return isAscending ? "Valley" : "Mountain";
        }
    }

    public static void main(String[] args) {
        System.out.println(landscapeType(new int[] { 3, 4, 5, 4, 3 }));
        System.out.println(landscapeType(new int[] { 9, 7, 3, 1, 2, 4 }));
        System.out.println(landscapeType(new int[] { 9, 8, 9 }));
        System.out.println(landscapeType(new int[] { 9, 8, 9, 8 }));
    }
}