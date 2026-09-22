import java.util.Scanner;
public class deleteAtPosition {
    Node head = null;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        deleteAtPosition s = new deleteAtPosition();
        int data , ch;
        boolean flag = true;
        while(flag){
            System.out.println("\n"+"1.Insert" + "\n" + "2.deleteAt postion" + "\n" + "3.display"+"\n"+"4.Exit");
            ch = scan.nextInt();

            switch(ch){
                case 1:
                    data = scan.nextInt();
                    s.insert(data);
                    break;
                case 2:
                    int position = scan.nextInt();
                    s.deleteAtPosition(position); 
                    break;
                case 3:
                    s.display(); 
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }

    }
    private void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;

    }
    private void deleteAtPosition(int position) {
        if(position==1){
        head=head.next;
        return;
       }
       int count=1;
       Node temp=head;
       while(temp!=null && count<position-1){
        temp=temp.next;
        count++;
       }       
       if(temp==null){
        System.out.println("Out of range");
        return;
       }
       temp.next=temp.next.next;
       if(temp.next==null){
        temp=null;
        return;
       }
    }
    private void display(){
        if(head == null){
            System.out.print("No List Found..");
            return;
        }
        Node current = head;
        while(current!= null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
}
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
