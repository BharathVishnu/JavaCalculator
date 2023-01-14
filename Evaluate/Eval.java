package Evaluate;
public class Eval
{    
    public String evaluate(String expression) 
    {
        char[] arr = expression.toCharArray();
        String op1 = "";
        String op2 = "";
        String op = "";
        double result = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
            {
                if(op.isEmpty())
                {
                    op1 += arr[i];
                }
                else
                {
                    op2 += arr[i];
                }
            }  

            if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == 'x' || arr[i] == '%' || arr[i] == '^') 
            {
                op += arr[i];
            }
        }

        if (op.equals("+"))
            result = (Double.parseDouble(op1) + Double.parseDouble(op2));
        else if (op.equals("-"))
            result = (Double.parseDouble(op1) - Double.parseDouble(op2));
        else if (op.equals("/"))
            result = (Double.parseDouble(op1) / Double.parseDouble(op2));
        else if(op.equals("%"))
            result =(Double.parseDouble(op1) % Double.parseDouble(op2));
        else if(op.equals("x"))
            result = (Double.parseDouble(op1) * Double.parseDouble(op2));
        else
        {
            int n = Integer.parseInt(op2);
            double op11 = Double.parseDouble(op1);
            for(int i=0;i<=n;i++)
            {
                result = result * op11;
            }
        }         
        return String.valueOf(result);
    }		
}    	


