package com.company;

import java.util.EmptyStackException;

public class Stack {
	private ArrayList elementData = new ArrayList();
	
	public void push(Object o){
		elementData.add(o);
	}
	
	public Object pop()
	{
	 if(isEmpty()){
	 	throw new EmptyStackException();
	 }
	 return elementData.get(size()-1);
	}
	
	public Object peek(){
		if(isEmpty()){
			throw new EmptyStackException();
		}
		return elementData.get(size()-1);
	}
	public boolean isEmpty(){
		return size()==0;
	}
	public int size(){
		return elementData.size();
	}
}
