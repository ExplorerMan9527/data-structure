package src.main.java.data.test;

import src.main.java.data.structure.tree.BinaryTree;

/**
 * @author guangjie.Liao
 * @Title: BinaryTreeTest
 * @ProjectName data-structure
 * @Description: TODO
 * @date 2019/5/616:13
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.createNode(4,4);
        tree.createNode(2,2);
        tree.createNode(1,1);
        tree.createNode(5,5);
        tree.createNode(3,3);

        tree.deleteNode(2);
    }
}
