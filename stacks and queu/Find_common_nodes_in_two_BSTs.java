
class Solution
{
    // Function to find the common nodes in both BSTs.
    public static ArrayList<Integer> findCommon(Node root1, Node root2)
    {
        ArrayList<Integer> commonNodes = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        
        // Perform in-order traversals of both BSTs and store the elements in sorted order.
        inOrderTraversal(root1, list1);
        inOrderTraversal(root2, list2);
        
        int i = 0;
        int j = 0;
        
        // Merge the two sorted lists to find common nodes.
        while (i < list1.size() && j < list2.size())
        {
            int num1 = list1.get(i);
            int num2 = list2.get(j);
            
            if (num1 == num2)
            {
                commonNodes.add(num1);
                i++;
                j++;
            }
            else if (num1 < num2)
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        
        return commonNodes;
    }
    
    // Helper function for in-order traversal.
    private static void inOrderTraversal(Node node, ArrayList<Integer> list)
    {
        if (node == null)
            return;
        
        inOrderTraversal(node.left, list);
        list.add(node.data);
        inOrderTraversal(node.right, list);
    }
}
