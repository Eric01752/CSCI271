package homework;

import java.util.Scanner;

/*
    Eric Schmidt
    Homework 6
*/

public class PostfixEvaluator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a postfix expression: ");
        StringBuffer expression = new StringBuffer(input.nextLine());
        evaluatePostfixExpression(expression);
    }
    
    public static void evaluatePostfixExpression(StringBuffer s){
        System.out.println("The original postfix expression is: \n" + s);
        
        StackComposition stack = new StackComposition();
        s.append(")");
        
        int position = 0;
        char currentChar = s.charAt(position);
        while(currentChar != ')'){
            if(Character.isDigit(currentChar)){
                stack.push(Character.getNumericValue(currentChar));
                stack.print();
            }
            else{
                Integer x = (Integer)stack.pop();
                stack.print();
                
                Integer y = (Integer)stack.pop();
                stack.print();
                
                stack.push(calculate(y, currentChar, x));
                stack.print();
            }
            position++;
            currentChar = s.charAt(position);
        }
        System.out.println("The value of the expression is: " + stack.pop());
    }
    
    public static int calculate(int op1, char operator, int op2){
        if(operator == '+'){
            return op1 + op2;
        }
        else if(operator == '-'){
            return op1 - op2;
        }
        else if(operator == '*'){
            return op1 * op2;
        }
        else if(operator == '/'){
            return op1 / op2;
        }
        else if(operator == '^'){
            return op1^op2;
        }
        else{
            return op1 % op2;
        }
    }
}
