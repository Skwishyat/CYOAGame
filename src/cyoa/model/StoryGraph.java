package cyoa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StoryGraph
{
	
	public Graph createGraph()
	{
		Graph myGraph = new Graph();
		
		myGraph.addVertex("a1");
		myGraph.addVertex("b1");
		myGraph.addVertex("b2");
		myGraph.addVertex("b3");
		myGraph.addVertex("c1");
		myGraph.addVertex("c2");
		myGraph.addVertex("c3");
		myGraph.addVertex("c4");
		myGraph.addVertex("c5");
		myGraph.addVertex("c6");
		myGraph.addVertex("c7");
		myGraph.addVertex("d1");
		myGraph.addVertex("d2");
		myGraph.addVertex("d3");
		myGraph.addVertex("d4");
		myGraph.addVertex("d5");
		myGraph.addVertex("d6");
		myGraph.addVertex("d7");
		myGraph.addVertex("d8");
		myGraph.addVertex("d9");
		myGraph.addVertex("d10");
		myGraph.addVertex("d11");
		myGraph.addVertex("d12");
		myGraph.addVertex("d13");
		myGraph.addVertex("d14");
		myGraph.addVertex("d15");
		myGraph.addVertex("e1");
		myGraph.addVertex("e2");
		myGraph.addVertex("e3");
		myGraph.addVertex("e4");
		myGraph.addVertex("e5");
		myGraph.addVertex("e6");
		myGraph.addVertex("e7");
		myGraph.addVertex("e8");
		myGraph.addVertex("e9");
		myGraph.addVertex("e10");
		myGraph.addVertex("e11");
		myGraph.addVertex("e12");
		myGraph.addVertex("e13");
		myGraph.addVertex("f1");
		myGraph.addVertex("f2");
		myGraph.addVertex("f3");
		myGraph.addVertex("f4");
		myGraph.addVertex("f5");
		myGraph.addVertex("f6");
		
		myGraph.addEdge("a1", "b1");
		myGraph.addEdge("a1", "b2");
		myGraph.addEdge("a1", "b3");
		
		return myGraph;
	}
	
	class Graph
	{
		private Map<Vertex, List<Vertex>> adjacentVertices;
		
		public void addVertex(String label)
		{
			adjacentVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
		}
		
		public void removeVertex(String label)
		{
			Vertex point = new Vertex(label);
			adjacentVertices.values().stream().forEach(each -> each.remove(point));
			adjacentVertices.remove(new Vertex(label));
		}
		
		public void addDirectionalEdge(String label1, String label2)
		{
			Vertex point1 = new Vertex(label1);
			Vertex point2 = new Vertex(label2);
			adjacentVertices.get(point1).add(point2);
		}
		
		public void removeDirectionalEdge(String label1, String label2)
		{
			Vertex point1 = new Vertex(label1);
			Vertex point2 = new Vertex(label2);
			List<Vertex> edgeVertex1 = adjacentVertices.get(point1);
			if (edgeVertex1 != null)
			{
				edgeVertex1.remove(point2);
			}
		}
		
		public void addEdge(String label1, String label2)
		{
			Vertex point1 = new Vertex(label1);
			Vertex point2 = new Vertex(label2);
			adjacentVertices.get(point1).add(point2);
			adjacentVertices.get(point2).add(point1);
		}
		
		public void removeEdge(String label1, String label2)
		{
			Vertex point1 = new Vertex(label1);
			Vertex point2 = new Vertex(label2);
			List<Vertex> edgeVertex1 = adjacentVertices.get(point1);
			List<Vertex> edgeVertex2 = adjacentVertices.get(point2);
			if (edgeVertex1 != null)
			{
				edgeVertex1.remove(point2);
			}
			if (edgeVertex2 != null)
			{
				edgeVertex2.remove(point1);
			}
		}
		
		public List<Vertex> getAdjVertices(String label)
		{
			return adjacentVertices.get(new Vertex(label));
		}
	}
	
	class Vertex
	{
		String label;
		Vertex(String label)
		{
			this.label = label;
		}
	}
	
	
}
