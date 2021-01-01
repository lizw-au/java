public class Magic {
	public static void main(String[] args) {
    /*A little game of math magic - regardless of myNumber value, you'll get the same answer as magic number! 
    Magic!*/
    
  //Set this number to anything, and the magic number will still be the same. 
  int myNumber = 11111;

  int magicNumber = myNumber * myNumber;

  magicNumber = magicNumber + myNumber;
  
  magicNumber = magicNumber / myNumber;
  magicNumber = magicNumber + 17;
  magicNumber = magicNumber - myNumber;
  magicNumber = magicNumber / 6;

  //print the magic number!			
  System.out.println(magicNumber);

    
	}
}
