import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
    
        String Output = s.substring(0,8);
        String Input = Output.substring(0,2);
        int StringToInt = Integer.parseInt(Input);
        if(s.contains("PM") && StringToInt != 12){
        StringToInt = StringToInt + 12;
            return StringToInt+Output.substring(2);
        }
        else if (s.contains("AM") && StringToInt < 12){
             return Output;
        }
        else if (StringToInt == 12 && s.contains("AM"))
        {
            return  "00"+s.substring(2,8);
        }
        else if (StringToInt == 12 && s.contains("PM"))
        {
            return Output;
        }
        return Output;
    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

