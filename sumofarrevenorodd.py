"""Qn: Given an array of numbers.. calculate the sum of all the numbers.. And return true if sum is even, false if sum is odd
Eg: [ 1,2,4,5]
output: true
Explanation: 1+2+4+5 = 12 which is even."""
arr=[1,2,4,5]
sum=0
for i in arr:
    sum=sum+1
if sum%2==0:
    print("true")
else:
    print("false")     