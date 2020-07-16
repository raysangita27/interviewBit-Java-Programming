/*
Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each operand may be an integer or another expression.



Input Format

The only argument given is character array A.
Output Format

Return the value of arithmetic expression formed using reverse Polish Notation.
For Example

Input 1:
    A =   ["2", "1", "+", "3", "*"]
Output 1:
    9
Explaination 1:
    starting from backside:
    *: ( )*( )
    3: ()*(3)
    +: ( () + () )*(3)
    1: ( () + (1) )*(3)
    2: ( (2) + (1) )*(3)
    ((2)+(1))*(3) = 9
    
Input 2:
    A = ["4", "13", "5", "/", "+"]
Output 2:
    6
Explaination 2:
    +: ()+()
    /: ()+(() / ())
    5: ()+(() / (5))
    1: ()+((13) / (5))
    4: (4)+((13) / (5))
    (4)+((13) / (5)) = 6
    
  */
  
  public class Solution {
    public int evalRPN(ArrayList<String> A) {
        if(A.size()== 0)
            return 0;
        Stack<String> stk = new Stack<String>();
        for(String s : A )
        {
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/"))
            {
                int b = Integer.parseInt(stk.pop());
                int a = Integer.parseInt(stk.pop());
                switch(s)
                {
                    case "/" :  stk.push( Integer.toString(a/b) );
                                break;
                    case "*" :  stk.push( Integer.toString(b*a) );
                                break;
                    case "+" :  stk.push( Integer.toString(b+a) );
                                break;
                    case "-" :  stk.push( Integer.toString(a-b));
                                break;
                }
            }
            else
            {
                stk.push(s);
            }
        }
        return Integer.parseInt(stk.pop());
    }
}
