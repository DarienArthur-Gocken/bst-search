import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {
	@Test
	void testNoTarget() {
		BinaryTreeNode<Integer> testNode = new BinaryTreeNode<>(1);

		assertThrows(NullPointerException.class, () -> {
			BstSearch.contains(testNode, null);
		});
	}

	@Test
	void testEmptyTree() {
		assertFalse(BstSearch.contains(null, 5));
	}
}
