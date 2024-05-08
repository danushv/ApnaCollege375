class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> sa=new Stack<>();

        if(s.length()%2!=0)
        return false;
     for(int i=0;i<s.length();i++)
     {
         char c=s.charAt(i);

         if(c=='('||c=='['||c=='{')
         {
             sa.push(c);
         }
       else if(c==')'&&!sa.isEmpty()&&sa.peek()=='(')
        {
            sa.pop();
        }
       else  if(c==']'&& !sa.isEmpty() &&sa.peek()=='[')
            {
                sa.pop();
            }
        else    if(c=='}'&& !sa.isEmpty() &&sa.peek()=='{')
            {
                sa.pop();
            }
        else 
        return false;

         
         
     }
     return sa.isEmpty();
    }
}
