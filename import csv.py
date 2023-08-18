import csv

file = "/home/guimbreon/Desktop/git/IMBD/ratings.csv"

with open(file, 'r') as csvfile:
    csvreader = csv.reader(csvfile)
    fileItems = []
    i = 0
    for row in csvreader:
        if (i != 0):
            fileItems.append(row)
        else:
            print("")
            i = 1

def average(fileItems):
    sum = 0
    count = len(fileItems)
    for item in fileItems:
        sum += int(item[1])
    print("The average rating of the user is ", round(sum/count,1))
    
    

average(fileItems)