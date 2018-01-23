/*
BINARY TREE
Each Node can have no more than 2 child nodes.
The middle value is the parent, the left(child) has a lower value, the right(child) has a higher value.
Time needed to peform an operation on a tree is O(logN)
When building the tree(insert) you check to see if the value is bigger than the parent node, if it is, it goes on the right, if smaller, it goes on the left, and you continue on until you reach the null node, thus inserting the element at that position.
*/
class Node {
    Node left, right;
    int data;
    public Node(int data) {
      this.data = data;
    }

    public void insert(int value) {
        if(value <= data) {
          if(left == null) {
            left = new Node(value);
          } else {
            left.insert(value);
          }
        } else {
          if(right == null) {
            right = new Node(value);
          } else {
            right.insert(value);
          }
        }
    }

    public boolean contains(int value) {
        if(value == data) {
           return true;
        } else if(value < data) {
            if(left == null) {
               return false;
            } else {
                return left.contains(value);
            }
        } else {
            if(right == null) {
               return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if(left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if(right != null) {
            right.printInOrder();
        }
    }
}
