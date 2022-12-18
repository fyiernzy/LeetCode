package Mine;

import java.util.*;

public class Q13 {
	public static void main(String[] args) {
		
		// System.out.printf("d1 = %d, d2 = %d, value = %d\n", d1, d2, value);
		
		// System.out.printf("The value of %s is %d", roman, value);

	}
}

class Solution {
    public int romanToInt(String s) {
    	char[] ROMAN = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int[] VALUE = {1, 5, 10, 50, 100, 500, 1000};
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < ROMAN.length; i++) 
			map.put(ROMAN[i], VALUE[i]);
		
		
		int value = 0;
		
		for(int i = s.length() - 1; i >= 0; i--) {
			int d1 = map.get(s.charAt(i));
			int d2 = (i == 0) ? d1 : map.get(s.charAt(i - 1));
			
			if (d1 <= d2)
				value += d1;
			else {
				value += (d1 - d2);
				i--;
			}
		}
		
        return value;
    }
}
