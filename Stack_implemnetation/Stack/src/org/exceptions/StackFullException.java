package org.exceptions;

@SuppressWarnings("serial")
public class StackFullException extends Exception{
	
	public StackFullException()
	{
	}
	public StackFullException(String msg)
	{
		super(msg);
	}

}
