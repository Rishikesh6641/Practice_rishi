package stackUtil;

import java.util.Scanner;

import org.collection.Stack;
import org.exceptions.EmptyStackException;
import org.exceptions.StackFullException;

public class StackUtil {
	
	private Stack stack;
	private static Scanner sc=new Scanner(System.in);
	StackUtil()
	{
	}
	public void acceptRecord()
	{
		System.out.println("Enter Size:");
		int size=sc.nextInt();
		this.stack=new Stack(size);
	}
	public void push()
	{
		try
		{
			this.stack.push();
		}
		catch(StackFullException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void pop()
	{
		try {
			this.stack.pop();
		}
		catch(EmptyStackException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void  peek()
	{
		try {
			System.out.println(this.stack.peek());
		}catch(EmptyStackException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static IO_opreation menuliust()
	{
		System.out.println("0.Exit");
		System.out.println("1.Create");
		System.out.println("2.Push");
		System.out.println("3.Pop");
		System.out.println("4.Peek");
		
		return IO_opreation.values()[sc.nextInt()];
	}

}
