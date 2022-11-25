package test;

import com.example.alostdogdiscretas.model.Graph;
import com.example.alostdogdiscretas.model.Vertex;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
public class GraphTest {
    private Graph graph;
    public void setup1(){
        graph=new Graph();
        graph.newVertex("a");
        graph.newVertex("b");
        graph.newVertex("c");
        graph.newVertex("d");
        graph.newVertex("e");
        graph.addEdge("a", "b", 10);
        graph.addEdge("b", "a", 15);
        graph.addEdge("a", "d", 6);
        graph.addEdge("d", "a", 2);
        graph.addEdge("d", "b", 3);
        graph.addEdge("b", "d", 8);
        graph.addEdge("c", "b", 9);
        graph.addEdge("b", "c", 11);
        graph.addEdge("e", "b", 3);
        graph.addEdge("b", "e", 5);
        graph.addEdge("c", "e", 7);
        graph.addEdge("e", "c", 13);
    }
    public void setup2(){
        graph=new Graph();
        graph.newVertex("a");
        graph.newVertex("b");
        graph.newVertex("c");
        graph.newVertex("d");
        graph.newVertex("e");
        graph.addEdge("a", "b", 10);
        graph.addEdge("c", "a", 15);
        graph.addEdge("a", "d", 6);
        graph.addEdge("d", "b", 2);
    }
    @Test
    public void dijkstraTest(){
        setup1();
        graph.dijkstra("a","c");
        assertEquals(graph.message,"a --> d --> b --> c");
        setup1();
        graph.dijkstra("a","e");
        assertEquals(graph.message,"a --> d --> b --> e");
    }
    @Test
    public void bfsTest(){
        setup1();
        graph.BFS("a");
        boolean flag=true;
        for(int i=0;i < 4 && flag;i++){
            for (int j=0;j<graph.getVertexes().size();j++){
                if(graph.getVertexes().get(j).getColor()==2){
                    flag=false;
                }
            }
        }
        assertTrue(flag);
    }
    @Test
    public void bfsTest2(){
        setup2();
        graph.BFS("a");
        boolean flag=true;
        for(int i=0;i < 4 && flag;i++){
            for (int j=0;j<graph.getVertexes().size();j++){
                if(graph.getVertexes().get(j).getColor()==2){
                    flag=false;
                }
            }
        }
        assertFalse(flag);
    }
}
