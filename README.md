# IsTreeBalanced
Check if a binary tree is balanced (height +-1)

1. write a method to calculate height, scan each node, return 1+Max(leftH,rightH)
  write another method, scan each node, to check |leftH-rightH|>1, return false, else return isBalanced(left) && isBalanced(right)
  O(N^2) Time
2. put two methods together,int checkHeight(), scan each node, if |leftH-rightH|>1, instead of return false, return -1(we need an int value), otherwise, keep calculate the height, return 1+Max(leftH,rightH);
   in the method isBalanced, if checkHeight(t) is -1, return false, otherwise(like 0,1,2,3...), return true; 
   O(N) Time, O(H) Space
