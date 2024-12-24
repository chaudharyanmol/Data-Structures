// Write a program to create a LinkedList in which nodes will be added after other node on right hand side.
import java.util.Scanner;
class Node{
    int data;
    Node next ;

    Node(int d){
        this.data=d;
        this.next=null;
    }
}

class Pair{
    Node head;
    Node tail;

    Pair(Node h,Node t){
        this.head=h;
        this.tail=t;
    }

}



class LinkedList{
    static Scanner sc = new Scanner(System.in);
  
    public static Pair  create(Node h,Node t){
        System.out.println("enter the number you wanna add");
        int d = sc.nextInt();

        Node temp = new Node(d);
        if(h==null && t==null){
            h=t=temp;
        }else{
            t.next=temp;
            t=t.next;
        }

        return new Pair(h, t);
        
        
    
    
    }


    static void show(Node h){
        System.out.println("function starting");
        while (h!=null) {
            System.out.println(h.data);
            h=h.next;
        }

        System.out.println("function ending");

    }

    public static void main(String[] args) {

        int choice;
        Node Head = null;
        Node tail= null;

        while(true){

            System.out.println("please enter 1 to add a node"+"\n"+
            "please enter 2 to show the LinkedList"+"\n"+
            "Please enter any key to exit");

            choice= sc.nextInt();

            switch (choice) {
                case 1:
                Pair result = create(Head,tail);
                Head = result.head;
                tail = result.tail;
                    break;
                case 2:
                    show(Head);
                    break;
            
                default:
                    System.exit(0);
            }

        }

    }
}