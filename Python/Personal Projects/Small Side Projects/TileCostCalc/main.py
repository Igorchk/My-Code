class TileQuestions:
    def widques():
        print("\nEnter the Width of the floor:")
    
    def lengques():
        print("\nEnter the Length of the floor:")
    
    def priceques():
        print("\nEnter the Cost per unit of tile:")

TileQuestions.widques()
width = float(input())
TileQuestions.lengques()
length = float(input())
TileQuestions.priceques()
price = float(input())

print("\nThe Width is: " + str(width) + "\nLength is: " + str(length) + "\nCost Per Unit: " + str(price))

cost = width * length * price

print("The total cost will be: " + str(cost) + "\n")