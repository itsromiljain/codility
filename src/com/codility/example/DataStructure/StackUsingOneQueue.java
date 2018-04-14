/**
 * 
 */
package com.codility.example.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author romiljain
 *
 */
public class StackUsingOneQueue {
	
	Queue<Integer> queue = new LinkedList<Integer>();
	
	int top = 0;
	
	public StackUsingOneQueue(){
		//default constructor
	}
	
	/** Push element x onto stack. */
	public void push(int x) {
		queue.add(x);
		top = x;
	}
	
	/** Removes the element on top of the stack and returns that element. */
	public int pop() {
		 int size = queue.size();
		 for (int i=1; i< size; i++){
			 top = queue.remove();
			 queue.add(top);
		 }
		 int popElement = 0;
		 if(!queue.isEmpty()){
			 popElement =  queue.remove();
		 }
		 return popElement;
	}
	
	/** Get the top element. */
    public int top() {
		 return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
    	if (queue.isEmpty())
    		return true;
    	else
    		return false;
    }

}