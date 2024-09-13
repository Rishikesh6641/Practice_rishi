package org.collection;

import java.util.Scanner;

import org.exceptions.EmptyStackException;
import org.exceptions.StackFullException;

public class Stack {
	
	private int top;
	private int size;
	private int[] arr;
	
	static Scanner sc=new Scanner(System.in);
	public Stack()
	{
	}
	public Stack(int size)
	{
		this.size=size;
		this.arr=new int[size];
		top=-1;
	}
	
	public void push()throws StackFullException
	{
		if(this.top==this.size-1)
			throw new StackFullException("Stack is full");
		else
		{
			System.out.println("Enter Element for top["+(this.top+1)+"]");
			arr[++this.top]=sc.nextInt();
		}
	}
	
	public void pop()throws org.exceptions.EmptyStackException
	{
		if(this.top==-1)
			throw new org.exceptions.EmptyStackException("Stack is Empty");
		this.top--;
	}
	public int peek()throws EmptyStackException
	{
		if(this.top==-1)
			throw new EmptyStackException();
		
		return arr[this.top]; 
	}
}
