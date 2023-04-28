package array;

import java.util.HashMap;

public class TrappingRainWater {
  
    public int maxAreaBruteForce(int[] heights) {
        //brute force solution
        //time: O(n^2)
        //Space: O(1)
        int maxArea = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                
                int width = j - i;
                int height = Math.min(heights[i], heights[j]);
                int area = height * width;
                
                maxArea = Math.max(maxArea, area);
                
            }
        }
        return maxArea;
    }

    
    //best solution
    public int maxArea2(int[] heights) {
        int maxArea = 0;
        int i = 0;
        int j = heights.length - 1;
        while (i != j) {
            int a = heights[i];
            int b = heights[j];
            
            maxArea = Math.max(Math.min(a, b) * (j - i), maxArea);
            if (heights[i] < heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        
        return maxArea;
    }
}

