/*
* Leetcode 13 - Roman to Integer
* Algorithm : if (int) current character is greater than the (int) next character
*               add (int)current to result
*               else subtract (int) current from result
*
*/



class RomanToInteger {
    public int romanToInt(String s) { 
        int num = 0;
        Map<Character, Integer> map = new HashMap<>();
         map.put('I', 1);
         map.put('V', 5);
         map.put('X', 10);
         map.put('L', 50);
         map.put('C', 100);
         map.put('D', 500);
         map.put('M', 1000);
        
        for(int i = 1; i < s.length()  ;i++) {
           int cur = map.get(s.charAt(i-1));
            int next = map.get(s.charAt(i));
           if(cur >= next) num += cur;
            else num -= cur;
        }
        return num + map.get(s.charAt(s.length() - 1));
    }
}