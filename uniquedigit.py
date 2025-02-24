"""Given an integer n, return the count of all numbers with unique digits, x, where <= x < 10n.

Example 1:

Input: n = 2

Output: 91

Explanation: The answer should be the total numbers in the range of s<100, excluding 11,22,33,44,55,66,77,88,99

Example 2:

Input: n=0

Output: 1

Constraints: 0 < n<=8"""
def count_unique_digits(n):
    upper=10**n
    count=0
    for x in range(upper):
        s=str(x)
        if len(s)==len(set(s)):
            count+=1
            
    return count,len(set(s))
    #return len(set(s))
print(count_unique_digits(3))  
print(len(set("11")))