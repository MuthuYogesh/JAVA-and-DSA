import java.util.*;
class Pair{
    int dest;
    int weight;
    Pair(int val, int w){
        this.dest = val;
        this.weight = w;
    }
}
public class DWG{
    int vertices;
    ArrayList<Pair>[] gw;
    DWG(int v){
        this.vertices = v;
        gw = new ArrayList[v];
        for(int i=0; i<v; i++){
            gw[i] = new ArrayList<>();
        }
    }

    public void addEdge(int src, int dest, int w){
        gw[src].add(new Pair(dest, w));
    }

    public void display(){
        for(int i =0 ; i< vertices; i++){
            System.out.print(i + ": [");
            for(Pair obj: gw[i]){
                System.out.print("dest: " + obj.dest + "wt: " + obj.weight);
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args){
        DWG graph = new DWG(2);
        graph.addEdge(0, 1, 1);
        graph.display();
    }
}