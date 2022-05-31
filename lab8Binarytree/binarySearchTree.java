package lab8Binarytree;
public class binarySearchTree{
binarySearchTreeNode root;

public binarySearchTree(){
  root = null;
}

public void addNewNode(int newInfo){
  binarySearchTreeNode temp = root;
  if(root == null){
   root =  new binarySearchTreeNode(newInfo, null, null);
  } else{
    while(true){
      if(newInfo < temp.getInfo() && temp.left != null){
        temp = temp.left;
      }else if(newInfo >=  temp.getInfo() && temp.right != null){
        temp = temp.right;
      }else if(newInfo < temp.getInfo()){ //temp.left is null
        temp.left = new binarySearchTreeNode(newInfo, null, null);
        break;
      }else{//newInfo >= tempInfo && temp.right is null
        temp.right = new binarySearchTreeNode(newInfo , null , null);
        break;
      }
    }
  }
}

public binarySearchTreeNode search(int key){
  binarySearchTreeNode temp = root;
  while(temp != null && temp.getInfo() != key){
    if(key < temp.getInfo()){
      temp = temp.left;
    }else{
      temp = temp.right;
    }
  }
  return temp;
}
//Tine code
// BinarySearchTreeNode temp = root;
//         while(true){
//             if(temp.getInfo() == key) return true;
//             BinarySearchTreeNode temp2 = key < temp.getInfo() ? temp.left : temp.right;
//             if(temp2 != null) temp = temp2;
//             else return false;
//         }
}