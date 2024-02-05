import math

versions=["g","g","g","g","b","b","b","b","b","b","b"]
n=len(versions)

def isBadVersion(version):
    if versions[version]=="g":
        return False
    return True
last_good=0
first_bad=n-1
ind=int(n/2)

if isBadVersion(0):
    print(0)
else:
    while 0<ind<n:
        if isBadVersion(ind) and not isBadVersion(ind-1):
            print(ind)
            break
        elif isBadVersion(ind):
            first_bad = ind
            ind=math.floor((ind+last_good)/2)
        else:
            last_good=ind
            ind=math.floor((first_bad+ind)/2)