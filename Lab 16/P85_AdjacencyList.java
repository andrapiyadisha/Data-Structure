import java.util.LinkedList;
import java.util.*;

class Node{
    public Map<Integer,List<Integer>>adList;

    public Node(){
        adList = new HashMap<>();
    }

    public void addEdge(int u,int v){
        adList.putIfAbsent(u,new ArrayList<>());
        adList.putIfAbsent(v,new ArrayList<>());
        adList.get(u).add(v);
        adList.get(v).add(u);
    }

    public void dfs(int start){
        Set<Integer> visited = new HashSet<>();
        dfsHelper(start,visited);
    }

    private void dfsHelper(int vertex,Set<Integer> visited){
        visited.add(vertex);
        System.out.println(vertex+" ");
        for(int neighbor:adList.getOrDefault(vertex,new ArrayList<>())){
            if(!visited.contains(neighbor)){
                dfsHelper(neighbor,visited);
            }
        }
    }

    public void bfs(int start){
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.println(vertex+" ");
            for(int neighbor:adList.getOrDefault(vertex,new ArrayList<>())){
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
public class Graph {
   
        public static void main(String[] args) {
            Node g = new Node();
            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(2, 4);
            g.addEdge(3, 4);

            System.out.println("DFS traversal starting from vertex 0:");
            g.dfs(0);

            System.out.println("\nBFS traversal starting from vertex 0:");
            g.bfs(0);
        }
    
    
}
