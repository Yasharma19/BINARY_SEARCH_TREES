
//one left then extreme right  for PREDECESSOR
public static Node inpre(Node root){
    Node p=root.left;
    while(p.right!=null){
        p=p.right;
    }
    return p;
}

//one Right then extreme left for SUCCESSOR
public static Node insuc(Node root){
    Node s=root.right;
    while(s.left!=null){
        s=s.left;
    }
    return s;
}

public static void findPreSuc(Node root, int key)
{
    //In an inorder traversal the number just smaller than the target is the predecessor
    //And the number just greater than the target is the successor. 
    
    //if Node is Non-Leaf node, we follow -
    //for predecessor, we have to go one Left and then Extreme right
    //for successor, we have to go one Right and then Extreme left.
    
    //if Node is Leaf Node - 
    //If we are moving to left, Update Successor.
    //If we are moving to Right, Update Predecessor.
    
    if(root==null){
        return;
    }
    
    if(root.data==key){
        if(root.left!=null){
            pre=inpre(root);
        }
        if(root.right!=null){
            suc=insuc(root);
        }
    }
    
    //if Node is Leaf Node - 
    //If we are moving to Right, Update Predecessor.
    if(key>root.data){
        pre=root;   //Updating
        findPreSuc(root.right,key);
    }
    
    //if Node is Leaf Node - 
    //If we are moving to left, Update Successor.
    else if(key<root.data){
        suc=root;   //Updating
        findPreSuc(root.left,key);
    }
    
    
}
}
