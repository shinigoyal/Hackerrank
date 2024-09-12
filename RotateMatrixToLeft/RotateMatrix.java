
public class RotateMatrix {

	public static void main(String args[]) {
		int[][] arr = new int[][] {{4,3,7},{6,9,1},{2,5,8}};

		for(int i =0 ;i< arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1] + " "+ arr[i][2]);
		}
		
		int[][] newArray = rotateArr(arr, arr.length);
		
		for(int i =0 ;i< newArray.length; i++) {
			System.out.println(newArray[i][0] + " " + newArray[i][1] + " "+ newArray[i][2]);
		}
		
		
	}

	public static int[][] rotateArr(int[][] arr, int size) {
		int[][] newArray = new int[size][size];
		
		for(int i = 0; i<size; i++) {
			for(int j = 0; j<size ; j++) {
				newArray[size-j-1][i]= arr[i][j];
			}
		}
			
		return newArray;
	}
	
}
