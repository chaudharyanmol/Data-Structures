class Node{
    int data;
    Node next;

    Node(int d){
        this.data=d;
    }
}





class Main{

    public static void main(String[] args) {
        
        Node n = new Node(10);
        Node n1 = new Node(20);
        Node n2= new Node(30);
        n.next=n1;
        n1.next=n2;

        Node temp = n ;


        while(temp !=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }


    }
}