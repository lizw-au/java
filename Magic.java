public class Magic {
	public static void main(String[] args) {
    /*A little game of math magic - regardless of myNumber value, you'll get the same answer in stepSix. Magic!*/
    
    //this is referred to as the original number
		/*int myNumber = 100;

    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);
    */

    //refactor to only use two variables - my number and magic number... 
  int myNumber = 11111;
  //Step1
  int magicNumber = myNumber * myNumber;
  
  //Step2
  magicNumber = magicNumber + myNumber;

  //Step3
  magicNumber = magicNumber / myNumber;

  //Step4
  magicNumber = magicNumber + 17;

  //Step5
  magicNumber = magicNumber - myNumber;

  //Step6
  magicNumber = magicNumber / 6;

  System.out.println(magicNumber);

    
	}
}
