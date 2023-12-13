import javafx.beans.binding.Binding;

import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static String reversedString;

    public static void main(String[] args) {
        StackArrayBased stackArrayBased = new StackArrayBased();
        stackArrayBased.push(10);
        stackArrayBased.push(20);
        stackArrayBased.push(30);
        stackArrayBased.push(40);
        stackArrayBased.pop();
        stackArrayBased.peek();
        System.out.println(stackArrayBased.pop());
        System.out.println(stackArrayBased.peek());



        StackBasedOnLinkedlist stackBasedOnLinkedlist = new StackBasedOnLinkedlist();
        stackBasedOnLinkedlist.push(50);
        stackBasedOnLinkedlist.push(60);
        stackBasedOnLinkedlist.push(70);
        stackBasedOnLinkedlist.pop();
        stackBasedOnLinkedlist.peek();

        System.out.println(stackBasedOnLinkedlist.pop());
        System.out.println(stackBasedOnLinkedlist.peek());
        Expresssion expresssion = new Expresssion();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an expression to check its validity:");
        String userExpression = scanner.nextLine();

        boolean result = expresssion.isValid(userExpression);
        System.out.println("Expression is valid: " + result);

        System.out.println("Enter a string to be reversed:");
        String userString = scanner.nextLine();
        Reverse reverse=new Reverse();

        String reversedString = reverse.Reverse(userString);
        
        System.out.println("Reversed string: " + reversedString);


    }


    }

