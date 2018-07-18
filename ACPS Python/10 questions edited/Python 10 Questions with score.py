score = 0

color = input("what is your favriote color ")
if color == "green":
    score += 1
print (color, " Nice i like that color also")


number = input("what is your favroite number ")
if number == 18:
    score += 1
print ("oh, you like: ", number, " nice")


lod = input ("what do you prefer laptop or desktop ")
if lod == "desktop":
    score += 1
print (lod, " nice i scan see why")


gos = input ("what do you like jeans or shorts")
if gos == "shorts":
    score += 1
print("really ", gos, " i thought you were better then that")


pos = input ("are you pessimistic or optimistic")
if pos == "optimistic":
    score += 1
print ("oh you are ", pos, "sure...")


csocod = input ("counter strike or call of duty")
if csocod == "counter strike":
    score += 1
print (csocod, "i dont know how to think about this")


bor = input("blue or red")
if bor == "red":
    score += 1
print (bor, " i agree")


hl2o3 = input("halflife 2 or 3")
if hl2o3 == 3:
    score += 1
print (hl2o3, " well i know some people who will disagree")


gob = input ("green or blue")
if gob == "green":
    score += 1
print (gob, " nah i dont like that")


coj = input ("C++ or java")
if coj == "java":
    score += 1
print (coj, "??? well we will have to disagree")


print ("Your Score is: ", score, "/10")

if score >= 8:
    print("top division")

elif score >= 4:
    print ("middle division")

else:
    print("bottom division")
