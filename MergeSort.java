package Sorts;

import static Sorts.SortUtils.print;

/**
 *
 *
 * @author Muhammad Moiz
 *
 */

class MergeSort implements SortAlgorithm {


    @Override
    @SuppressWarnings("unchecked")
public static void main(String[] args)
	{
		int[] arr = {10,45,100,20,5,2};
		System.out.println("Unsorted Array:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		sort(arr,0,arr.length-1);
		System.out.println("Sorted Array:");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}
	public static void sort(int[] arr,int l,int h)
	{
		int m;
		if(l<h){
			m=(l+h)/2;
			sort(arr,l,m);
			sort(arr,m+1,h);
			merge(arr,l,m,h);
		}
	}
	public static void merge(int[] arr,int l,int m,int h)
	{
		int n1=(m-l+1);
		int n2=(h-m);
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(int i=0;i<n1;i++)
			L[i]=arr[l+i];
		for(int i=0;i<n2;i++)
			R[i]=arr[m+1+i];
		int i=0,j=0;
		int k=l;
		while(i<n1 && j<n2){
			if(L[i]<=R[j]){
				arr[k]=L[i];
				k++;
				i++;
			}
			else{
				arr[k]=R[j];
				k++;
				j++;
			}	
		}
		while(i<n1){
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<n2){
			arr[k]=R[j];
			j++;
			k++;
		}
	}
}
