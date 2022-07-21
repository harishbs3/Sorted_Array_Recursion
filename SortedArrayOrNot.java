import java.util.*;
public class SortedArrayOrNot {
	static boolean sorted(int[] arr,int index) {
		if(index == arr.length-1) return true;
		return arr[index] <= arr[index+1] && sorted(arr,index+1);  
	}
	
	static boolean linsearch(int[] arr,int target,int index) {
		if(index == arr.length-1) return false;
		return arr[index] == target ||arr[arr.length-1] == target || linsearch(arr,target,index+1);
		
	}
	public static void main(String[] args) {
		int[] array = {1,2,3,7,51,6,7,9,10,7,11};
		//System.out.println(sorted(array,0));
		//System.out.println(linsearch(array,11,0));
		ArrayList<Integer> al = new ArrayList<>();
		System.out.println("Elements present in "+findIndex(array,0,7,al));
	}
	
	public static ArrayList<Integer> findIndex(int[] arr,int index,int target,ArrayList<Integer> al) {
		if(index == arr.length-1) return al;
		if(arr[index] == target) {
			al.add(index);
		}
		 return findIndex(arr,index+1,target,al);
	}

}
