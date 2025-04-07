mylist = []
print("To stop enter 0: ")
while True:
    val = int(input()) 
    if val==0:
        break
    mylist.append(val)
print("The list has numbers: ", mylist) 
searchItem = int(input("Enter number to search in the list: "))
found = False 
for i in range (len(mylist)):
    if mylist[i]==searchItem:
        found= True
        print (searchItem, 'was found in list at index', i)
        break
else:
    print ( searchItem, 'was not found in the list!')
