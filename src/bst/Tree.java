package bst;

public class Tree {
    private Node rootNode; // корневая нода

    public Tree() {
        this.rootNode = null;
    }

    public Node findNodeByValue(int value) {
        Node currentNode = this.rootNode;
        int countIteration = 0;
        while (currentNode.getValue() != value) {
            countIteration++;
            System.out.println(countIteration);
            if (currentNode.getValue() < value) {
                currentNode = currentNode.getRightChild();
            } else if (currentNode.getValue() > value) {
                currentNode = currentNode.getLeftChild();
            }

            if (currentNode == null) return null;
        }

        return currentNode;
    }

    public void insertNode(int value) {
        Node newNode = new Node();
        newNode.setValue(value);
        if (this.rootNode == null) this.rootNode = newNode;
        else {
            Node parrentNode; // родительская нода, чтобы можно было откатиться
            Node currentNode = this.rootNode; // нода по которой идут проверки
            while (true) {
                parrentNode = currentNode;
                if (currentNode.getValue() == value) return; // такой элемент уже есть -> выходим из цикла
                else if (currentNode.getValue() < value) { // находимся в правом поддереве
                    currentNode = currentNode.getRightChild();
                    if (currentNode == null) {
                        parrentNode.setRightChild(newNode); return; // создаем ребенка и выходим из цикла
                    }
                } else if (currentNode.getValue() > value) { // находися в левом поддереве
                    currentNode = currentNode.getLeftChild();
                    if (currentNode == null) {
                        parrentNode.setLeftChild(newNode); return; // создаем ребенка и выходим из цикла
                    }
                }
            }
        }
    }

    public boolean deleteNode(int value) {
        Node currentNode = this.rootNode;
        Node parentNode = this.rootNode;
        boolean isRightChild = false;

        // ищем элемент
        while (currentNode.getValue() != value) {
            parentNode = currentNode;
            if (currentNode.getValue() < value) {
                isRightChild = true;
                currentNode = currentNode.getRightChild();
            } else if (currentNode.getValue() > value) {
                isRightChild = false;
                currentNode = currentNode.getLeftChild();
            }

            if (currentNode == null) return false; // элемент не найден => не удален
        }

        if (currentNode.getLeftChild() == null && currentNode.getRightChild() == null) { // оба элемента нал
            if (currentNode == this.rootNode) {
                this.rootNode = null;
            } else if (isRightChild) {
                parentNode.setRightChild(null);
            } else {
                parentNode.setLeftChild(null);
            }
        } else if (currentNode.getLeftChild() == null) {
            if (currentNode == this.rootNode) this.rootNode = currentNode.getRightChild();
            else if (isRightChild) parentNode.setRightChild(currentNode.getRightChild());
            else parentNode.setLeftChild(currentNode.getRightChild());
        } else if (currentNode.getRightChild() == null) {
            if (currentNode == this.rootNode) this.rootNode = currentNode.getLeftChild();
            else if (isRightChild) parentNode.setRightChild(currentNode.getLeftChild());
            else parentNode.setLeftChild(currentNode.getLeftChild());
        } else {
            Node heir = this.receiveHeir(currentNode);
            if (currentNode == this.rootNode) this.rootNode = heir;
            else if (isRightChild) parentNode.setRightChild(heir);
            else parentNode.setLeftChild(heir);
        }

        return true;
    }

    private Node receiveHeir(Node node) {
        Node currentNode = node.getRightChild();
        Node parentNode = node;
        Node heir = node;
        while (currentNode.getLeftChild() != null) {
            parentNode = currentNode;
            heir = currentNode;
            currentNode = currentNode.getLeftChild();
        }

        // меняем привязки
        parentNode.setLeftChild(heir.getRightChild());
        heir.setRightChild(node.getRightChild());

        return heir;
    }
}
