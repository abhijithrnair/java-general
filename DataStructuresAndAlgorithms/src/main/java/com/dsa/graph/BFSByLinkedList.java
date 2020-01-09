package com.dsa.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSByLinkedList {
	ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	public BFSByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	//BFS Algorithm
		void bfs() {
			//if a node is unvisited then run bfs on it
			for(GraphNode node: nodeList) {
				if(!node.isVisited())
					bfsVisit(node);
			}
		}//end of method
		
		//BFS internal method
		void bfsVisit(GraphNode node) {
			LinkedList<GraphNode>queue = new LinkedList<>();
			queue.add(node); //add source node to queue
			while(!queue.isEmpty()) {
				GraphNode presentNode = queue.remove(0);
				presentNode.setVisited(true);
				System.out.print(presentNode.getName()+" ");
				for(GraphNode neighbor: presentNode.getNeighbours()) { //for each neighbor of present node
					if(!neighbor.isVisited()) { //if neighbor is not visited then add it to queue
						queue.add(neighbor);
						neighbor.setVisited(true);
					}
				}//end of for loop
			}//end of while loop
		}//end of method
		
		
		
		
		// Add an undirected edge between two nodes
		public void addUndirectedEdge(int i, int j) {
			GraphNode first = nodeList.get(i-1);
			GraphNode second = nodeList.get(j-1);
			first.getNeighbours().add(second);//Neighbour of first is second. Store it.
			second.getNeighbours().add(first);//Neighbour of second is first. Store it.
		}//end of method
		
	}//end of class