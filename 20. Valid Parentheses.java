class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++){
            
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            
            if (stack.size() == 0 || Hmap.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }
        
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}class Solution {
    public boolean isValid(String s) {
        HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
        
        Stack<Character> stack = new Stack<Character>();
        
        for (int i = 0; i < s.length(); i++){
            
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
                continue;
            }
            
            if (stack.size() == 0 || Hmap.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
        }
        
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}