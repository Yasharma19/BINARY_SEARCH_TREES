import java.util.*;

class HelloWorld{
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    
    public static Node insert(Node root,int k){
        if(root==null){
            root=new Node(k);
            return root;
        }
        if(root.data<k){
            root.right=insert(root.right,k);
        }
        else{
            root.left=insert(root.left,k);
        }
        return root;
    }
    
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static boolean search(Node root,int k){
        if(root==null){
            return false;
        }
        
        if(root.data>k){
            return search(root.left,k);
        }
        else if(root.data==k){
            return true;    
        }
        else{        //root.data<k
            return search(root.right,k);
        }
        
    }
    
    // 3 types of deletion
    // 1.No child    2.one child    3.two children
    // 1.No child - simple, only delete node and return null to its parent.
    // 2.one child - delete node and replace with child node
    // 3.two children - replace value with inorder successor and then delete the node for inorder successor(next in inorder sequence of the BST)
    // Inorder successor always has 0 or 1 child 
    
    public static Node Delete(Node root,int k){
        if(root==null){
            return null;
        }
        if(root.data>k){
            root.left=Delete(root.left,k);
        }
        else if(root.data<k){
            root.right=Delete(root.right,k);
        }
        else{     //root.data==k
            //CASE 1 = NO CHILD
            if(root.left==null && root.right==null){
                return null;
            }
            
            //CASE 2 = 1 CHILD
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            
            //CASE 3 = 2 CHILDREN
            //Find a inorder successor
            Node IS=inorderSuccessor(root.right);
            root.data=IS.data;
            root.right=Delete(root.right,IS.data);
        }
        return root;
    }
    
    //For finding inorder Successor
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        
        inorder(root);
        System.out.println();
        System.out.println(search(root,2));
        
        Delete(root,4);
        inorder(root);
        
    }
}
