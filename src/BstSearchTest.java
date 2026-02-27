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

	@Test
	void testValueFound() {
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
		root.left = new BinaryTreeNode<>(5);
		root.right = new BinaryTreeNode<>(15);

		assertTrue(BstSearch.contains(root, 5));
		assertTrue(BstSearch.contains(root, 10));
		assertTrue(BstSearch.contains(root, 15));
	}

	@Test
    void testValueNotFound() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(10);
        root.left = new BinaryTreeNode<>(5);
        root.right = new BinaryTreeNode<>(15);

        assertFalse(BstSearch.contains(root, 3));
        assertFalse(BstSearch.contains(root, 12));
        assertFalse(BstSearch.contains(root, 20));
    }

}
