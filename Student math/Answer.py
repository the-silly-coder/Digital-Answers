n=int(input())
l=[]
l1=[]
for i in range(n):
    l.append(int(input()))
for i in range(len(l)):
    r=0
    if len(l)==i+1:
        l1.append(0)
    else:
        for j in range(i+1,len(l)):
            r+=l[j]
        l1.append(r)
print(*l1)
