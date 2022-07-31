x = input()
s = ""
n = 0
for i in x:
    if(i.isalpha()):
        s = s + i
        elif(i.isdigit()):
            n = (n*10) + int(i)
y = len(s)
if(y == n):
    print("TRUE "+ str(y))
else:
    print("FALSE "+str(y))
