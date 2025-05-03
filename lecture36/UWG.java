public class UWG {
    int[][] graph;
    int vertices;

    public UWG(int mv){
        vertices = mv;
        graph = new int[mv + 1][mv + 1];
    }

    public void insert(int src, int dest){
        graph[src][dest] = 1;
        graph[dest][src] = 1;
    }

    public void delete(int src, int dest){
        graph[src][dest] = 0;
        graph[dest][src] = 0;
    }

    public void read(){
        for(int i=0; i<vertices; i++){
            for(int j=0; j<vertices; j++){
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int indegree(int n){
        int count = 0;
        for(int i=0; i<vertices; i++){

            if (graph[i][n] == 1) {
                count++;
            }
        }
            return count;
    }
        

    public int outdegree(int n){
        int count = 0;
        for(int i=0; i<vertices; i++){
            if (graph[n][i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        UWG a = new UWG(5);
        a.insert(1,2);
        System.out.println(a.indegree(1));
        System.out.println(a.outdegree(3));
    }
        
}

