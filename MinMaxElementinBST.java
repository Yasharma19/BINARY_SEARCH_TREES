
class Tree {
    //For minimum,go till the left.
    //for maximum, we get it on the rightmost of BST.
    
    //complexity will be O(Height).
    
    int minValue(Node node) {
        if(node==null){
            return -1;
        }
        if(node.left!=null){
            return minValue(node.left);
        }
        else{
            return node.data;
        }
        
    }
    
    int maxValue(Node node) {
        if(node==null){
            return -1;
        }
        if(node.right!=null){
            return maxValue(node.right);
        }
        else{
            return node.data;
        }   
    }   
}
