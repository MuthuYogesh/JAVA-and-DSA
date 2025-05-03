import java.util.Queue;
import java.util.LinkedList;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    // Constructor
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
}

public class ExampleBST {
    TreeNode root;

    public void insert(int data){
        root = insertTreeNode(root, data);
    }

    public TreeNode insertTreeNode(TreeNode node, int key){
        if(node == null) return new TreeNode(key);

        if(key < node.data){
            node.left = insertTreeNode(node.left, key);
        }
        else if(key > node.data){
            node.right = insertTreeNode(node.right, key);
        }
        System.out.println(root.data);
        return node;
    }

    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void insertwithq(int data){
        TreeNode newNode = new TreeNode(data);
        if(root == null){
            root = newNode;
            return;
        }

        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode temp = q.poll();

            if(temp.data > data){
                if(temp.left == null){
                    temp.left = newNode;
                }
                else{
                    q.add(temp.left);
                }
            }
            else if(temp.data < data){
                if(temp.right == null){
                    temp.right = newNode;
                }
                else{
                    q.add(temp.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        ExampleBST bst = new ExampleBST();
        int[] nums = {1, 3, 4, 2};

        // Insert elements in to BST
        for(int num:nums){
            bst.insertwithq(num);
        }

        bst.inorder(bst.root);
    }
}
