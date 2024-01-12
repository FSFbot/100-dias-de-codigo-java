public class day09 {
    public int trap(int[] height){
        if(height == null || height.length == 0){
            return 0;
        }
        int left = 0, right = height.length -1;
        int leftMax = 0, rightMax = 0;
        int result = 0;
        while (left < right){
            if (height[left] <= height[right]){
                if(height[left] >= height[right]){
                    leftMax  = height[left];
                }else {
                    result += leftMax - height[left];
                }
                right --;
            }
        }
        return result;
    }
}
