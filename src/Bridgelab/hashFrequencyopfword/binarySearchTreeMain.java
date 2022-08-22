package Bridgelab.hashFrequencyopfword;

public class binarySearchTreeMain {
    Node Root;


    public void PrintOrder() {
        Inorder(Root);
    }

    public Node insertElements(Node Root,int Data) {

        if(Root== null)	{
            Node newnode = new Node(Data);
            Root = newnode;
            return Root;

        }Node newnode = new Node(Data);
        if (newnode.compareTo(Root)>0) {
            Root.RightNode=insertElements(Root.RightNode, Data);
        }else
        if(newnode.compareTo(Root)<0) {
            Root.LeftNode=insertElements(Root.LeftNode, Data);
        }
        this.Root=Root;
        return Root;

    }
    public static int Size(Node Root) {

        if (Root == null)
            return 0;

        return Size(Root.LeftNode) +  1  + Size(Root.RightNode);

    }
    public boolean SearchElements(Node Root, int Data) {
        if (Root == null)
            return false;
        if(Root.Data == Data)
            return true;
        else
            return SearchElements(Root.LeftNode, Data) || SearchElements(Root.RightNode, Data);
    }
    public void Search(int Data) {
        if(SearchElements(Root, Data))
            System.out.println("The Element you were searching for = " +Data);
        else
            System.out.println("Invalid input,Not in the Tree");
    }
    public void Inorder(Node node) {
        if (node==null) {
            return;
        }
        Inorder(node.LeftNode);
        System.out.println(node.Data);
        Inorder(node.RightNode);

    }

    public static void main(String[] args) {

        binarySearchTreeMain newlist = new binarySearchTreeMain();

        Node Root = newlist.insertElements(null, 56);
        Node secondnode = newlist.insertElements(Root, 30);
        Node thirdnode = newlist.insertElements(Root, 70);
        Node node4th = newlist.insertElements(Root, 22);
        Node node5th =newlist.insertElements(Root, 40);
        Node node6th=newlist.insertElements(Root, 11);
        Node node7t=newlist.insertElements(Root, 3);
        Node node8th=newlist.insertElements(Root, 16);
        Node node9th=newlist.insertElements(Root, 60);
        Node node10th=newlist.insertElements(Root, 95);
        Node node11th=newlist.insertElements(Root, 65);
        Node node12th=newlist.insertElements(Root, 63);
        Node node13th=newlist.insertElements(Root, 67);

        newlist.PrintOrder();
        newlist.Size(Root);
        System.out.println("Tree size is = " + Size(Root));
        newlist.Search(63);


    }

}
