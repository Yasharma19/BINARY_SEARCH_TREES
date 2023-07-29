    
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
