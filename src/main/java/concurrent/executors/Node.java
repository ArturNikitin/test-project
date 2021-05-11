package concurrent.executors;

import java.util.List;

public interface Node {
	
	List<Node> getChildren();
	
	Integer getValue();
}
