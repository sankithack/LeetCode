class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack=new Stack();
        int result=0;
        for(int i=0;i<ops.length;i++)
        {
            if(ops[i].equals("C")){
                if(!stack.isEmpty())
                    stack.pop();
            }else if(ops[i].equals("+")){
                int a=0,b=0;
                if(!stack.isEmpty())
                    a=stack.pop();
                if(!stack.isEmpty())
                    b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }else if(ops[i].equals("D")){
                int c=0;
                if(!stack.isEmpty())
                    c=stack.peek();
                stack.push(c*2);
            }else{
                stack.push(Integer.valueOf(ops[i]));
            }
        }
        while(!stack.isEmpty())
            result+=stack.pop();
        return result;        
    }
}