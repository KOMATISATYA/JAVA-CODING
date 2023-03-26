import java.io.*;
import java.util.*;

public class QueueRevFir{

static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
	solve(q, k);
	int s = q.size() - k;
	while( s-- > 0){
		int x = q.poll();
		q.add(x);
	}
	return q;
}
static void solve(Queue<Integer> q, int k){
	if(k == 0) return;
	int y = q.poll();
	solve(q, k - 1);
	q.add(y);
}


public static void main (String[] args) {
	Queue<Integer> queue = new LinkedList<Integer>();
	System.out.println("enter no of elements");
        Scanner sc=new Scanner(System.in);
	int n = sc.nextInt();
        System.out.println("enter queue numbers");
        for(int i=0;i<n;i++)
        {
            int x=sc.nextInt();
            queue.add(x);
         }
        System.out.println("enter k to reverse ");
        int k=sc.nextInt();
	queue = reverseFirstK(queue, k);
	// printing queue
	while (!queue.isEmpty()) {
		System.out.print(queue.poll() + " ");
	}
}
}

