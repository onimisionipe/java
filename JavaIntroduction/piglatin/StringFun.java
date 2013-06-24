
/**
 * Let's have fun with Strings first!
 */
public class StringFun
{
    public StringFun()
    {
    }

    public String firstLetter(String str) {
        return str.substring(0, 1);
    }
    
    public String firstThreeLetters(String str) {
        return str.substring(0, 3);
    }
    
    public String combine(String part1, String part2) {
        return part1 + part2;
    }
    
    public String firstNLetters(String str, int n) {
        return str.substring(0, n);
    }
    
    public String addFunnyEnding(String str) {
        return str + "eth";
    }
    
    public boolean beginsWithA(String str) {
        return firstLetter(str).equals("a");
    }
    
    public String reverse(String str) {
        return "This is a very difficult problem. You'll get the beast hat if you solve it yourself.";
    }
}
