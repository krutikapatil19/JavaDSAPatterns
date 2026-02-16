public class ContainerWithMostWater {
    public static int MaxWaterArea(int[] height){
        int i = 0;
        int j = height.length-1;

        int maxArea = 0;

        while(i<j){
            int waterArea = Math.min(height[i],height[j])* (j-i);

            if(waterArea>maxArea){
                maxArea = waterArea;

            }
                if(height[i]>height[j]) j--;
                else i++;
        }
             return maxArea;
    } 
    public static void main(String[] args){
        int[] height = {1,1};
        System.out.println(MaxWaterArea(height));
    }
}
