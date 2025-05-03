import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class ExampleTree {
    TreeNode root;

    public void insert(int data){
        TreeNode newNode = new TreeNode(data);

        if(root == null){
            root = newNode;
            return;
        }
        
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            if(temp.left == null){
                temp.left = newNode;
                return;
            }
            else{
                q.add(temp.left);
            }
            if(temp.right == null){
                temp.right = newNode;
                return;
            }
            else{
                q.add(temp.right);
            }
        }
    }
    
    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.print(root.data + " ");
    }

    public void delete(int data){
        if(root == null){
            return;
        }

        if(root.left == null && root.right == null){
            if(root.data == data){
                root = null;
                return;
            }
        }

        Queue <TreeNode> q = new LinkedList<>();
        TreeNode temp = null;
        TreeNode match = null;

        while(!q.isEmpty()){
            temp = q.poll();

            if(temp.data == data){
                match = temp;
            }

            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
        }

        if(match != null){
            int x = temp.data;
            DeleteLastNode(temp);
            match.data = x;
        }
    }

    public void DeleteLastNode(TreeNode delNode){
        Queue <TreeNode> q = new LinkedList<>();

        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp.left != null){
                if(temp.left == delNode){
                    temp.left = null;
                    return;
                }
                else{
                    q.add(temp.left);
                }
            }
            
            if(temp.right != null){
                if(temp.right == delNode){
                    temp.right = null;
                    return;
                }
                else{
                    q.add(temp.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        ExampleTree tree = new ExampleTree();
        int[] nums = {1,2,3,4,5,6,7};
        for(int num:nums){
            tree.insert(num);
        }
        tree.preorder(tree.root);
        tree.delete(3);
    }
}
