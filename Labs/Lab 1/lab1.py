nums=[0,1,2,3,7,8,9]
target=12
pairs={}
for i in nums:
    pairs[i]=target-i
first=0
found=False
for j in nums:
    for k in range(len(nums)):
        if(pairs[j]==nums[k]):
            print(first,k)
            found=True
            break
    if found:
        break
    first+=1