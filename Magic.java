public class Magic {
	public static void main(String[] args) {

		int myNumber = 2; // Original Number
        int stepOne = myNumber * myNumber; // Step 1
        int stepTwo = stepOne + myNumber ; // Step 2
        int stepThree = stepTwo / myNumber; // Step 3
        int stepFour = stepThree + 17; // Step 4
        int stepFive = stepFour - myNumber; // Step 5
        int stepSix = stepFive / 6; // Step 6
        System.out.println(stepSix);

	}
}