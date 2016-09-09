

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode f =new TreeNode(6,null,null);
		TreeNode e =new TreeNode(5,null,null);
		TreeNode c =new TreeNode(3,null,null);
		TreeNode d= new TreeNode(4,e,f);
		TreeNode b= new TreeNode(2,d,null);
		TreeNode a= new TreeNode(1,b,c);
		System.out.println(isBalanced2(a));
		

	}
	
	public static boolean isBalanced(TreeNode t){
		if(t==null) return true;
		//if(t.left==null && t.right==null)return true;
		//int leftH=(t.left==null)?-1:t.left.height;
		//int rightH=(t.right==null)?-1:t.right.height;
		int leftH=height(t.left);
		int rightH=height(t.right);
		if(Math.abs(leftH-rightH)>1){
			return false;
		}else{
			return isBalanced(t.left) && isBalanced(t.right);
		}
			
	}//each node is called twice, Time O(N^2)
	
	public static int height(TreeNode t){
		if(t==null) return 0;//here, empty tree's height is 0, one level's height is 1
		int leftH=height(t.left);
		int rightH=height(t.right);
		return 1+Math.max(leftH, rightH);
	}
	
	public static int checkHeight(TreeNode t){
		if(t==null)return 0;
		
		//check if left is balanced
		int leftH=checkHeight(t.left);
		if(leftH==-1) return -1;
		
		//check if right is balanced
		int rightH=checkHeight(t.right);
		if(rightH==-1)return -1;
		
		//check if current node is balanced
		if(Math.abs(leftH-rightH)>1){
			return -1;//-1 stands for false, this tree is not balanced 
		}else{
			return Math.max(leftH, rightH)+1;
		}
	}//put two methods together, Time O(N)
	
	public static boolean isBalanced2(TreeNode t){
		if(checkHeight(t)==-1){
			return false;
		}else{
			return true;
		}
	}

}
