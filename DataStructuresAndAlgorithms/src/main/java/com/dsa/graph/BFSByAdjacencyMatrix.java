package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSByAdjacencyMatrix {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacencyMatrix;

	public BFSByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
	}

	void bfs() {
		for (GraphNode node : nodeList) {
			if (!node.isVisited()) {
				bfsVisit(node);
			}
		}
	}

	void bfsVisit(GraphNode node) {
		Queue<GraphNode> queue = new LinkedList<GraphNode>();
		queue.add(node);
		while (!queue.isEmpty()) {
			GraphNode presentNode = queue.remove();
			System.out.print(presentNode.getName()+" ");
			presentNode.setVisited(true);

			ArrayList<GraphNode> neighbors = getNeighbors(presentNode);
			for (GraphNode neighbor : neighbors) { // for each neighbor of present node
				if (!neighbor.isVisited()) {
					queue.add(neighbor);
					neighbor.setVisited(true);
				}
			}
		}

	}

	public ArrayList<GraphNode> getNeighbors(GraphNode node) {
		ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();

		// gets row# to search in node index
		int nodeIndex = node.getIndex();
		for (int i = 0; i < adjacencyMatrix.length; i++) {
			if (adjacencyMatrix[nodeIndex][i] == 0) {
				neighbors.add(nodeList.get(i));
			}
		}
		return neighbors;
	}

	// add an undirected edge between two nodes
	public void addUndirectedEdge(int i, int j) {
		// decrement i, j for array indexes
		i--;
		j--;
		adjacencyMatrix[i][j] = 1;
		adjacencyMatrix[j][i] = 1;

	}
}
