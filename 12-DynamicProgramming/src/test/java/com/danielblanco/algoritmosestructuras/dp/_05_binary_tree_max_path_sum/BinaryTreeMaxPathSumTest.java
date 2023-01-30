package com.danielblanco.algoritmosestructuras.dp._05_binary_tree_max_path_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.danielblanco.algoritmosestructuras.dp._05_binary_tree_max_path_sum.BinaryTreeMaxPathSum.TreeNode;
import org.junit.jupiter.api.Test;

public class BinaryTreeMaxPathSumTest {

  @Test
  public void binaryTreeMaxPathSumTest() {
    BinaryTreeMaxPathSum sum = new BinaryTreeMaxPathSum();
    TreeNode root1 = sum.new TreeNode(2);
    root1.left = sum.new TreeNode(1);
    root1.left.left = sum.new TreeNode(-5);
    root1.right = sum.new TreeNode(3);
    root1.right.left = sum.new TreeNode(-1);
    assertEquals(6, sum.maxPathSum(root1));

    TreeNode root2 = sum.new TreeNode(-12);
    root2.left = sum.new TreeNode(5);
    root2.right = sum.new TreeNode(3);
    root2.right.left = sum.new TreeNode(1);
    root2.right.right = sum.new TreeNode(4);
    assertEquals(8, sum.maxPathSum(root2));
  }
}
