
/*
* Leetcode 100 : Check if two trees have the same values across respective nodes
*/

class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		//check if both nodes are empty, they are equal
		if(p == null && q == null ) return true;
		//if left node is null and right isn't
        if(p == null && q != null) return false;
        //if left node is not null and right is
        if(p != null && q == null) return false;
        //actual work of the recursive call
        if(p.val != q.val) return false;
        //recurse through both left and right children
        return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
	}
}