/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PriorityQueue;

/**
 *
 * @author ahmad al fajri
 */
  import java.util.PriorityQueue;
public class q1 {
   

public static void main(String[] args) {
  PriorityQueue<String> queue=new PriorityQueue<String>();  
  queue.add("Red");
  queue.add("Green");
  queue.add("Orange");
  queue.add("White");
  queue.add("Black");
  System.out.println("Elements of the Priority Queue: ");
  System.out.println(queue);
 }
}

