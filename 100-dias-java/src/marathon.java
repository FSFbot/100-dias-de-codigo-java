public class marathon {
    public static void main(String[] args) {
        int[] runs = {3,4,1,2};
        System.out.println(progressDays(runs));
    }
    public static int progressDays(int[] runs){
        int progressDays = 0;

        for(int i = 1; i < runs.length; i++){
            if(runs[i]> runs[i-1]){
                    progressDays++;
            }
        }
        return progressDays;
    }
}
