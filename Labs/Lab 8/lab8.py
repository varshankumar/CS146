from typing import List


def coinChange(self, coins: List[int], amount: int) -> int:
    change=[]
    for i in range(amount+1):
        change.append(amount+1)
    change[0]=0
    for i in range(1,amount+1):
        for coin in coins:
            if coin<=i:
                if change[i]>change[i-coin]+1:
                    change[i]=change[i-coin]+1
    if change[amount]<=amount:
        return change[amount]
    return -1


coins= [1, 2, 5]
amount= 11
print(coinChange(None, coins, amount))