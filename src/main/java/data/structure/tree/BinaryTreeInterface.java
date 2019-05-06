package src.main.java.data.structure.tree;

/**
 * @author guangjie.Liao
 * @Title: BinaryTreeInterface
 * @ProjectName data-structure
 * @Description: TODO
 * @date 2019/5/616:05
 */
public interface BinaryTreeInterface {
    

    void createNode(Integer key, Object object);

    Node minNode();

    Node maxNode();

    Node centerNode();

    Node findNode(Integer key);

    Node deleteNode(Integer key);
}
