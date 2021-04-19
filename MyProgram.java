/**
 * MyProgram.java
 * 
 * This program interacts with a client whose task is to enter choices of 
 * calculation methods and values they would like to compute. The client will
 * continue to interact with the calculator until they choose to exit the 
 * program, which will terminate the loop. 
 * 
 * @author Enya Pan
 * @version April 19, 2021
 */

public class MyProgram extends ConsoleProgram
{
    public void run()
    {
        int userInt1 = 0;
        int userInt2 = 0;
        int factorialChoice = 0;
        double userDouble1 = 0.0;
        double userDouble2 = 0.0;
        double userSideA = 0.0;
        double userSideB = 0.0;
        double userAngleDegree = 0.0;
        double result = 0;
        
        Calculator calculator = new Calculator();
        
        /**
         * The while loop lets user continue to use the calculator program one 
         * after another calculation is completed unless the user chooses to exit
         * the program, which will signal the program to stop. 
         */
        while(true)
        {
            //introducing user to the calculator
            System.out.println("Welcome to the calculator!");
            System.out.println();
            System.out.println();
            
            //providing calculation options and option to quit program
            System.out.println("Choose one of the following:");
            System.out.println("   1.Addition");
            System.out.println("   2.Subtraction");
            System.out.println("   3.Multiplication");
            System.out.println("   4.Division");
            System.out.println("   5.Factorial");
            System.out.println("   6.Area of triangle");
            System.out.println("   7.Exit program");
            System.out.println();
            
            //ask for user input of calculation method of choice
            int userSelection = readInt("Please enter your choice--> ");
            System.out.println();
            System.out.println();
            
            /**
             * If the user selects one of the calculation methods from addition(1) 
             * to division(4), the user will be taken to the next step where options
             * of integer and double inputs are provided, and the inputs will go 
             * through the according calculation process of choice.
             */
            if(userSelection > 0 && userSelection < 5)
            {
                System.out.println("Choose one of the following:");
                System.out.println("   1.Integer");
                System.out.println("   2.Double");
                System.out.println();
                int userSelectionDataType = readInt("Please enter your choice--> ");
                
                //user chooses integer(1) for data type
                if(userSelectionDataType == 1)
                {
                    //ask for input for both integers
                    userInt1 = readInt("Please enter your first integer--> ");
                    userInt2 = readInt("Please enter your second integer--> ");
                    System.out.println();
                    
                    //user chooses addition(1)
                    if(userSelection == 1)
                    {
                        System.out.println(calculator.add(userInt1, userInt2));
                    }
                    
                    //user chooses subtraction(2)
                    else if(userSelection == 2)
                    {
                        System.out.println(calculator.subtract(userInt1, userInt2));
                    }
                    
                    //user chooses multiplication(3)
                    else if(userSelection == 3)
                    {
                        System.out.println(calculator.multiply(userInt1, userInt2));
                    }
                    
                    //user chooses division(4)
                    else if(userSelection == 4)
                    {
                        System.out.println(calculator.divide(userInt1, userInt2));
                    }
                    
                }
                
                //user chooses double(2) for data type
                else if(userSelectionDataType == 2)
                {
                    //ask for input for both doubles
                    userDouble1 = readDouble("Please enter your first double--> ");
                    userDouble2 = readDouble("Please enter your second double--> ");
                    System.out.println();
                    
                    //user chooses addition(1)
                    if(userSelection == 1)
                    {
                        result = calculator.add(userDouble1, userDouble2);
                        System.out.printf("%.2f", result);
                    }
                    
                    //user chooses subtraction(2)
                    else if(userSelection == 2)
                    {
                        result = calculator.subtract(userDouble1, userDouble2);
                        System.out.printf("%.2f", result);
                    }
                    
                    //user chooses multiplication(3)
                    else if(userSelection == 3)
                    {
                        result = calculator.multiply(userDouble1, userDouble2);
                        System.out.printf("%.2f", result);
                    }
                    
                    //user chooses division(4)
                    else if(userSelection == 4)
                    {
                        result = calculator.divide(userDouble1, userDouble2);
                        System.out.printf("%.2f", result);
                    }
                }
                
                System.out.println();
                System.out.println();
            }
            
            //user chooses factorial(5)
            else if(userSelection == 5)
            {
                factorialChoice = readInt("Please enter the integer--> ");
                System.out.println();
                System.out.println(calculator.factorial(factorialChoice));
                System.out.println();
                System.out.println();
            }
            
            //user chooses area of triangle(6)
            else if(userSelection == 6)
            {
                userSideA = readDouble("Please enter side A--> ");
                userSideB = readDouble("Please enter side B--> ");
                userAngleDegree = readDouble("Please enter angle degree--> ");
                System.out.println();
                result = calculator.sasAreaOfTriangle(userSideA, userSideB, userAngleDegree);
                System.out.printf("%.2f", result);
                System.out.println();
                System.out.println();
            }
            
            //loop stopped if user chooses to exit program(7)
            else if(userSelection == 7)
            {
                System.out.println("You have exited the program. Goodbye!");
                break;
            }
            
            //invalid input of calculation choice takes user back to beginning of program
            else
            {
                System.out.println("Please enter a valid choice.");
                System.out.println();
                System.out.println();
                continue;
            }
        }
    }
}