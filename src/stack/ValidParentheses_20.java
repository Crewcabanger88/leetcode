package stack;

public class ValidParentheses_20
{
    public boolean isValid(String s)
    {
        var stack = new Stack<Character>();

        for(var i = 0; i < s.length(); i++)
        {
            if(stack.isEmpty())
            {
                if(s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') return false;
            }

            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
            {
                stack.push(s.charAt(i));
                continue;
            }

            if(stack.peek() == '(')
            {
                if(s.charAt(i) == ')') stack.pop();
                else return false;
            }

            else if(stack.peek() == '[')
            {
                if(s.charAt(i) == ']') stack.pop();
                else return false;
            }

            else if(stack.peek() == '{')
            {
                if(s.charAt(i) == '}') stack.pop();
                else return false;
            }
        }

        return stack.isEmpty();
    }
}
