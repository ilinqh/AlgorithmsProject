package solution_java.hard;

public class _4MedianOfTwoSortedArrays {
    public class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int length1 = nums1.length, length2 = nums2.length;
            boolean findNext = (length1 + length2) % 2 == 0;
            int middle = (length1 + length2 - 1) / 2;
            double first = findNumByIndex(middle, nums1, nums2, length1, length2);
            double halfDelta = 0.0;
            if (findNext) {
                double second = findNumByIndex(middle + 1, nums1, nums2, length1, length2);
                halfDelta = (second - first) / 2.0;
            }
            return first + halfDelta;
        }

        private double findNumByIndex(int index, int[] nums1, int[] nums2, int length1, int length2) {
            int pointer1 = 0, pointer2 = 0, answer = 0;
            while ((pointer1 + pointer2) <= index) {
                if (pointer1 == length1) {
                    answer = nums2[pointer2];
                    pointer2 += 1;
                } else if (pointer2 == length2) {
                    answer = nums1[pointer1];
                    pointer1 += 1;
                } else if (nums1[pointer1] < nums2[pointer2]) {
                    answer = nums1[pointer1];
                    pointer1 += 1;
                } else {
                    answer = nums2[pointer2];
                    pointer2 += 1;
                }
            }
            return answer;
        }
    }
}
