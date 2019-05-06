package src.main.java.data.structure.tree;

/**
 * @author guangjie.Liao
 * @Title: Node
 * @ProjectName spring-cloud-eureka
 * @Description: TODO
 * @date 2019/5/615:29
 */
public class Node {


    private Node rightNode;
    private Node leftNode;
    private Integer key;
    private Object data;

    public Node(){

    }
    public Node(Node rNode,Node lNode,Integer k,Object d){
        this.rightNode = rNode;
        this.leftNode = lNode;
        this.key = k;
        this.data = d;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Node{" +
                "rightNode=" + rightNode +
                ", leftNode=" + leftNode +
                ", key=" + key +
                ", data=" + data +
                '}';
    }
}
