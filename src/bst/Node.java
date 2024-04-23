package bst;

public class Node {
    private int value;
    private Node rightChild;
    private Node leftChild;

    public void printNode() {
        System.out.println("selected node: " + this.getValue());
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public int getValue() {
        return value;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", rightChild=" + rightChild +
                ", leftChild=" + leftChild +
                '}';
    }
}
