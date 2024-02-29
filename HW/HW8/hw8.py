def longestPalindrome(self, s):
    highestOdd=-1
    length=0
    counts={}
    for i in s:
        counts[i]=counts.get(i, 0)+1
    for j in counts.values():
        if j%2==0:
            length+=j
        else:
            if j>highestOdd:
                highestOdd=j
    if highestOdd!=-1:
        length+=highestOdd
    return length

print(longestPalindrome(None, "abccccdd"))
print(longestPalindrome(None, "speediskey"))