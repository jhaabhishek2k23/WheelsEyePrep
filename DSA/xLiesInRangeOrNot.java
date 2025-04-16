package DSA;

public class xLiesInRangeOrNot {
    public static void main(String args[]) {
        int x = 10;
        int high = 100;
        int low = 0;
    
    
        System.out.println((x -low) * (high-x) <= 0);
    
    
        //TODO why this logic works? 
    
        //? Why ? so if x is in b/w low and high that means x - low would always be <= 0 right?
        //? Same high -x would always be >= 0 
        //? So if you multiply both of them result should be always negative if x lies in b/w.
    
    }   
}
