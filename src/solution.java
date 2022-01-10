import java.util.Stack;
public class solution {
    static int type(char ch){
        switch(ch){
            case '(':
                return 1;
            case '{':
                return 2;
            case '[':
                return 3;
        }
        return -1;
    }
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<x.length(); ++i){
            char c = x.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else if(c==')'&&type(stack.peek())==1){
                return true;
            }
            else if(c=='}'&&type(stack.peek())==2){
                return true;
            }
            else if(c==']'&&type(stack.peek())==3){
                return true;
            }else{
                return false;
            }
        }
   return true;
    }
    public static void main(String[] args){
  String x="([[";
  if(ispar(x)==true) System.out.println("Balanced");
  else System.out.println("Not Balanced");
    }
}

