package src.main.java.data.structure.tree;

/**
 * @author guangjie.Liao
 * @Title: BinaryTree
 * @ProjectName data-structure
 * @Description: TODO
 * @date 2019/5/615:51
 */
public class BinaryTree implements src.main.java.data.structure.tree.BinaryTreeInterface {

    private Node root;


    @Override
    public void createNode(Integer key, Object object) {
        if(key == null || object == null){
            return;
        }
        if (root == null){
            root = new Node();
            root.setData(object);
            root.setKey(key);
            return;
        }
        Node newNode = new Node();
        newNode.setData(object);
        newNode.setKey(key);

        Node current = root;
        Node parent;
        while(true){
            parent = current;
            if (key < current.getKey()){
                current = current.getLeftNode();
                if (current == null){
                    parent.setLeftNode(newNode);
                    return;
                }
            }else{
                current = current.getRightNode();
                if (current == null){
                    parent.setRightNode(newNode);
                    return;
                }
            }
        }

    }

    @Override
    public Node minNode() {
        Node current = root;
        while (current.getLeftNode() !=null){
            current = current.getLeftNode();
        }
        return current;
    }

    @Override
    public Node maxNode() {
        Node current = root;
        while (current.getRightNode() !=null){
            current = current.getRightNode();
        }
        return current;
    }

    @Override
    public Node centerNode() {
        return null;
    }

    @Override
    public Node findNode(Integer key) {
        Node current = root;
        while(!current.getKey().equals(key)){
            if (key < current.getKey()){
                current = current.getLeftNode();
            }else{
                current = current.getRightNode();
            }
        }
        return current;
    }

    @Override
    public Node deleteNode(Integer key) {
        Node current = root;
        Node parent = null;
        boolean isLeft = false;
        while(!current.getKey().equals(key)){
            parent = current;
            if (key < current.getKey()){
                current = current.getLeftNode();
                isLeft = true;
            }else{
                current = current.getRightNode();
                isLeft = false;
            }
        }
        Node left = current.getLeftNode();
        Node right = current.getRightNode();
        //没有节点
        if (left ==null && right == null){
            if (isLeft){
                parent.setLeftNode(null);
            }else{
                parent.setRightNode(null);
            }
        }
        //有左节点
        if (left != null && right ==null){
            if (isLeft){
                parent.setLeftNode(null);
            }else{
                parent.setRightNode(null);
            }
        }
        //有右节点
        if (left ==null && right != null){
            if (isLeft){
                parent.setLeftNode(right);
            }else{
                parent.setRightNode(right);
            }
        }
        //有两个子节点
        if (left !=null && right != null){
            if (isLeft){
                parent.setLeftNode(right);
            }else{
                parent.setRightNode(right);
            }
            right.setLeftNode(left);
        }
        return current;
    }


    public BinaryTree(){

    }
}
