/*
Implement the class for Max Priority Queue which includes following functions -
1. getSize -
Return the size of priority queue i.e. number of elements present in the priority queue.
2. isEmpty -
Check if priority queue is empty or not. Return true or false accordingly.
3. insert -
Given an element, insert that element in the priority queue at the correct position.
4. getMax -
Return the maximum element present in the priority queue without deleting. Return -Infinity if priority queue is empty.
5. removeMax -
Delete and return the maximum element present in the priority queue. Return -Infinity if priority queue is empty.
*/

// SOLUTION CLASS THAT CONTAINS FUNCTION TO SOLVE PROBLEM

import java.util.ArrayList;

public class PQ {
	
    private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}
    
    
    // Complete this class
	boolean isEmpty() {
		return heap.size() == 0;
	}

	int getSize() {
		return heap.size();
	}


	int getMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return heap.get(0);
    }

	void insert(int element) {
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while (childIndex > 0) {
			if (heap.get(childIndex) > heap.get(parentIndex)) {
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			} else {
				return;
			}
		}
	}

	int removeMax() {
		if (isEmpty()) {
			return Integer.MIN_VALUE;
		}
        
        int p=heap.get(0);
        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);
        
  
        int parentindex = 0;
		int minIndex = parentindex;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
        
        	while(leftChildIndex < heap.size()){

			if(heap.get(leftChildIndex) > heap.get(minIndex))
				minIndex = leftChildIndex;
			
                
			if(rightChildIndex < heap.size() && heap.get(rightChildIndex) > heap.get(minIndex))
				minIndex = rightChildIndex;
			
			if(minIndex == parentindex)
				break;
                
			else{
				int temp1 = heap.get(parentindex);
				heap.set(parentindex, heap.get(minIndex));
				heap.set(minIndex, temp1);
				parentindex = minIndex;
				leftChildIndex = 2 * parentindex + 1;
				rightChildIndex = 2 * parentindex + 2;
			}
	}
        
	return p;	
	}

}




// MAIN CLASS

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static StringTokenizer st;

	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		PQ pq = new PQ();
		int choice = Integer.parseInt(st.nextToken());
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = Integer.parseInt(st.nextToken());
					pq.insert(element);
					break;
				case 2 : // getMax
					System.out.println(pq.getMax());
					break;
				case 3 : // removeMax
					System.out.println(pq.removeMax());
					break;
				case 4 : // size
					System.out.println(pq.getSize());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
				default :
						return;
			}
			choice = Integer.parseInt(st.nextToken());
		}
	}

}
