class GFG
{
    
    public static boolean Solve(Node root,int min,int max){
        if(root==null)
            return false;
        
        if(min==max){  //Lower and Upper Bound are equal so, No space to add any node,i.e. called a Dead End.
            return true;
        }    
        
        return Solve(root.left,min,root.data-1) || Solve(root.right,root.data+1,max);
    }
    
    public static boolean isDeadEnd(Node root)
    {
        //given that number is positive so lower is 1 and upper is +Infinity i.e. MaxValue.
        return Solve(root,1,Integer.MAX_VALUE);
       
    }
}
