import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

public class UGlist {
    int vertices;
    ArrayList<ArrayList<Integer>> graph;

    UGlist(int v){
        this.vertices = v;
        graph = new ArrayList<>();
        for(int i=0; i<v; i++){
            graph.add(new ArrayList<>());
        }
    }

    // Create
    public void insert(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }

    // Read
    public void Read(){
        for(int i=0; i<vertices; i++){
            System.out.print(i + "-> [ ");
            for(int next: graph.get(i)){
                System.out.print(next + " ");
            }
            System.out.println("]");
        }
    }

    // DFS
    public void DFS(int start){
        boolean[] visited = new boolean[vertices + 1];
        System.out.print("DFS: ");
        DFShelper(start, visited);
        System.out.println();
    }

    public void DFShelper(int start, boolean[] visited){
        System.out.print(start + " ");
        visited[start] = true;
        for(int next: graph.get(start)){
            if(!visited[next]){
                DFShelper(next, visited);
            }
        }
    }

    // BFS
    public void BFS(int start){
        boolean[] visited = new boolean[vertices + 1];
        Queue <Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;
        System.out.print("BFS: ");

        while(!q.isEmpty()){
            int temp = q.poll();
            System.out.print(temp + " ");
            for(int next: graph.get(temp)){
                if(!visited[next]){
                    q.add(next);
                    visited[next] = true;
                }
            }
        }
        System.out.println();
    }

    // Delete
    public void delete(int src, int dest){
        int idx1 = graph.get(src).indexOf(dest);
        int idx2 = graph.get(dest).indexOf(src);
        if(idx1 != -1){
            graph.get(src).remove(idx1);
        }
        if(idx2 != -1){
            graph.get(dest).remove(idx2);
        }else{
            System.out.println("Data Not Found!");
        }
    }

    public void update(int Osrc, int Odest, int Nsrc, int Ndest){
        delete(Osrc, Odest);
        insert(Nsrc, Ndest);
    }

    public static void main(String[] args) {
        UGlist gp = new UGlist(5);
        gp.insert(0, 1);
        gp.insert(0, 2);
        gp.insert(0, 3);
        gp.insert(3, 2);
        gp.insert(3, 4);
        gp.Read();
        System.out.println();
        gp.delete(0, 1);
        gp.Read();
        System.out.println();
        gp.update(0, 2, 0, 4);
        gp.Read();
        System.out.println();
        gp.DFS(0);
        System.out.println();
        gp.BFS(0);
        System.out.println();
    }
}
