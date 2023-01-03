package org.example;

public class HuffmanTree {


    public class Node {
       private Integer frequency;
       private Character val;
       private Node leftChild;
       private Node rightChild;

        public Node(Node leftChild, Node rightChild) {
            this.leftChild = leftChild;
            this.rightChild = rightChild;
            frequency = leftChild.getFrequency() + rightChild.getFrequency();
        }

        public Node(Integer frequency, Character val) {
            this.frequency = frequency;
            this.val = val;
        }

        public Integer getFrequency() {
            return frequency;
        }
    }
}

