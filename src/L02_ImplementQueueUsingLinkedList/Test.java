/**
 *                         Implement Queue using LinkedList
 *        
 *                      front-->2 null    enqueue(4)        front-->2-->4 null     enqueue(5)     front--> 2-->4-->5null     dequeue()     front--> 4-->5 null
 *                              ^        ----------->                   ^         ------------>                    ^        --------->                  ^
 *                              |                                       |                                          |                                    |
 *                             rear                                    rear                                       rear                                 rear
 * 
 */               
package L02_ImplementQueueUsingLinkedList;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        this.data=d;
    }
}
public class Test {
    static Node front=null;
    static Node rear=null;
    static void enqueue(int d)
    {
        Node temp=new Node(d);
        if(front==null && rear==null)
        {
            front=temp;
            rear=temp;
        }
        else
        {
            rear.next=temp;
            rear=rear.next;
        }
    }
      static int dequeue()
      {
        int save=-1;  
        if(front==null && rear==null)
        {
            System.out.println("No ELement is there!! ");
        }
        else
        {
           save=front.data;
           front=front.next;
        }
        return save;
      }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int choice;
        char ch;
        do{
        System.out.print("1- ENQUEUE()\n2- DEQUEUE()\n Enter Your choice= ");
        choice=obj.nextInt();
        switch(choice)
        {
            case 1:
            {
                int d=obj.nextInt();
                enqueue(d);
                break;
            }
            case 2:
            {
                System.out.println("Deleted Element is="+dequeue());
                break;
            }
        }
        System.out.println("Do You want More[y/n==>");
        ch=obj.next().charAt(0);
    }while(ch=='y'||ch=='Y');
    }
}
