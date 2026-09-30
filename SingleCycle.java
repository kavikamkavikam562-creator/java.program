import java.util.Scanner;
public class SingleCycle {
    Node head=null;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SingleCycle cyc= new SingleCycle();
        boolean flag = true;
        int ch, data;
        while(flag){
            System.out.println("1.insert\n2.create cycle\n3.detect cycle\n4. delete cycle\n5.display\n6.Exit\n7. insert in sorted list\n");
            ch=s.nextInt();
            switch (ch){
                case 1:
                    data=s.nextInt();
                    cyc.insert(data);
                    break;
                case 2:
                    cyc.createcycle();
                    break;
                case 3:
                    cyc.detectcycle();
                    break;
                case 4:
                    cyc.delete();
                    break;
                case 5:
                    cyc.display();
                    break;
                case 6:
                    flag=false;
                    break;
                case 7:
                    data=s.nextInt();
                    cyc.insertSort(data);
                    break;
            }
        }
    }

    private void delete() {
        if(head==null){
            System.out.println("List empty");
            return;
        }
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        Node place=slow;
        Node temp=slow;
        while(temp.next!=place){
            temp=temp.next;
        }
        temp.next=null;
    }

    private void insertSort(int data) {
         Node newNode = new Node(data); 
        if(head==null){
            insert(data);
            return;
        }
       
        if(data<head.data){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            if(data<temp.next.data){
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
        }
        if(temp.next==null){
            temp.next=newNode;
            return;
        }
    }

    private void detectcycle() {
        if(head==null){
            System.out.println("List empty");
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                System.out.println("Cycle found");
                return;
            }
        }
        System.out.println("Cycle Not found");
    }

    private void display() {
        if(head==null){
            System.out.println("No node to display");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }

    private void createcycle() {
        if(head==null || head.next==null){
            System.out.println("Cant create");
            return;
        }
         Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head.next;
    }
    
    private void insert(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;           
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
}