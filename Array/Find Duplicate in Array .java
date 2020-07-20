/*
Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]
Sample Output:

1
If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        int len = A.size();
        if(len == 0)
            return -1;
         int slow = A.get(0);
          int fast = A.get(A.get(0));
          while (slow != fast) {
            slow = A.get(slow);
            fast = A.get(A.get(fast));
          }
        
          fast = 0;
          while (slow != fast) {
            slow = A.get(slow);
            fast = A.get(fast);
          }
          if(slow==0) return -1;
          return slow;
    }
}
