//Brian Kernighan Algorithm
//https://iq.opengenus.org/brian-kernighan-algorithm/

public class Solution {
 
    public int hammingWeight(int n) {
        
		int setBitCount = 0;
        
		while (n != 0) {
            n &= (n - 1); // to clear the right most set bit
            ++setBitCount;
        }
		
        return setBitCount;
    }
}