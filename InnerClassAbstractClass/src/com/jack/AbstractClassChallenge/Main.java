package com.jack.AbstractClassChallenge;

public class Main {

    public static void main(String[] args) {
        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        //String stringData = "5 7 4 8 9 2 1 0 4 3 2 4";
        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String[] data = stringData.split(" ");
        for (String s : data) {
            // create new item with value set to the string s
            tree.addItem(new Node(s));
        }

        tree.traverse(tree.getRoot());
    }
}
