package lab8Binarytree;
public class binarySearchTreeNode {
  int info;
  binarySearchTreeNode left ,right;
  
  public binarySearchTreeNode(int info, binarySearchTreeNode left, binarySearchTreeNode right){
    this.info = info;
    this.left = left;
    this.right = right;
  }
  
  public void setInfo(int info) {
    this.info = info;
  }
  public int getInfo() {
    return info;
  }
}
