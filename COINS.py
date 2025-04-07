a = []
x=int

while x!=0:
    x = int(input("Queue List: "))
    a.append(x)

    if len(a)==5:
        break

def isEmpty(a):
    z=[0]
    return a<=z

def isFull(a):
    z=[5]
    return a>=z

def Peek(a):
    if len(a)==a:
        return a

print("")
print("Queue List: ", a)
print("First Element: ", a[0])
print("Size of queue List: ", len(a))
print("is the stack Empty: ", isEmpty(a))
print("is the stack Full: ", isFull(a))

print("\nRemoving Elements:")
while len(a)!=0:
    print("Queue List: ", a)
    print("Pop Element: ", a[0])
    a.pop(0)

print("")
print("First Element: ", Peek(a))
print("Size of queue List: ", len(a))
print("is the stack Empty: ", isEmpty(a))
print("is the stack Full: ", isFull(a))
