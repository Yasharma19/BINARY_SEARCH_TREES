
class Tree {
    //For minimum,go till the left. There is no need to go right part as it is of no use for finding min element.
    //for maximum, we get it on the rightmost of BST. There is no need to go left part as it is of no use for finding max element.
    
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
