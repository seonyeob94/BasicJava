package kr.or.ddit.study13;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample02 {
	public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 3, 3, 4, 4, 2, 4, 5};
        Map<Integer, Integer> counter = new HashMap();
        for(int num : numbers) {
        	counter.put(num, counter.getOrDefault(num, 0)+1);
        }
    	System.out.println(counter);
    	

    	int maxcount =0;
    	int maxnum=-1;
    	boolean pass = true;
    	for(Map.Entry<Integer, Integer> entry:counter.entrySet()) {
    		pass=true;
    		if(entry.getValue()>maxcount) {
    			maxcount=entry.getValue();
    			maxnum=entry.getKey();
    		}
    		else if(entry.getValue()==maxcount)
    			pass =false;
    		
    	}
    	if(!pass) maxcount=-1;
    	System.out.println(maxnum+" "+maxcount);
	}

}
