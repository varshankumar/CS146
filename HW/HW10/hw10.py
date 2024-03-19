from typing import Optional, List
import queue
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
    q = queue.Queue()
    result = []
    if  root is None:
        return None
    q.put(root)
    while q.qsize() != 0:
        level=[]
        queueSize = q.qsize()
        for i in range(queueSize):
            node=q.get()
            level.append(node.val)
            if node.left is not None:
                q.put(node.left)
            if node.right is not None:
                q.put(node.right)
        result.append(level)
    return result


node1 = TreeNode(1)
node3 = TreeNode(3, left=node1)
node5 = TreeNode(5)
node9 = TreeNode(9)
node8 = TreeNode(8, left=node5, right=node9)
root = TreeNode(4, left=node3, right=node8)

print(levelOrder(None, root))