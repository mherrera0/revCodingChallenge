/*
1) Median of Two Sorted Arrays
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Example1:
Input:nums1 = [1,3], nums2 = [2]
Output:2.00000
Explanation: merged array = [1,2,3] and median is 2.

Example2:
Input:nums1 = [1,2], nums2 = [3,4]
Output:2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.

ConstraDoubles:

	
nums1.length == m
	
nums2.length == n
	
0 <= m <= 1000
	
0 <= n <= 1000
	
1 <= m + n <= 2000
	
-106 <= nums1[i], nums2[i] <= 106
*/
import java.util.Arrays;
import java.util.ArrayList;
public class Main
{
    public static void main(String[] args) {
        //test case 1
        /*Double[] nums1 = new Double[]{1.0,3.0};
        Double[] nums2 = new Double[]{2.0};
        */
        //test case 2
        /*Double[] nums1 = new Double[]{1.0,2.0};
        Double[] nums2 = new Double[]{3.0,4.0};
        */

        int m = Math.round(Math.round(Math.random() * 1000));//possible number of elements in 1st array
        int n;
        if (m == 0) //makes sure m + n >= 1
            n = Math.round(Math.round(Math.random() * 1000)) + 1;//possible number of elements in 2nd array
        else
            n = Math.round(Math.round(Math.random() * 1000));//possible number of elements in 2nd array
        Double[] nums1 = new Double[m];
        Double[] nums2 = new Double[n];
        
        for(int i = 0; i < m; i++) //fill 1st array
            nums1[i] = (Math.random() * 212) - 106;//possible values of 1st array
        for(int i = 0; i < n; i++) //fill 1st array
            nums2[i] = (Math.random() * 212) - 106;//possible values of 2nd array
        ArrayList<Double> mergedArrays = new ArrayList<Double>();
        mergedArrays.addAll(Arrays.asList(nums1));
        mergedArrays.addAll(Arrays.asList(nums2));
        Double[] sortMe = mergedArrays.toArray(new Double[mergedArrays.size()]);
        Arrays.sort(sortMe);
        if(sortMe.length%2==0)
            System.out.println("Median: " + (sortMe[Math.round(Math.round(sortMe.length/2))] + sortMe[Math.round(Math.round(sortMe.length/2))-1])/2);
        else
            System.out.println("Median: " + sortMe[Math.round(Math.round(sortMe.length/2))]);
    }
}
