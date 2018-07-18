horoscopeJan = ("You will make the perfect program today",
                "You will find many bugs throughout your program",
                "Your bugs will multiply")

horoscopeFeb = ("Your program will do completely nothing",
                "Your program will miraculously work",
                "Your program will crash and burn like your future")

horoscopeMar = ("Your program will have more bugs than a swamp",
                "Your program will be deleted by the person sitting next to you out of jealousy ",
                "Your python will stop working")

horoscopeApr = ("That loop you have to make will go infinitely against your will",
                "The all mighty python will have an update that ruins your computer",
                "You will exterminate all the bugs in your next program with ease")

horoscopeMay = ("Your program will execute the wrong action causing you to get mad and hit your computer",
                "Your program has lost all will to keep going. It will terminate itself.",
                "You will forget this is python and not C++... Good luck with reprogramming it again!")

horoscopeJun = ("",
                "",
                "")

horoscopeJul = ("",
                "",
                "")

horoscopeAug = ("",
                "",
                "")

horoscopeSep = ("",
                "",
                "")

horoscopeOct = ("",
                "",
                "")

horoscopeNov = ("",
                "",
                "")

horoscopeDec = ("",
                "",
                "")

firstDaySet = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
secondDaySet = [11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
thirdDaySet = [21, 22, 23, 24, 25, 26, 27, 28, 29, 30]

month = input(print("what month is it: "))
day = int(input(print("what day is it: ")))

count = 0

if month == "January":
    while count < 10:
        if day == firstDaySet[count]:
            horoscope = horoscopeJan[0]
        if day == secondDaySet[count]:
            horoscope = horoscopeJan[1]
        if day == thirdDaySet[count]:
            horoscope = horoscopeJan[2]

        count = count + 1

if month == "February":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeFeb[1])
        if day == secondDaySet[count]:
            print(horoscopeFeb[1])
        if day == thirdDaySet[count]:
            print(horoscopeFeb[2])

        count = count + 1

if month == "March":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeMar[0])
        if day == secondDaySet[count]:
            print(horoscopeMar[1])
        if day == thirdDaySet[count]:
            print(horoscopeMar[2])

        count = count + 1

if month == "April":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeApr[0])
        if day == secondDaySet[count]:
            print(horoscopeApr[1])
        if day == thirdDaySet[count]:
            print(horoscopeApr[2])

        count = count + 1

if month == "May":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeMay[0])
        if day == secondDaySet[count]:
            print(horoscopeMay[1])
        if day == thirdDaySet[count]:
            print(horoscopeMay[2])

        count = count + 1

if month == "June":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeJun[0])
        if day == secondDaySet[count]:
            print(horoscopeJun[1])
        if day == thirdDaySet[count]:
            print(horoscopeJun[2])

        count = count + 1

if month == "July":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeJul[0])
        if day == secondDaySet[count]:
            print(horoscopeJul[1])
        if day == thirdDaySet[count]:
            print(horoscopeJul[2])

        count = count + 1

if month == "August":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeAug[0])
        if day == secondDaySet[count]:
            print(horoscopeAug[1])
        if day == thirdDaySet[count]:
            print(horoscopeAug[2])

        count = count + 1

if month == "September":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeSep[0])
        if day == secondDaySet[count]:
            print(horoscopeSep[1])
        if day == thirdDaySet[count]:
            print(horoscopeSep[2])

        count = count + 1

if month == "October":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeOct[0])
        if day == secondDaySet[count]:
            print(horoscopeOct[1])
        if day == thirdDaySet[count]:
            print(horoscopeOct[2])

        count = count + 1

if month == "November":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeNov[0])
        if day == secondDaySet[count]:
            print(horoscopeNov[1])
        if day == thirdDaySet[count]:
            print(horoscopeNov[2])

        count = count + 1

if month == "December":
    while count < 10:
        if day == firstDaySet[count]:
            print(horoscopeDec[0])
        if day == secondDaySet[count]:
            print(horoscopeDec[1])
        if day == thirdDaySet[count]:
            print(horoscopeDec[2])

        count = count + 1
