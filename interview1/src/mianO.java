import javax.xml.soap.Node;
import java.util.*;

public class mianO {
    public static void main(String[] args) {
        int[] firstArray = {1,1,2,4,5};
        int[] secondArray = {2,3,3,3,6};
        int[] thirdArray = {0,4,5,7,8,8,9};
        ListNode one = new ListNode(firstArray[0]);
        ListNode two = new ListNode(secondArray[0]);
        ListNode three = new ListNode(thirdArray[0]);
        ListNode first_pointer = one;
        ListNode second_pointer = two;
        ListNode third_pointer  = three;
        for(int i = 1; i < firstArray.length; i++){
            ListNode NewNode = new ListNode(firstArray[i]);
            first_pointer.next = NewNode;
            first_pointer = first_pointer.next;
        }
        for(int i = 1; i < secondArray.length; i++){
            ListNode NewNode = new ListNode(secondArray[i]);
            second_pointer.next = NewNode;
            second_pointer= second_pointer.next;
        }
        for(int i = 1; i < thirdArray.length; i++){
            ListNode NewNode = new ListNode(thirdArray[i]);
            third_pointer.next = NewNode;
            third_pointer= third_pointer.next;
        }
        LinkedList<ListNode> input = new LinkedList<>();
        input.add(one);
        input.add(two);
        input.add(three);
        ListNode ans = Mysolution(input);
        System.out.println("Hello LeetCoder");
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
        System.out.println("Hello LeetCoder");

        // merger test;
        int[][] myInput ={{1,3},{2,8},{5,6},{15,17}};
        mergeArray(myInput);
        for(int i = 0 ; i < myInput.length ; i++){
            System.out.println(myInput[i][0]);
            System.out.println(myInput[i][1]);
        }

    }
    public static ListNode Mysolution(LinkedList<ListNode> input){
        int len = input.size();
        ListNode[] pointers = new ListNode[len];
        boolean label = true;
        for(int i = 0; i < pointers.length; i++){
            pointers[i] = input.get(i);
        }
        ListNode starter = new ListNode();
        ListNode ansPointer = starter;
        int minLabel = 0;
        while(label) {
            System.out.println("1");
            label = false;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < pointers.length; i++){
                if(pointers[i] != null){
                    label = true;
                }
                int num = (pointers[i] == null ? Integer.MAX_VALUE : pointers[i].val);
                if(num <= min){
                    min = num;
                    minLabel = i;
                }
            }
            if(label == false){
                return starter.next;
            }
            System.out.println("min:" + min);
            pointers[minLabel] = pointers[minLabel].next;
            ListNode Node = new ListNode(min);
            ansPointer.next = Node;
            ansPointer = ansPointer.next;

        }
        return starter.next;

    }
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][2];
        }
        Arrays.sort(intervals, new Comparator<int[]>() {
            public int compare(int[] interval1, int[] interval2) {
                return interval1[0] - interval2[0];
            }
        });
        List<int[]> merged = new ArrayList<int[]>();
        for (int i = 0; i < intervals.length; ++i) {
            int L = intervals[i][0], R = intervals[i][1];
            if (merged.size() == 0 || merged.get(merged.size() - 1)[1] < L) {
                merged.add(new int[]{L, R});
            } else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], R);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
