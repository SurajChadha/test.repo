package dataStructures;

import java.util.Stack;

public class SpecialStack extends Stack {
    void push(int x, SpecialStack min)
    {
        if(isEmpty()==true){
            super.push(x);
            min.push(x);
        }
        else{
        super.push(x);
        int y = (int) min.pop();
        min.push(y);
    
        if(x<y)
        min.push(x);
        else
        min.push(y);
        }
    }
    public Integer pop(SpecialStack min)
    {
        int x = (int) super.pop();
        min.pop();
        return x;
    }
    int getMin(SpecialStack min)
    {
        int x = (int) min.pop();
        min.push(x);
        return x;
    }
    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
System.out.println(s.getMin());
    s.push(5);
    System.out.println(s.getMin());

    System.out.println(s.pop());
    System.out.println(s.getMin());

    }
    private char[] getMin() {
        return null;
    }

}
