//---------------------------------------------------------------------------
// LinkedQueue.java            by Dale/Joyce/Weems                  Chapter 4
//
// Implements QueueInterface using a linked list.
//---------------------------------------------------------------------------

import java.util.Iterator;

public class LinkedQueue<T> implements QueueInterface<T>
{
  protected LLNode<T> front;     // reference to the front of this queue
  protected LLNode<T> rear;      // reference to the rear of this queue
  protected int numElements = 0; // number of elements in this queue

  public LinkedQueue()
  {
    front = null;
    rear = null;
  }

  public void enqueue(T element)
  // Adds element to the rear of this queue.
  { 
    LLNode<T> newNode = new LLNode<T>(element);
    if (rear == null)
      front = newNode;
    else
      rear.setLink(newNode);
      rear = newNode;
      numElements++;
    System.out.println(element);
  }     

  public T dequeue()
  // Throws QueueUnderflowException if this queue is empty;
  // otherwise, removes front element from this queue and returns it.
  {
    if (isEmpty())
      throw new QueueUnderflowException("Dequeue attempted on empty queue.");
    else
    {
      T element;
      element = front.getInfo();
      front = front.getLink();
      if (front == null)
        rear = null;
      numElements--;
      return element;
    }
  }

  public boolean isEmpty()
  // Returns true if this queue is empty; otherwise, returns false.
  {              
    return (front == null);
  }
  
  public boolean isFull()
  // Returns false - a linked queue is never full.
  {              
    return false;
  }

  public int size()
  // Returns the number of elements in this queue.
  {
    return numElements;
  }


  public String toString()
  {
    String getString = "";
    LLNode<T> itemFront = front;
    //exception
    if(isEmpty()) {
      throw new QueueUnderflowException("Error. Queue is Empty.");
    }
    while(itemFront != null)
    {
      getString += itemFront.getInfo().toString() + " ";
      itemFront = itemFront.getLink();
    }
    System.out.println(getString);
    return getString;
  }

  public void remove(int count) {
    LLNode<T> itemFront = front;

    if (isEmpty()) {
      throw new QueueUnderflowException("Remove attempted on empty queue.");
    }
    else
    {
      for (int i = count; i > 0; i--)
      {
        if (itemFront != null) {
          itemFront.getInfo();
          front = front.getLink();
          numElements -= count;
        }
      }
    }
  }

  public boolean swapStart()
  {
    T firstElement;
    T sndElement;
    //    int calc = (front + 1) % elements.length;

    System.out.println("\nFirst Two Items Swapped: ");
    //if less than 2 elements, do not swap
    if(numElements < 2)
    {
      return false;
    }
    else
    {
      firstElement = front.getInfo();
      sndElement = front.getLink().getInfo();
      front.setInfo(sndElement);
      front.getLink().setInfo(firstElement);
      return true;
    }
  }
//
//  public boolean swapEnd()
//  {
//    T firstElement;
//
//    System.out.println("\nLast Two Items Swapped: ");
//
//    int calc = (rear - 1) % elements.length;
//
//    if(elements.length < 2)
//    {
//      return false;
//    }
//    else
//    {
//      firstElement = elements[rear];
//      elements[rear] = elements[calc];
//      elements[calc] = firstElement;
//    }
//    return true;
//  }

}

