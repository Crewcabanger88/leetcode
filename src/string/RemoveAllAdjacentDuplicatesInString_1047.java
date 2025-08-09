package string;

public class RemoveAllAdjacentDuplicatesInString_1047
{
    public String removeDuplicates(String s)
    {
        var sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            if(sb.length() >= 1 && s.charAt(i) == sb.charAt(sb.length() - 1)) sb.deleteCharAt(sb.length() - 1);
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }
}
