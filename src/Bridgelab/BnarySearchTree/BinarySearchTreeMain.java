package Bridgelab.BnarySearchTree;

public class BinarySearchTreeMain {
    Node root;
    public void PrintOrder() {
        Inorder(root);
    }

    public Node insertElements(Node root, int Data) {

        if (root == null) {
            Node newnode = new Node(Data);
            root = newnode;
            return root;
        }
        Node newnode = new Node(Data);
        if (newnode.compareTo(root) > 0) {
            root.RightNode = insertElements(root.RightNode, Data);
        } else if (newnode.compareTo(root) < 0) {
            root.LeftNode = insertElements(root.LeftNode, Data);
        }
        this.root=root;
        return root;
    }
    public void Inorder(Node node) {
        if (node == null) {
            return;
        }
        Inorder(node.LeftNode);
        System.out.println(node.Data);
        Inorder(node.RightNode);
    }
    public static void main(String[] args) {

        binarySearchTreeMain newlist = new binarySearchTreeMain();
        Node root = newlist.insertElements(null, 56);
        Node secondnode = newlist.insertElements(root, 30);
        Node thirdnode = newlist.insertElements(secondnode, 70);

        newlist.PrintOrder();
    }
}
