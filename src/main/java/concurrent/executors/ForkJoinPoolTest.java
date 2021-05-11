package concurrent.executors;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import lombok.RequiredArgsConstructor;

public class ForkJoinPoolTest {
	
	public Integer getChildrenSum(Node node) {
		ForkJoinPool forkJoinPool = ForkJoinPool.commonPool(); // Simple way to create a pool
		
		return forkJoinPool.invoke(new SimpleRecurciveTask(node));
	}
	
	@RequiredArgsConstructor
	private static class SimpleRecurciveTask extends RecursiveTask<Integer> {
		private static final Integer THRESHOLD = 5;
		
		private final Node node;
		
		@Override
		protected Integer compute() {
			Integer sum = node.getValue();
			List<SimpleRecurciveTask> subTasks = new LinkedList();
			
			for(Node child : node.getChildren()) {
				SimpleRecurciveTask task = new SimpleRecurciveTask(child);
				task.fork(); // запустим асинхронно
				subTasks.add(task);
			}
			
			for(SimpleRecurciveTask task : subTasks) {
				sum += task.join(); // дождёмся выполнения задачи и прибавим результат
			}
			
			return sum;
		}
	}
	
	public static class SimpleNode implements Node {
		
		private final List<Node> children;
		private final Integer value;
		
		public SimpleNode(List<Node> children, Integer value) {
			this.children = children;
			this.value = value;
		}
		
		@Override
		public List<Node> getChildren() {
			return children;
		}
		
		@Override
		public Integer getValue() {
			return value;
		}
	}
}
