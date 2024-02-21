def threeSum(self, nums: list[int]) -> list[list[int]]:
    r=[]
    nums.sort()
    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            for k in range(j+1, len(nums)):
                if(nums[i]+nums[j]+nums[k]==0):
                    if not [nums[i], nums[j], nums[k]] in r:
                        r.append([nums[i], nums[j], nums[k]])
    return r

arr=[-5,0,5,10,-10,0, 5, 5, -10, 5, 5]
print(threeSum(self=None, nums=arr))