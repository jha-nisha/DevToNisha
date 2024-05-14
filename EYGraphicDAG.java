package Test.EY.EYTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EYGraphicDAG {
	    private Map<String, List<String>> graph;

	    public EYGraphicDAG() {
	        graph = new HashMap<>();
	    }

	    public void addDependency(String node, List<String> dependencies) {
	        graph.put(node, dependencies);
	    }

	    public boolean isDAG() {
	        Set<String> visited = new HashSet<>();
	        Set<String> recursionStack = new HashSet<>();

	        for (String node : graph.keySet()) {
	            if (!visited.contains(node)) {
	                if (isCyclic(node, visited, recursionStack)) {
	                    return false;
	                }
	            }
	        }

	        return true;
	    }

	    private boolean isCyclic(String node, Set<String> visited, Set<String> recursionStack) {
	        visited.add(node);
	        recursionStack.add(node);

	        List<String> dependencies = graph.get(node);
	        if (dependencies != null) {
	            for (String dependency : dependencies) {
	                if (!visited.contains(dependency)) {
	                    if (isCyclic(dependency, visited, recursionStack)) {
	                        return true;
	                    }
	                } else if (recursionStack.contains(dependency)) {
	                    return true;
	                }
	            }
	        }

	        recursionStack.remove(node);
	        return false;
	    }

	    public static void main(String[] args) {
	    	EYGraphicDAG dependencyGraph = new EYGraphicDAG();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter node name (or 'exit' to finish):");
	            String node = scanner.nextLine();

	            if (node.equals("exit")) {
	                break;
	            }

	            System.out.println("Enter dependencies separated by commas:");
	            String[] dependencies = scanner.nextLine().split(",");
	            dependencyGraph.addDependency(node, Arrays.asList(dependencies));
	        }

	        scanner.close();

	        System.out.println("Is DAG: " + dependencyGraph.isDAG());
	    }
	}



