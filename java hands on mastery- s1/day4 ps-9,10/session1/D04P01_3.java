package com.learning.core.day4.session1;

import java.util.Stack;

public class D04P01_3 {
    
    public static int evaluateExpression(String expression) {
        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (ch == ' ') {
                continue;
            } else if (Character.isDigit(ch)) {
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--;
                operands.push(num);
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (operators.peek() != '(') {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    operands.push(applyOperation(val1, val2, op));
                }
                operators.pop(); // Pop the '('
            } else {
                while (!operators.isEmpty() && precedence(ch) <= precedence(operators.peek())) {
                    int val2 = operands.pop();
                    int val1 = operands.pop();
                    char op = operators.pop();
                    operands.push(applyOperation(val1, val2, op));
                }
                operators.push(ch);
            }
        }
        
        while (!operators.isEmpty()) {
            int val2 = operands.pop();
            int val1 = operands.pop();
            char op = operators.pop();
            operands.push(applyOperation(val1, val2, op));
        }
        
        return operands.pop();
    }
    
    private static int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }
    
    private static int applyOperation(int val1, int val2, char op) {
        switch (op) {
            case '+':
                return val1 + val2;
            case '-':
                return val1 - val2;
            case '*':
                return val1 * val2;
            case '/':
                if (val2 == 0) {
                    throw new ArithmeticException("Division by zero error");
                }
                return val1 / val2;
            default:
                return 0;
        }
    }
    
    public static void main(String[] args) {
        String expression = "3 + 4 * 2 / (1 - 5)^2";
        System.out.println("Expression: " + expression);
        try {
            int result = evaluateExpression(expression);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

