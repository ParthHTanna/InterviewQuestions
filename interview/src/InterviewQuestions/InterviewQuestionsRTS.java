package InterviewQuestions;

public class InterviewQuestionsRTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1, 5, 2, 1, 10};
		int target = 6;
		System.out.println(belowAbove(arr, target));
		
		System.out.println(rotateString("MyString", 2));
	}
	
	public static String belowAbove(int[] arr, int target) {
		int below = 0;
		int above = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < target) {
				below++;
			} else if(arr[i] > target) {
				above++;
			}
		}
		return "Number of intergers below the target are " + below + 
				" and number of integers above the target are " + above;
	}
	
	public static String rotateString(String str, int num) {
		String result = "";
		int num1 = num;
		for(int i = 0; i < num1; i++) {
			result += str.charAt(str.length() - num);
			num--;
		}
		
		for(int j = 0; j < str.length() - num1; j++) {
			result += str.charAt(j);
		}
		return result;
	}

}
