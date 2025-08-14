num1 = input("Enter the number")
num2 = input("Enter the number")
num3 = input("Enter the number")
numlist=[num1,num2,num3]
sum=0
for num in numlist:
    sum += int(num)
print("Value of", sum)