print("want to know how much you spend with regards to distance?")

distance = int(input("Enter distance travelled\n"))

if 0 <= distance <= 100:
    print("Your cost is 5.00")
elif 100 < distance < 500:
    print("Your cost is 8.00")
elif 500 < distance < 1000:
    print("Your cost is 10.00")
elif distance < 1000:
    print("Your cost is 12.00")
else:
    print("Enter valid distance")