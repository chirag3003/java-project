package Dequeue;

import java.util.*;

public class Dequeue {
    int arr[]; // array to hold up to 100 integer elements
    int lim, front, rear;

    Dequeue(int cap) {
        lim = cap;
        front = 0;
        rear = 0;
        arr = new int[100];
    }

    void addfront(int val) {
        // checking if we can add more elements from the front end
        if (front > 0)
            arr[front--] = val;
        else
            System.out.print("\n Overflow from front");
    }

    void addrear(int val) {
        // checking if we can add more elements from the rear end
        if (rear - front < lim && rear < arr.length - 1)
            arr[++rear] = val;
        else
            System.out.print("\n Overflow from rear");
    }

    int popfront() {
        // checking if we can pop more elements from the front end
        if (front != rear)
            return arr[++front];
        else
            return -9999;
    }

    int poprear() {
        // checking if we can pop more elements from the rear end
        if (front != rear)
            return arr[rear--];
        else
            return -9999;
    }

    void show() {
        if (front == rear)
            System.out.println("Dequeue is Empty");
        else {
            for (int i = front + 1; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(int z) {
        Scanner sc = new Scanner(System.in);
        int ch, k, num;
        Dequeue ob = new Dequeue(z);
        while (true) {
            System.out.println("\n\tMENU");

            System.out.println("1.Push Rear");
            System.out.println("2.Push Front");
            System.out.println("3.Pop Rear");
            System.out.println("4.Pop Front");
            System.out.println("5.Display");
            System.out.println("6.Exit");
            System.out.println("Enter Your Choice :- ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a number :- ");
                    num = sc.nextInt();
                    ob.addrear(num);
                    break;
                case 2:
                    System.out.println("Enter a number :- ");
                    num = sc.nextInt();
                    ob.addfront(num);
                    break;
                case 3:
                    k = ob.poprear();
                    if (k != -9999)
                        System.out.println("Number deleted is :- " + k);
                    else
                        System.out.println("UNDERFLOW ");
                    break;
                case 4:
                    k = ob.popfront();
                    if (k != -9999)
                        System.out.println("Number deleted is :- " + k);
                    else
                        System.out.println("UNDERFLOW ");
                    break;
                case 5:
                    ob.show();
                    break;
                case 6: // stopping the program
                    System.exit(0);
                default:
                    System.out.println("Wrong Choice");

            }
        }
    }
}