count = 0

num1 = 0
num2 = 1
newNum = 0


while count < 10:
    newNum = num1 + num2

    print(newNum)

    num1 = num2
    num2 = newNum

    count = count + 1