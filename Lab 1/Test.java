
public class Test {

  public static void main(String args[]) {
    TreeNode r=new TreeNode(3);
    r.setLeftAndRight(new TreeNode(4), new TreeNode(5));

    Tree t=new Tree(r);
    t.traverse();
  }
}

