# Maximum Path Sum in Binary Tree

This Java program finds the maximum sum of any non-empty path in a binary tree.

## Description

A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.

The path sum of a path is the sum of the node's values in the path.

Given the root of a binary tree, return the maximum path sum of any non-empty path.
## Algorithm

The algorithm uses Depth-First Search (DFS) to traverse the binary tree. At each node, it computes the maximum path sum that includes the current node and then compares it with the global maximum.
The maximum path sum for a node is the sum of the node value, the maximum path sum of its left subtree (if positive), and the maximum path sum of its right subtree (if positive).

        1
       / \
      2   3
     / \ / \
    4  5 6  7

 The maximum path sum is 18, corresponding to the path `5 -> 2 -> 1 -> 3 -> 7`.







 
 
