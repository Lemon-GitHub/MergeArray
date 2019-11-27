package mergeArray;

import java.util.Arrays;

public class mergeArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        while (n != 0) {
            nums1[m++] = nums2[index++];
        }
        Arrays.sort(nums1);
    }
}
