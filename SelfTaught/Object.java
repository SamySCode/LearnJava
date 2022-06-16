package LearnJava.SelfTaught;

class Calculator{ // creating a object
    int num1; // assigning object with variables
    int num2; // assigning object with variables
    int result; // assigning object with variables

    public void Addition(){ // This is a method, called Addition that adds both ints
        result = num1 + num2; // adds ints num1 and num2 and assigns value to result
    }
} //object is created with variables and methods

public class Object {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); //we make a new calculator object and name it calc.
        calc.num1 = 5; //we use the dot operator to set the value of num1
        calc.num2 = 7; //we use the dot operator to set the value of num2

        calc.Addition();//we use the dot operator to call on the Addition metho which adds num1 and num2 together

        System.out.println(calc.result);// we use the dot operator to call the result then we can print it as a int value
        // The dot operator is used to call  upon variables and methods within the object decloration
    }
}
