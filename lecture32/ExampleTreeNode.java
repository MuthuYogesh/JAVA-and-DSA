class TreeNode{
    int data;
    TreeNode r;
    TreeNode l;
    public TreeNode(int data){
        this.data = data;
        this.r = null;
        this.l = null;
    }
}

public class ExampleTreeNode {
    static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        preorder(root.l);
        preorder(root.r);
    }
    static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.l);
        System.out.println(root.data);
        inorder(root.r);
    }
    static void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.l);
        postorder(root.r);
        System.out.println(root.data);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.l = new TreeNode(2);
        root.r = new TreeNode(3);
        root.l.l = new TreeNode(4);
        root.l.r = new TreeNode(5);
        // Preorder
        System.out.println(preorder(root));
        // Preorder
        System.out.println(inorder(root));
        // Preorder
        System.out.println(postorder(root));
    }
}
