public class ContainerWithMostWater {
    public static int MaxWaterArea(int[] height){
        int i = 0;
        int j = height.length-1;

        //to store the maximum water found so far
        int maxArea = 0;

        while(i<j){

            //water is limited by the smaller bar
            //width -> distance between two pointers(bars) 
            int waterArea = Math.min(height[i],height[j])* (j-i);

            //Update maximum if a better container is found ,which stores more water
            if(waterArea>maxArea){
                maxArea = waterArea;
            }

            //Move the pointer that has smaller height (in order to replace that small bar with a taller one which can hold more water)

            if(height[i]>height[j]) j--;
            else i++;
        }
             return maxArea;
    } 
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(MaxWaterArea(height));
    }
}
