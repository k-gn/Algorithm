package tree;

import java.util.LinkedList;

class GraphEx {
    class NodeEx {
        int data;
        LinkedList<NodeEx> adjacent;
        boolean marked;

        NodeEx (int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    NodeEx[] nodes;

    GraphEx(int size) {
        nodes = new NodeEx[size];
        for(int i=0; i<size; i++) {
            nodes[i] = new NodeEx(i);
        }
    }

    void addEdge(int i1, int i2) {
        NodeEx n1 = nodes[i1];
        NodeEx n2 = nodes[i2];

        if(!n1.adjacent.contains(n2)) {
            n1.adjacent.add(n2);
        }

        if(!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void initMarks() {
        for (NodeEx n : nodes) {
            n.marked = false;
        }
    }

    boolean search(int i1, int i2) {
        return search(nodes[i1], nodes[i2]);
    }

    boolean search(NodeEx start, NodeEx end) {
        initMarks();
        LinkedList<NodeEx> q = new LinkedList<>();

        q.add(start);
        start.marked = true;
        while(!q.isEmpty()) {
            NodeEx root = q.removeFirst();
            if(root == end) {
                return true;
            }
            for(NodeEx n : root.adjacent) {
                if(!n.marked) {
                    n.marked = true;
                    q.add(n);
                }
            }
        }
        return false;
    }
}

// 연결 여부 파악하기
public class Distance {
    public static void main(String[] args) {
        GraphEx g = new GraphEx(9);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);

        System.out.println(g.search(1, 8));
    }
}
