
print("Hello user,Welcome to our BMI calculator")
weight = float(input("Enter your weight (pounds)\n"))
height = float(input("Enter your height (feet)\n"))

BMI = weight/(height*height)
print(BMI)

if BMI <= BMI < 22.9:
 print("Your BMI is normal")
elif 23 <= BMI < 24.9:
 print("Your BMI is OverWeight")
elif 25 <= BMI < 29.9:
 print("You are Pre-Obese")
elif 30 <= BMI < 34.9:
 print("You Are Obese")
elif 35 <= BMI < 39.9:
 print("YoU Are Obese cLASS II")
elif 40.0 <= BMI:
 print("You Are Obese Class III")
elif BMI  <18.5:
 print("You are UnderWeight")
else:
 print("Enter a valid input")