package tree.ex2;

import java.util.ArrayList;
import java.util.LinkedList;

class Tree {
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    Node root;

    public void makeTree(int[] a) {
        root = makeTreeR(a, 0, a.length - 1);
    }

    // array to binaryTree
    public Node makeTreeR(int[] a, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        Node node = new Node(a[mid]);

        node.left = makeTreeR(a, start, mid - 1);
        node.right = makeTreeR(a, mid + 1, end);

        return node;
    }

    public void searchBTree(Node n, int find) {
        if(find < n.data) {
            System.out.println("smaller than " + n.data);
            searchBTree(n.left, find);
        }else if(find > n.data){
            System.out.println("bigger than " + n.data);
            searchBTree(n.right, find);
        }else {
            System.out.println("found!");
        }
    }

    // 레벨별 리스트 변형
    ArrayList<LinkedList<Node>> BSTtoList() {
        ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
        BSTtoList(root, lists, 0);
        return lists;
    }

    void BSTtoList(Node root, ArrayList<LinkedList<Node>> lists, int level) {
        if(root == null) return;
        LinkedList<Node> list = null;
        if(lists.size() == level) {
            list = new LinkedList<>();
            lists.add(list);
        }else {
            list = lists.get(level);
        }

        list.add(root);
        BSTtoList(root.left, lists, level + 1);
        BSTtoList(root.right, lists, level + 1);
    }

    ArrayList<LinkedList<Node>> BSTtoList2() {
        ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
        LinkedList<Node> current = new LinkedList<>();

        if(root != null) {
            current.add(root);
        }

        while(current.size() > 0) {
            result.add(current);
            LinkedList<Node> parents = current;
            current = new LinkedList<>();
            for(Node parent : parents) {
                if(parent.left != null) current.add(parent.left);
                if(parent.right != null) current.add(parent.right);
            }
        }
        return result;
    }

    void print(ArrayList<LinkedList<Node>> arr) {
        for(LinkedList<Node> list : arr) {
            for(Node node : list) {
                System.out.print(node.data + " ");
            }
            System.out.println();
        }
    }

    // 트리가 balanced 한지 확인
    boolean isBalanced(Node root) {
        if(root == null) return true;
        int heightDiff = getHeight(root.left) - getHeight(root.right);

        if(Math.abs(heightDiff) > 1) {
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    int getHeight(Node root) {
        if(root == null) {
            return -1;
        }

        int result = Math.max(getHeight(root.left), getHeight(root.right)) + 1;
        System.out.println("result : " + result);
        return result;
    }
}
public class ArrayToTree {

    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0; i<a.length; i++) {
            a[i] = i;
        }

        Tree t = new Tree();
        t.makeTree(a);

        t.searchBTree(t.root, 2);

        t.print(t.BSTtoList());

        System.out.println("================================");
        t.isBalanced(t.root);
    }
}
