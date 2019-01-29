import java.util.*;

/** 
 * Graph
 */
public class Graph { // 无向图

    private int v;  // 顶点的个数
    private LinkedList<Integer> adj[]; // 邻接表

    public Graph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int s, int t) {
        adj[s].add(t);
        adj[t].add(s);
    }


    public void bfs(int s, int t) {
        if (s == t) {
            return;
        }
        boolean[] visited = new boolean[v]; //构建一个和图一样大小的数组，来记录访问过的节点
        visited[s] = true;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(s); //将当前访问过的相邻节点放入队列中 

        int[] prev = new int[v];   // 记录路径的数组

        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }

        while (queue.size() != 0) {
            int w = queue.poll(); // 取出一个还没有被访问过的节点

            // 对该节点的相邻节点进行遍历
            for (int i = 0; i < adj[w].size(); i++) {
                int q = adj[w].get(i);
                if (!visited[q]) {  // 如果该节点还没有被访问
                    prev[q] = w;   // 记录访问该节点是从哪个节点过来的
                    if (q == t) {  // 找到终点，开始遍历路径
                        print(prev, s, t);
                        return;
                    }
                    visited[q] = true;  // 将节点标记为已访问，入队列 
                    queue.add(q);
                }
            }
        }
    }

    private boolean found = false; // 深度遍历时候找到目标

    public void dfs(int s, int t) {
        found = false;
        boolean[] visited = new boolean[v];

        int[] prev = new int[v];
        for (int i = 0; i < v; i++) {
            prev[i] = -1;
        }
        recurDfs(s, t, visited, prev);
        print(prev, s, t);
    }

    private void recurDfs(int w, int t, boolean[] visited, int[] prev) {
        if (found == true) {
            return;
        }
        visited[w] = true;

        if (w == t) {
            found = true;
            return;
        }

        for (int i = 0; i < adj[w].size(); i++) {
            int q = adj[w].get(i);
            if (!visited[q]) {
                prev[q] = w;
                recurDfs(q, t, visited, prev);
            }
        }

    }



    private void print(int[] prev, int s, int t) {
        if (prev[t] != -1 && t != s) {
            print(prev, s, prev[t]);
        }
        System.out.print(t+ "->");
    }

}