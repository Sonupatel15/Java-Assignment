package org.example;


import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the valid arithmetic expression: ");
        String expression = input.nextLine();
        System.out.println(expression);

        boolean isValid = true;

        isValid = (isValidParenthisis(expression) && isValidOperators(expression));

        System.out.println(isValid);

        //Validating the braces;
    }

    public static boolean isValidOperators(String expression){
        for(int i=0;i<expression.length()-1;i++){
            char current = expression.charAt(i);
            char next = expression.charAt(i + 1);
            if(current == '+' || current == '-' || current == '*' || current == '/'){
                if(next == '+' || next == '-' || next == '*' || next == '/'){
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean isValidParenthisis(String expression) {
        Stack<Character> stack = new Stack<>();
        for(char ch : expression.toCharArray()) {
            if(ch == '(') {
                stack.push('(');
            }
            else if(ch == ')') {
                if(!stack.empty() && stack.peek()=='('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else{
                if(ch=='['||ch=='{'||ch==']'||ch=='}') {
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        }
        return false;
    }
}