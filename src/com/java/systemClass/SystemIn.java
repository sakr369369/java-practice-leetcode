
import java.util.Scanner;

class SystemIn{
	public static void main(String[] str){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i = 0;  i < size; i++){
			System.out.print("Enter the  "+(i + 1)+" Element : ");
						arr[i]  = sc.nextInt();
		}
		
		System.out.println("Arrays's length ="+ arr.length);
		sortArray(arr);
		
	}
	public static void sortArray(int[] arr){
	for(int i = 0;  i < arr.length - 1; i++){
	        int temp = 0;
	        	for(int j = i+1; j<arr.length - 2; j++){
	        	 if(arr[i] < arr[j]){
	        	 temp = arr[i];
	        	 arr[i] = arr[j];
	        	 arr[j] = temp;
	        	 }
	        
	}
	}
	for(int num : arr){
	System.out.print(" "+num);
	}
	}
}
