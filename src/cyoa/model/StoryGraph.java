package cyoa.model;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class StoryGraph
{
//	assertEquals("[a1, b1, b2, b3, c1, c2, c3, c4, c5, c6, c7, d1, d2, d3, d4, d5, d6, d7, d8, d9, "
//			+ "d10, d11, d12, d13, d14, d15, e1, e2, e3, e4, e5, e6, e7, e8, e9, "
//			+ "e10, e11, e12, e13, f1, f2, f3, f4, f5, f6]", depthFirstTraversal(createGraph(), "a1").toString());
	
	
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
		
		
		myGraph.addEdge("b1", "c1");
		myGraph.addEdge("b1", "c2");
		
		myGraph.addEdge("b2", "c3");
		myGraph.addEdge("b2", "c4");
		myGraph.addEdge("b2", "c5");
		
		myGraph.addEdge("b3", "c6");
		myGraph.addEdge("b3", "c7");
		
		
		myGraph.addEdge("c1", "d1");
		myGraph.addEdge("c1", "d2");
		myGraph.addEdge("c1", "d8");
		
		myGraph.addEdge("c2", "d3");
		myGraph.addEdge("c2", "d4");
		myGraph.addEdge("c2", "d5");
		
		myGraph.addEdge("c3", "d5");
		myGraph.addEdge("c3", "d6");
		myGraph.addEdge("c3", "d7");
		
		myGraph.addEdge("c4", "d8");
		myGraph.addEdge("c4", "d9");
		
		myGraph.addEdge("c5", "d10");
		myGraph.addEdge("c5", "d11");
		myGraph.addEdge("c5", "d12");
		
		myGraph.addEdge("c6", "d12");
		myGraph.addEdge("c6", "d13");
		myGraph.addEdge("c6", "d14");
		
		myGraph.addEdge("c7", "d3");
		myGraph.addEdge("c7", "d13");
		myGraph.addEdge("c7", "d15");
		
		
		myGraph.addEdge("d1", "e1");
		myGraph.addEdge("d1", "e13");
		
		myGraph.addEdge("d2", "e1");
		myGraph.addEdge("d2", "e2");
		
		myGraph.addEdge("d3", "e2");
		myGraph.addEdge("d3", "e3");
		
		myGraph.addEdge("d4", "e1");
		myGraph.addEdge("d4", "e3");
		
		myGraph.addEdge("d5", "e3");
		myGraph.addEdge("d5", "e5");
		myGraph.addEdge("d5", "e10");
		
		myGraph.addEdge("d6", "e2");
		myGraph.addEdge("d6", "e6");
		
		myGraph.addEdge("d7", "e4");
		myGraph.addEdge("d7", "e8");
		
		myGraph.addEdge("d8", "e5");
		myGraph.addEdge("d8", "e9");
		
		myGraph.addEdge("d9", "e6");
		myGraph.addEdge("d9", "e7");
		
		myGraph.addEdge("d10", "e3");
		myGraph.addEdge("d10", "e8");
		
		myGraph.addEdge("d11", "e1");
		myGraph.addEdge("d11", "e9");
		
		myGraph.addEdge("d12", "e7");
		myGraph.addEdge("d12", "e10");
		myGraph.addEdge("d12", "e12");
		
		myGraph.addEdge("d13", "e11");
		myGraph.addEdge("d13", "e12");
		myGraph.addEdge("d13", "e13");
		
		myGraph.addEdge("d14", "e1");
		myGraph.addEdge("d14", "e10");
		myGraph.addEdge("d14", "e13");
		
		myGraph.addEdge("d15", "e7");
		myGraph.addEdge("d15", "e11");
		myGraph.addEdge("d15", "e13");
		
		
		myGraph.addEdge("e1", "f1");
		myGraph.addEdge("e2", "f1");
		myGraph.addEdge("e3", "f2");
		myGraph.addEdge("e4", "f2");
		myGraph.addEdge("e5", "f2");
		myGraph.addEdge("e6", "f3");
		myGraph.addEdge("r7", "f3");
		myGraph.addEdge("e8", "f4");
		myGraph.addEdge("e9", "f5");
		myGraph.addEdge("e10", "f5");
		myGraph.addEdge("e11", "f5");
		myGraph.addEdge("e12", "f6");
		myGraph.addEdge("e13", "f7");
		
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
		
		public List<Vertex> getAdjacentVertices(String label)
		{
			return adjacentVertices.get(new Vertex(label));
		}
		
		public Set<String> depthFirstTraversal(Graph graph, String root)
		{
			Set<String> visited = new LinkedHashSet<String>();
			Stack<String> stack = new Stack<String>();
			stack.push(root);
			while(!stack.isEmpty())
			{
				String vertex = stack.pop();
				if (!visited.contains(vertex))
				{
					visited.add(vertex);
					for (Vertex v : graph.getAdjacentVertices(vertex))
					{
						stack.push(v.label);
					}
				}
			}
			return visited;
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
