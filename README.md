<h3>Object-Oriented Data Structure Using Java, 4th Edition</h3>

<h4>Student: Patricia Antlitz - NECC Fall 2022 <br> Computer Science II</h4>
<h5>Chapter 4 - Exercise 22</h5>

####variables used:

```java
    protected LLNode<T> front;     // reference to the front of this queue
    protected LLNode<T> rear;      // reference to the rear of this queue
    protected int numElements = 0; // number of elements in this queue
    String getString = "";         // used to print the items as a string
    LLNode<T> itemFront = front;   
    T firstElement;
    T sndElement;
```

###Methods added to `LinkedQueue.java` as required:

a. `String toString()` creates and returns a string that correctly represents
the current queue. Such a method could prove useful for testing and debugging
the class and for testing and debugging applications that use the class. Assume
each stacked element already provided its own reasonable `toString` method.<br>
```java
    public String toString();     //will loop the array, turn it to a string and print it
```
b. `void remove(int count)` removes the front count elements from the
queue, and throws `QueueUnderflowException` if there are less than count
elements in the queue.
```java
    public void remove(int count);      //user can select how many elements to pop
```

c. `boolean swapStart()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.
```java
  public boolean swapStart()        //To swap the top 2 elements
```
d. `boolean swapEnd()` if there are less than two elements on the stack returns
false; otherwise it reverses the order of the top two elements on the
stack and returns true.

```java
  public boolean swapEnd()        //To swap the top 2 elements
```

###Main class: Chapter4_22_PatriciaAntlitz.java

<hr>
<h5>Problems:</h5>

No problems, I used exercise 12 and 15 from Chapter 4, and 47 form Chapter 2 as an example for this
<hr>

<h5>Technologies</hr>
- JAVA 15.0.1


<hr>

<h3>To run:</h3>
<hr>

IDE:<br>
Build the project and run the Chapter4_22_PatriciaAntlitz.java file

CLI:<br>
* Navigate to the correct directory ....../Chapter4_22_PatriciaAntlitz/src <br>
* Run on terminal:
    * javac Chapter4_22_PatriciaAntlitz.java => compile
    * java Chapter4_22_PatriciaAntlitz.java => run

by [Patricia Antlitz - GitHub](https://github.com/patybn3)