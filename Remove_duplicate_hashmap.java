package aaa;
import java.util.*;
public class Remove_duplicate_hashmap {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,5,1,7,2,4,2};
		int n=arr.length;
		
		HashMap<Integer,Boolean> mp=new HashMap<>();
		
		for(int i=0;i<n;i++)
		{
			if(mp.get(arr[i])==null)
				System.out.println(arr[i]);
			mp.put(arr[i],true);
		}		
	}
}
