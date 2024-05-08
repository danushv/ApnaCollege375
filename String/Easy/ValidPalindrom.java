class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();

        String a =s.toLowerCase();

        for(int i=0;i<a.length();i++)
        {
            Character ch=a.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                sb.append(ch);
            }
        }

        String sa=sb.toString();
        return helper(sa);
    }

    public boolean helper(String sa)
    {
        int i=0;
        int j=sa.length()-1;

        while(i<j)
        {
            if(sa.charAt(i)!=sa.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
