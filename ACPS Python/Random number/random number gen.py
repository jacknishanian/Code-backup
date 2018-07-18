from random import randint
import math

isEven = False


while isEven == False:
    randNum = randint(1000000, 1000000000)
    if randNum % 2 == 0:
        isEven = True

finalNum = 0
low = 1
high = randNum

guesses = round(math.log(randNum, 2))

print("I will guess any number between 1 and ", randNum, " within ", guesses, " guesses ")

status = " "

while status != "e":
    finalNum = (high + low) / 2
    status = input(print("is ", round(finalNum, 0), " Greater then (g), Less Then (l), or Equal to (e) your number"))

    if status == "g":
        high = finalNum - 1

    if status == "l":
        low = finalNum + 1

    if status == "e":
        print("yay!")
