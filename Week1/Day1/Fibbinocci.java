package homeAssignment.Week1.Day1;

public class Fibbinocci {

	public static void main(String[] args) {

		//0  1  1  2  3  5  8  13  21  34  55  89  144
		//firstNum = 0
		//secNum = 1
		//thridNum=firstNum+secNum
		//sum n= 11
		
		int n=11;
		int firstNum = 0,secNum = 1,thirdNum = 0;
		
		System.out.println(firstNum);//1st term
		
		System.out.println(secNum);//2nd term
		//need to find 3rd term(i=3)
		for (int i=3; i<=n;i++) {
			
		 thirdNum=firstNum+secNum;
		System.out.println(thirdNum);
		firstNum=secNum;
		secNum=thirdNum;
		}

	}

}
