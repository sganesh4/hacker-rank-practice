package interview;

import java.util.Collections;
import java.util.Stack;

public class StackSort {
	public static Stack<Integer> stack1=new Stack<Integer>();
	public static Stack<Integer> stack2=new Stack<Integer>();
	public static void stackSort()
	{
		int min=0, top, temp=stack1.size(), stacksize=stack1.size();
		while(!stack1.isEmpty()&&temp!=0)
		{
			min=stack1.pop();
			while(stack1.size()>stacksize-temp)
			{
				top=stack1.pop();
				if(top>=min)stack2.push(top);
				else
				{
					stack2.push(min);
					min=top;
				}
			}
			stack1.push(min);
			temp--;
			while(!stack2.isEmpty())
			{
				stack1.push(stack2.pop());
			}
			/*stack2.push(stack1.pop());
			top2=stack2.pop();
			while(!stack1.isEmpty()&&(top1=stack1.peek())<=top2)
			{
				stack2.push(stack1.pop());
			}
			stack2.push(top2);
			stack1.push(stack2.pop());
			top1=stack1.pop();
			while(!stack2.isEmpty()&&(top2=stack2.peek())<=top1)
			{
				stack1.push(stack2.pop());
			}
			stack1.push(top1);*/
		}
	}
	public static void main(String[] args) {
		stack1.push(4);
		stack1.push(3);
		stack1.push(1);
		/*stack1.push(7);
		stack1.push(2);
		stack1.push(24);
		stack1.push(8);
		stack1.push(4);
		stack1.push(9);
		stack1.push(4);
		stack1.push(14);
		stack1.push(4);
		stack1.push(41);*/
		System.out.println(stack1);
		stackSort();
		System.out.println(stack1);
		stackSort();
		System.out.println(stack1);
		//Collections.sort(stack1);
		//System.out.println(stack1);
		//System.out.println(stack1.pop());

	}

}
