package interview;
import java.util.*;
public class SetOfStacks {
	private static int currentStack=-1;
	private static final int THRESHOLD=5;
	private static ArrayList<Stack<Integer>> setOfStacks= new ArrayList<Stack<Integer>>();
	public static void push(int data)
	{
		Stack<Integer> stack=null, newStack=null;
		if(currentStack==-1)
		{
			stack=new Stack<Integer>();
			stack.push(data);
			setOfStacks.add(stack);
			currentStack++;
		}
		else
		{
			stack=setOfStacks.get(currentStack);
			if(stack.size()<THRESHOLD)
			{
				stack.push(data);
			}
			else
			{
				newStack=new Stack<Integer>();
				newStack.push(data);
				setOfStacks.add(newStack);
				currentStack++;
			}
			
		}
	}
	public static int pop()
	{
		if(currentStack==-1)
		{
			System.out.println("All stacks empty");
			return Integer.MAX_VALUE;
		}
		Stack<Integer> stack=setOfStacks.get(currentStack);
		int value=stack.pop();
		if(stack.isEmpty())
		{
			setOfStacks.remove(currentStack--);
		}
		
		return value;
	}
	public static int popAt(int index)
	{
		if(currentStack==-1)
		{
			System.out.println("All stacks empty");
			return Integer.MAX_VALUE;
		}
		if(index>currentStack)
		{
			System.out.println("Invalid index ");
			return Integer.MAX_VALUE;
		}
		else{ 
			Stack<Integer> indStack=setOfStacks.get(index);
			if(currentStack==index)
			return pop();
			else
			{
				int value=indStack.pop();
				indStack.push(pop());
				return value;
			}
		}
	}
	public static int peek()
	{
		return (currentStack==-1)?setOfStacks.get(currentStack).peek():Integer.MAX_VALUE;
	}
	public boolean isEmpty()
	{
		return (currentStack==-1);
	}
	public static void main(String[] args) {
		pop();
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);
		pop();
		push(6);
		push(7);
		push(8);
		push(9);
		push(10);
		push(11);
		push(12);
		push(13);
		push(14);
		push(15);
		push(16);
		push(17);
		push(18);
		pop();
		pop();
		pop();
		pop();
		pop();
		System.out.println(setOfStacks);
		System.out.println(popAt(2));
		System.out.println(setOfStacks);
		System.out.println(popAt(1));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
		System.out.println(popAt(0));
		System.out.println(setOfStacks);
	}

}
