package stackUtil;

public class Program {
	@SuppressWarnings({ "static-access", "incomplete-switch" })
	public static void main(String args[])
	{
		StackUtil util=new StackUtil();
		
		IO_opreation choice;
		
		while((choice=util.menuliust())!=IO_opreation.EXIT)
		{
			switch(choice)
			{
			case CREATE:util.acceptRecord();
				break;
			case PUSH:util.push();
				break;
			case POP:util.pop();
				break;
			case PEEK:util.peek();
				break;
			}
		}
	}

}
