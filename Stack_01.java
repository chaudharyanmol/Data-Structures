// write a java program to implement stack using array.

import java.util.Scanner;
public class Stack_01 {
    static Scanner Sc = new Scanner(System.in);
    static int max =  100;



    static void display(int arr[],int position){
        if(position<0)
            System.out.println("there is nothing to display in stack");
        else{
            System.out.println("Displaying items");
            for(int i =0 ; i<=position; i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }


    }

    static void peek(int arr[],int position){
        if(position<0)
            System.out.println("nothing is in stack");
        else
            System.out.println("the element at top position is:"+ arr[position]);

    }

    static int push(int arr[],int position){
        if(position >max)
            System.out.println("item can not be pushed");
        else{
            System.out.println("enter the value you wann add:");
            int val = Sc.nextInt();
            position++;
            arr[position]= val;
            
        }
        return position;
    }

    static int pop(int arr[],int position){
        if(position<0){
            System.out.println("nothing to pop:");
        
        }else{
            System.out.println("the popped element is :"+ arr[position]);
            position--;
        }
        return position;
    }


    public static void main(String[] args) {

        int stack[]= new int[max];
        int pointer=-1;
        while (true) {
            System.out.println("enter 1 for pushing element"+"\n"+
            "enter 2 for popping element"+"\n"+"enter 3 for Display"+"\n"+
            "enter 4 for peeking the top element");

            int choice = Sc.nextInt();
            switch (choice) {
                case 1:
                    pointer = push(stack,pointer);
                    System.out.println();
                    break;
                case 2:
                    pointer = pop(stack,pointer);
                    System.out.println();
                    break;
                case 3:
                     display(stack,pointer);
                     System.out.println();
                     break;
                case 4:
                    peek(stack,pointer);
                    System.out.println();
                    break;
                default:
                    System.exit(0);
                    break;
            }
            
        }

        
    }
    
}
