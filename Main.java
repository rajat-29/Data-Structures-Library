import java.io.*;
import java.util.*;
import java.lang.*;
import Rajat.DS.*;

public class Main
{
	public static void main(String[] args) 
	{
		Rajat.DS.SinglyLinkedList n = new SinglyLinkedList();

		n.addFirst(1); 	
		n.addFirst(2);
		n.addFirst(3);

		System.out.println(n.toString());

		n.removeFirst();
		n.addLast(8);
		
		System.out.println(n.toString());
	}
}
