package alghoritms;

public class PalindromeNumber_9
{
    public boolean isPalindrome(int x)
    {
        if(x < 0) return false;

        int copyOfX = x;
        int res = 0;

        while(copyOfX >= 1)
        {
            res = res * 10 + copyOfX % 10;
            copyOfX /= 10;
        }

        return res == x;
    }
}
