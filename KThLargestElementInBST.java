class Solution{
    static int ans;
    public static void InOrder(Node root,int K,int idx){
        if(root==null){
            return;
        }
        InOrder(root.left,K,idx);
        if(idx==K){
            ans=root.data;
            return;
        }
        else{
            idx++;
        }
        InOrder(root.right,K,idx);
        
    }
    // return the Kth largest element in the given BST rooted at 'root'
    public static int kthLargest(Node root,int K)
    {
        int idx=1;
        ans=-1;
        InOrder(root,K,idx);
        return ans;
    }
}
