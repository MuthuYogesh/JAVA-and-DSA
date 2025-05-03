public class UGmat {
    int vertices;
    int[][] graph;

    UGmat(int mv){
        this.vertices = mv;
        graph = new int[mv + 1];
    }

    public void insert(int src, int dest){
        graph[src][dest] = 1;
        graph[dest][src] = 1;
    }

    public void update(int Osrc, int Odest, int Nsrc, int Ndest){
        delete(Osrc, Odest);
        insert(Nsrc, Ndest);
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
    public static void main(String[] args) {
        UGmat gp = new UGmat(5);

    }
}
