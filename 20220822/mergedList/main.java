/*
2) Mergek Sorted Lists
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Example1:
Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output:[1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
1->4->5,
1->3->4,
2->6
]
merging them into one sorted list:
1->1->2->3->4->4->5->6

Example2:
Input: lists= []
Output: []

Example3:
Input: lists = [[]]
Output: []

Constraints:


	
k == lists.length
	
0 <= k <= 104
	
0 <= lists[i].length <= 500
	
-104 <= lists[i][j] <= 104
	
lists[i] is sorted in ascending order.
	
The sum of lists[i].length will not exceed 104.
*/
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;
public class Main
{
    public static void main(String[] args) {
/*      //default test case
        int k = 3;
        LinkedList<Integer>[] lists = new LinkedList[k];
        lists[0] = new LinkedList<Integer>(Arrays.asList(1,4,5));
        lists[1] = new LinkedList<Integer>(Arrays.asList(1,3,4));
        lists[2] = new LinkedList<Integer>(Arrays.asList(2,6));
*/        
        int k = Math.round(Math.round(Math.random() * 104)); //amount of LinkedLists
        List<Integer>[] lists = new LinkedList[k];
        for(int i = 0; i < k; i++){
            int elements = Math.round(Math.round(Math.random() * 500)); //amount of elements per LinkedList
            lists[i] = new LinkedList<Integer>();
            for(int j = 0; j < elements; j++)
                lists[i].add(Math.round(Math.round(Math.random() * 208) - 104)); //possible values of elements
            Integer[] sortMe = lists[i].toArray(new Integer[lists[i].size()]);
            Arrays.sort(sortMe);
            lists[i] = new LinkedList<Integer>(Arrays.asList(sortMe));
        }
        
        
        List<Integer> mergedList = new LinkedList<Integer>();
        for(List l:lists){
            mergedList.addAll(l);
        }
        Integer[] mergedListSort = mergedList.toArray(new Integer[mergedList.size()]);
        Arrays.sort(mergedListSort);
        mergedList = new LinkedList<Integer>(Arrays.asList(mergedListSort));
        System.out.println(mergedList.toString());
    }
}
