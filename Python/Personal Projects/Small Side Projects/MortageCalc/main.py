import math

class MortageInfo:
    def __init__(self):
        self.principal = 0
        self.interest = 0
        self.term_years = 0

    def get_principal(self):
        print("Please enter the amount that was borrowed (principal): ")
        self.principal = float(input())

    def get_interest(self):
        print("Please enter the interest rate: ")
        self.interest = float(input())

    def get_term(self):
        print("Enter the amount of years the loan is for (term): ")
        self.term = float(input())

    def get_info(self):
        print(f"\nPrincipal: ${self.principal}")
        print(f"Interest: %{self.interest}")
        print(f"Term: {self.term} years\n")

mortage = MortageInfo()
""" workin on this currently
def compound_calc():
    user_input = (input("\n\nSelect on of the following:\n 1. Monthly\n2.Weekly\n3.Daily\n4.Continually\n"))
    inter = mortage.interest / 100 
    if user_input == '1':
        monthly = mortage.principal * (1 + (inter / 12)) ** (12 * mortage.term)
        print(f"\n{monthly:.2f}")
    elif user_input == '2':
        weekly = mortage.principal * (1 + (inter / 52)) ** (52 * mortage.term)
        print(f"{weekly:.2f}")
    elif user_input == '3':
        daily = mortage.principal * (1 + (inter / 356)) ** (356 * mortage.term)
        print(f"{daily:.2f}")
    elif user_input == '4':
        continuously = mortage.principal * math.exp(mortage.interest * mortage.term)
        print(f"{continuously:.2f}")
"""
mortage.get_principal()
mortage.get_interest()
mortage.get_term()

while True:
    user_input = (input("\nSelect on of the following choices: \n1. Display Mortage Info\n2. Compound Calculator\n3. Type 'exit' if done\n"))
    if user_input == '1':
        mortage.get_info()
    elif user_input == '2':
        compound_calc()
    elif user_input == '3' or 'exit':
        print("Cya")
        break