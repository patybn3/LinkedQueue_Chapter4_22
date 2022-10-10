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
//        //size of the list
//        System.out.println("Size: " + newList.size());

        //will remove two items from the front
        newList.remove(2);
        newList.toString();

        newList.swapStart();
        newList.toString();
//
//        newList.swapEnd();
//        newList.toString();
        //tests the dequeue method
        System.out.println("\nDequeue Example: ");
//        newList.dequeue();
//        newList.toString();
        //prints the empty space again to test
        System.out.println();
    }
}
