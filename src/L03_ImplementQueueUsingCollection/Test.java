/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L03_ImplementQueueUsingCollection;
import java.util.*;
/**
 *
 * @author DELL-PC
 */
public class Test {
    public static void main(String args[])
    {
        Queue<Integer> queue=new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        System.out.println(queue.poll());
        System.out.println(queue.poll());
                
    }
}
