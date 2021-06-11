print("Hello,lets find out your electricity cost")

usage = int(input("Enter your token usage\n"))

if usage <= 50:
    amount = usage*0.50
    surcharge=10
    total=amount+surcharge
    print("Your bill is:",total)

elif 50 < usage <= 150:
    amount1=((usage-50) *1.00) + 25
    surcharge=10
    total=amount1+surcharge
    print("Your bill is:",total)

elif 150< usage <= 250:
    amount=(usage-150)*1.20 + 100 + 25
    surcharge=10
    total=amount+surcharge
    print("Your bill is:",total)

elif usage > 250:
    amount = usage*1.50
    surcharge=10
    total=amount+surcharge
    print("Your bill is:",total)