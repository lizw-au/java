public class Magic {
	public static void main(String[] args) {
    /*A little game of math magic - regardless of myNumber value, you'll get the same answer in stepSix. Magic!
    https://www.codecademy.com/courses/learn-java/projects/math-magic*/
    
    //this is referred to as the original number
		int myNumber = 100;

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);
    
	}
}
