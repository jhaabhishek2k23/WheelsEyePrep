package DSA;

import java.util.*;

class Main {
    public static void main(String[] args) {

        //Question is simple find the minimum numbers of swap needed to keep the numbers
        //together which is less than or equal to K. 
        List<Integer>arr = new ArrayList<>(Arrays.asList(2, 7, 8, 12, 13, 18, 4,3));
        int k = 8;
        
        System.out.println(helper(arr,k));
    }
    
    
    public static int helper(List<Integer>arr, int k) {
        int count = 0;
        for(Integer it : arr){
            if(it <= k) {
                count++;
            }
        }
        
        System.out.println(" BRO THE TOTAL COUNT IS : "+ count);
        
        int tempCount = 0;
        int maxCount = 0;
        int i =0, j =0;
        while(j < arr.size()) {
            
            if(arr.get(j) <= k) {
                tempCount++;
            }
            
            if(j-i+1 > count) {
                if(arr.get(i) <= k){
                    tempCount--;
                    i++;
                }
            }
            
            j++;
            
            maxCount = Math.max(tempCount,maxCount);
        }
        
        return count - maxCount;
    }
}