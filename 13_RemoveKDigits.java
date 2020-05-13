class Solution {
    public String removeKdigits(String num, int k) {
        int len=num.length();
        if(k==len) return "0";
        int i=0;
        Stack<Character> stack= new Stack<>();
        // Starting from left, we are pushing those characters into the stack whose right element is greater 
        // than the right element till k becomes zero
        while(i<(len)){
            while(k>0 && !stack.isEmpty() && stack.peek()>num.charAt(i))
            {
                stack.pop();
                k--;
            }
                stack.push(num.charAt(i));
                ++i;
        }
        while(k>0) // corner case when all are equal "2222"
        {
            stack.pop();
            --k;
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
            str.append(stack.pop());
        str.reverse();
        while(str.length()>1 && str.charAt(0)=='0')
            str.deleteCharAt(0);
        return str.toString();
    }
}
