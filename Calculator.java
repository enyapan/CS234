/**
 * Calculator.java
 * 
 * The Calculator class computes calculations, including addition, subtraction,
 * multiplication, division, factorial, and area of a triangle. 
 * 
 * @author Enya Pan
 * @version April 19, 2021
 */



public class Calculator
{
    
    // The add command for integer numbers 
    public int add(int number1, int number2)
    {
        // Return the result of the first number plus the second number
        int result = number1 + number2;
        return result;
    }
    
    // The subtract command for integer numbers
    public int subtract(int number1, int number2)
    {
        // Return the result of the first number minus the second number
        int result = number1 - number2;
        return result;
    }
    
    // The multiply command for integer numbers
    public int multiply(int number1, int number2)
    {
        // Return the result of the first number times the second number
        int result = number1 * number2;
        return result;
    }
    
    // The divide command for integer numbers
    public int divide(int number1, int number2)
    {
        // Return the result of the first number divided by the second number
        int result = number1 / number2;
        return result;
    }
    
    // The add command for double numbers
    public double add(double number1, double number2)
    {
        // Return the result of the first number plus the second number
        double result = number1 + number2;
        return result;
    }
    
    // The subtract command for double numbers
    public double subtract(double number1, double number2)
    {
        // Return the result of the first number minus the second number
        double result = number1 - number2;
        return result;
    }
    
    // The multiply command for double numbers
    public double multiply(double number1, double number2)
    {
        // Return the result of the first number times the second number 
        double result = number1 * number2;
        return result;
    }
    
    // The divide command for double numbers 
    public double divide(double number1, double number2)
    {
        // Return the result of the first number divided by the second number
        double result = number1 / number2;
        return result;
    }
    
    // The factorial command for an integer
    public int factorial(int number)
    {
        int mult = 1;
        
        //the for loop goes through numbers from 1 to the input number
        for(int i = number; i > 0; i--)
        {
            mult = multiply(i, mult);
            //when i = 3 --> mult = 3 * 1
            //when i = 2 --> mult = 2 * 3
            //when i = 1 --> mult = 1 * 6
        }
        
        return mult;
    }
    
    // The area of triangle command
    public double sasAreaOfTriangle(double sideA, double sideB, double angleInDegrees)
    {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double result = multiply(multiply(sideA, sideB), Math.sin(angleInRadians));
        return result;
    }
    
}