package concurrent.executors;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static concurrent.executors.ForkJoinPoolTest.SimpleNode;

class ForkJoinPoolTestTest {
	
	@Test
	public void getSumOfChiledrenvalue() {
		final ForkJoinPoolTest forkJoinPoolTest = new ForkJoinPoolTest();
		
		final Integer resultSum = forkJoinPoolTest.getChildrenSum(getNode());
		
		Integer sum = 2950;
		
		Assertions.assertEquals(sum, resultSum);
	}
	
	
	private Node getNode() {
		return new SimpleNode(getNodes(), 10);
	}
	
	private List<Node> getNodes() {
		return List.of(
			new SimpleNode(getChildren(), 10),
			new SimpleNode(getChildren(), 10),
			new SimpleNode(getChildren(), 10),
			new SimpleNode(getChildren(), 10),
			new SimpleNode(getChildren(), 10),
			new SimpleNode(getChildren(), 10)
		);
	}
	
	private List<Node> getChildren() {
		return List.of(
			new SimpleNode(getMoreChildren(), 10),
			new SimpleNode(getMoreChildren(), 10),
			new SimpleNode(getMoreChildren(), 10),
			new SimpleNode(getMoreChildren(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10)
		);
	}
	
	private List<Node> getMoreChildren() {
		return List.of(
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10),
			new SimpleNode(Collections.emptyList(), 10)
		);
	}
}