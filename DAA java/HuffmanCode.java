import java.util.*;
// import java.util.PriorityQueue;.8;

class HuffmanCode{
    public static void main(String[] args){

        int n = 6;
        char[] arrCh = { 'a', 'b', 'c', 'd', 'e', 'f' };
        int[] arrFr = { 5, 9, 12, 13, 16, 45 };
        
        PriorityQueue<Node> Q = new PriorityQueue<Node>(n, new MyComparator());

        for(int i=0; i<n; i++){
            Node r = new Node();
            r.data = arrFr[i];
            r.c = arrCh[i];

            Q.add(r);
        }

        while (Q.size()>1) {
            Node x = Q.peek();
            Q.poll();

            Node y = Q.peek();
            Q.poll();

            Node f = new Node();
            f.data = x.data+y.data;
            f.c = '-';

            f.left = x;
            f.right = y;

            Q.add(f);
        }

        printFunction(Q.peek(), "");
    } 

    public static void printFunction(Node root, String s){

        if(root.left == null && root.right == null && Character.isLetter(root.c)){
            System.out.println(root.c+"  "+s);
            return;
        }

        printFunction(root.left, s+"0");
        printFunction(root.right, s+"1");
    }

}




class MyComparator implements Comparator<Node>{
    public int compare(Node x, Node y){
        return x.data - y.data;
    }
}

class Node{
    int data;
    char c;

    Node left;
    Node right;
}