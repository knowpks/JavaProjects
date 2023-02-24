public class Calculator {

  // Constructor
  public Calculator() {

  }

  // add method
  public int add(int a, int b) {
    int sum = a + b;
    return sum;
  }

  // subtract method 
  public int subtract(int a, int b) {
    int subtract = a - b;
    return subtract;
  }

  // multipy method
  public int multiply(int a, int b) {
    int multiply = a * b;
    return multiply;
  }

  // divide method
  public int divide(int a, int b) {
    int divide = a / b;
    return divide;
  }

  // modulo method
  public int modulo(int a, int b) {
    int modulo = a % b;
    return modulo;
  }

  // Main Method
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
  }
}
