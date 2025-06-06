package leetcode;

public class findMedianSortedArray {
	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 4, 5, 6 };
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length < nums2.length)
		{
			return findMedianSortedArrays(nums2, nums1);
		}

		int i = 0, j = 0, k = 0;
		int medianIndex = (nums1.length - nums2.length) / 2 + nums2.length + 1;//(3-3)/2 + 3+1
		int arr[] = new int[medianIndex];

		while (i < nums1.length && j < nums2.length && k != medianIndex) {
			if (nums1[i] < nums2[j]) {
				arr[k++] = nums1[i++];
			} else {
				arr[k++] = nums2[j++];
			}
			
		}

		while (i < nums1.length && k != medianIndex) {
			arr[k++] = nums1[i++];
		}

		while (j < nums2.length && k != medianIndex) {
			arr[k++] = nums2[j++];
		}

		return (nums1.length + nums2.length) % 2 != 0 ? arr[(nums1.length + nums2.length) / 2]
				: (double) (arr[((nums1.length + nums2.length) - 1) / 2]
						+ arr[((nums1.length + nums2.length) - 1) / 2 + 1]) / 2;
	}

}
