import java.util.Scanner;

public class Arvore2 {
    
    private static class TREE {
        public int root;
        public TREE right, left;
    }

    public static TREE insert(TREE tree, int value){
    
        if (tree == null) {
            tree = new TREE();
            tree.root = value;
            tree.right = null;
            tree.left = null;
        } else if (value < tree.root) {
            tree.left = insert(tree.left, value);
        } else {
            tree.right = insert(tree.right, value);
        } 
        return tree;
    }

    public static String printTree(TREE tree) {
        String trees = " ( ";

        if(tree != null) {
            trees += tree.root;
            trees += printTree(tree.left);
            trees += printTree(tree.right);
        }
        return trees += " ) ";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de números para entrada: ");
        TREE tree = null;
        int number = sc.nextInt();

        for (int i = 0; i < number; i++ ) {
            tree = insert(tree, sc.nextInt());
        }

        System.out.println(printTree(tree));
    }
    
}

