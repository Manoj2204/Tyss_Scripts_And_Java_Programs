package Arrays;

import org.testng.annotations.Test;

public class Find_Missing_Number_In_Array 
{
	/*
	 * @Test public void missingNumberBetween1_9() { //int a[]= {1,3,6,7,9}; int
	 * a[]= {1,3,4,5,6,7,8,9}; int sum1=0;
	 * 
	 * 
	 * for(int i=0;i<a.length;i++) { sum1=sum1+a[i]; }
	 * System.out.println("Sum of ele in array :"+ sum1); int sum2=0; for(int
	 * i=1;i<=9;i++) { sum2=sum2+i; } System.out.println("sum of range of ele : "+
	 * sum2); System.out.println(sum2-sum1); }
	
	 */

	
	    public static void findMissingNumbers(int[] array, int range) {
	        int[] count = new int[range + 1];

	        // Count occurrences of numbers in the array
	        for (int num : array) {
	            count[num]++;
	        }

	        // Print missing numbers
	        System.out.println("Missing numbers:");
	        for (int i = 1; i <= range; i++) {
	            if (count[i] == 0) {
	                System.out.print(i + " ");
	            }
	        }
	    }

	    public static void main(String[] args) {
	        int[] a = {1, 3, 6, 7, 9};
	        int range = 9;

	        findMissingNumbers(a, range);
	    }
	}


