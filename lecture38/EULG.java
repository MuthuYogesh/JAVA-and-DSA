import java.util.*;

public class EULG {
    int vertices;
    ArrayList<ArrayList<Integer>> graph;

    public EULG(int v){
        this.vertices = v;
        graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest){
        graph.get(src).add(dest);
    }

    public void BFS(int start){
        boolean[] visited = new boolean[vertices];
        Queue <Integer> q = new LinkedList<>();
        if(start % 2 == 0){System.out.println(start);}
        visited[start] = true;
        q.offer(start);
        while(!q.isEmpty()){
            int node = q.poll();
            if(node % 2 == 0){
                System.out.println(node);
            }
            for(int sub: graph.get(node)){
                if(!visited[sub]){
                    visited[sub] = true;
                    q.offer(sub);
                }
            }
        }
    }

    public void outdegree(){
        for(int i=0; i<vertices; i++){
            System.out.println(graph.get(i).size());
        }
    }
    
    public void outdegree(){
        for(int i=0; i<vertices; i++){
            System.out.println(graph.get(i).size());
        }
    }

    public static void main(String[] args) {
        EULG gph = new EULG(8);
        gph.addEdge(0,1);
        gph.addEdge(1, 2);
        gph.addEdge(2, 3);
        gph.addEdge(2, 4);
        gph.addEdge(2, 5);
        gph.addEdge(2, 6);
        gph.addEdge(6, 7);
        // gph.BFS(0);
        gph.outdegree();
    }
}
