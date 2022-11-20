import java.util.*;

public class knapSnack {
    public static void main(String[] args){
        
        int capacity = 50;

        Node[] arr = { new Node(60, 10),
            new Node(100, 20),
            new Node(120, 30) };

        Arrays.sort(arr, new Mycomparator());

        int res = 0;
        for(Node ele : arr){

            int curVal = ele.value;
            int curWt = ele.weight;

            if(capacity-curWt>0){
                capacity -= curWt;
                res += curVal;
            }
            else{
                double temp = (double)capacity/(double)curWt;
                res += curVal*temp;
                break;
            }
        }

        System.out.println(res);
    }
}


class Mycomparator implements Comparator<Node>{
    public int compare(Node x, Node y){
        if(x.frac<y.frac) return 1;
        else return -1;
    }
}

class Node{
    int value;
    int weight;
    double frac;

    Node(int v, int w){
        this.value = v;
        this.weight = w;
        this.frac = value/weight;
    }
}
