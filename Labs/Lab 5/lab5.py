class TreeNode(object):

    def __init__(self, val=0, left=None, right=None):
        self.val = val

        self.left = left

        self.right = right

def isValidSubtree(root, min, max):
    if root == None:
        return True
    if root.val <= min or root.val >= max:
        return False
    return isValidSubtree(root.left, min, root.val) and isValidSubtree(root.right, root.val, max)


def isValidBST(self, root):
    return isValidSubtree(root, float('-inf'), float('inf'))
