package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int secondNum = 1;
		int sum;
		
		System.out.println(firstNum);
		System.out.println(secondNum);
		
		for (int i=1; i < range; i++)
		{
					
			sum = firstNum+secondNum; //1
			firstNum=secondNum; //1
			secondNum=sum; //1
			System.out.println(sum); //1
			
		}
			

	}

}
