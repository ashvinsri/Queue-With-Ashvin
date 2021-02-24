/**
 * 
 * QUEUE is a FIFO data structure which inserts at the last and removes from the begining of the array.
 * It has mainly four operations 
 *  i)- enqueue()              iii)- getFront()
 * ii)- dequeue()               iv)- getLast
 *    0   1   2   3  4  5                            0   1   2   3   4   5                          0   1   2   3   4   5
 *    2 | 3 | 4 |  |  |  |          dequeue()      |   | 3 | 4 |  |    |   |    en(5,6,7)         |   | 3 | 4 | 5 | 6 | 7  |                  
 *    ^       ^                    ----------->          ^   ^                  ----------->            ^               ^          
 *    |       |                                          |   |                                          |               |
 *   front   rear                                     front  rear                                     front            rear
 *   
 *    when element is deleted then front is updated when element is added then rear is updated
 *    
 */
package L01_ImplementQueueUsingArray;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    static int n=5;
    static int queue[]=new int[n];
    static int front =-1;
    static int rear=-1;
    static void enqueue(int d)
    {
        if((front==0 && rear==n-1)||front==rear+1)
        {
            System.out.println("Queue is Full");
            return;
        }
        else if(front==-1 && rear==-1)
        {
            front=0;
            rear=0;
        }
        else if(rear==n-1)
        {
            rear=0;
        }
        else
        {
            rear=rear+1;
        }
        queue[rear]=d;
    }
    static int dequeue()
    {
        int save=0;
        if(front==-1 && rear==-1)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else if(front==rear)
        {
            save=front;
            front=-1;
            rear=-1;
        }
        else if(front==n-1)
        {
            save=front;
            front=0;
        }
        else
        {
            save=front;
            front=front+1;
        }
        return queue[save];
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
