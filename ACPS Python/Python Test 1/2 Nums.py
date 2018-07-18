num1 = input("enter the first number: ")
num2 = input("enter the second number: ")

if num1 > num2:
    print(num1 + " is greater then " + num2)

if num1 < num2:
    print(num1 + " is less then " + num2)

total = int(num1) + int(num2)
print("Adding: " + str(total))

total = int(num1) - int(num2)
print("Subtraction: " + str(total))

total = int(num1) / int(num2)
print("Division: " + str(total))