package hw7;

import java.util.*;

public class Servers {
	public int minMeetingRooms(int[][] intervals) { 
		// Your code here    
		PriorityQueue<Integer> servers=new PriorityQueue<Integer>();
		Arrays.sort(intervals, (x, y)-> x[0]-y[0]);
		for (int[] time : intervals) {
            int start = time[0];
            int end = time[1];
            
            if (!servers.isEmpty() && servers.peek() <= start) {
            	servers.poll();
            }
            servers.offer(end);
        }
        return servers.size();
		}
	
	public static void main(String[] args) {
		Servers s=new Servers();
		int[][] intervals= {{0,30},{5,10},{15,20}};
		System.out.println(s.minMeetingRooms(intervals));
		int[][] new_intervals= {{0,1},{1,2},{2,3}};
		System.out.println(s.minMeetingRooms(new_intervals));
	}
	}
