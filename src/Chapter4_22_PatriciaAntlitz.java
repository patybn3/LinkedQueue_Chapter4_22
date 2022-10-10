/* Problem Set 4 - 22 Chapter 4 Object-Oriented Data Structures Using Java, 4th Edition
-------------------------------------------------------------*
/*
Name: Patricia Antlitz
Date: 10/08/2022
Class: CIS-252 Computer Science II - NECC Fall 2022

 * Please read the README file for detailed information about this program.

 * This file is the main class that runs this program
 * newList object is created from the LinkedQueue.java which implements an interface, QueueInterface.java class
 * The following files are NOT original to this code (not coded by me):
    * QueueInterface.java
    * QueueUnderflowException.java
    * QueueOverflowException.java
 * The following file was partially coded by me (methods added): LinkedQueue.java
 * This is a simple main class, no user intake is necessary. All values are given by the program as a test
*/

/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */

public class Chapter4_22_PatriciaAntlitz
{
    public static void main(String[] args)
    {
        LinkedQueue<Integer> newList = new LinkedQueue<>();
        //this loop will insert 10 numbers into the queue
        System.out.println("Numbers on This List:");
        for(int i = 0; i < 10; i++)
        {
            //enqueue method will received numbers from 0 - 9
            newList.enqueue(i);
        }
        //prints the list
        newList.toString();
        //will remove two items from the front
        newList.remove(2);
        newList.toString();

        newList.swapStart();
        newList.toString();
//
        newList.swapEnd();
        newList.toString();
        //tests the dequeue method
        System.out.println("\nDequeue Example: ");
        newList.dequeue();
        newList.toString();
    }
}
