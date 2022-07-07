package two;

public class main {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        Node root = buildTree(arr, 0, arr.length - 1);
    }

    public static Node buildTree(int[] arr, int lowIndex, int highIndex) {
        if (lowIndex > highIndex)
            return null;
        var middleIndex = lowIndex + (highIndex - lowIndex) / 2;
        var leftSubTreeRoot = buildTree(arr, lowIndex, middleIndex - 1);
        var rightSubTreeRoot = buildTree(arr, middleIndex + 1, highIndex);

        Node root = new Node(arr[middleIndex]);
        root.left = leftSubTreeRoot;
        root.right = rightSubTreeRoot;

        return root;
    }
}