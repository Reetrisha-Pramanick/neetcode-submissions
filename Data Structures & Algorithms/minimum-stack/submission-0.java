class MinStack {
Stack<Long> st = new Stack<>();
long mini = Long.MAX_VALUE;
    public MinStack() {   
    }
    
    public void push(int val) {
       if(st.isEmpty())
       {
        mini = val; // the first element will be minimun
        st.push((long)val); //first element in stack
       } 
       else
       if(mini < val)
       {
        st.push((long)val); //if the value is bigger no need to modify push it
       }
       else
       {
        st.push(2L*val-mini); //the modified value
        mini = val; //the minimum will be that value
       }
    }
    
    public void pop() {
       if(st.isEmpty())
       {
        return; //the edge case
       } 
       long n = st.peek();
       st.pop(); //pop it out
       if(n < mini)
       {
        mini = 2L*mini - n; //preserve the previous mini
       }
    }
    
    public int top() {
        if(st.isEmpty())
        {
            return -1; //edge case
        }
        long n = st.peek();
        if(mini < n) //if value if bigger than mini then not the modified value 
        {
            return (int)n;
        }
        return (int) mini; 
        
    }
    
    public int getMin() {
        return (int) mini;
    }
}
