/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dijkstra;

/**
 *
 * @author nadov
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vertex v1 = new Vertex("0");
        Vertex v2 = new Vertex("1");
        Vertex v3 = new Vertex("2");
        Vertex v4 = new Vertex("3");
        Vertex v5 = new Vertex("4");
        Vertex v6 = new Vertex("5");

        v1.addNeighbour(new Edge(2, v1, v2));
        v1.addNeighbour(new Edge(4, v1, v6));

        v2.addNeighbour(new Edge(2, v2, v1));
        v2.addNeighbour(new Edge(9, v2, v4));

        v3.addNeighbour(new Edge(5, v3, v4));

        v4.addNeighbour(new Edge(9, v4, v2));
        v4.addNeighbour(new Edge(5, v4, v3));
        v4.addNeighbour(new Edge(1, v4, v5));

        v5.addNeighbour(new Edge(1, v5, v6));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.computePath(v1);

        System.out.println(dijkstra.getShortestPathTo(v6));

    }

}
