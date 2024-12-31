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
        print("\n")
        print(f"Principal: ${self.principal}")
        print(f"Interest: %{self.interest}")
        print(f"Term: {self.term} years")
        print("\n")

mortage = MortageInfo()

mortage.get_principal()
mortage.get_interest()
mortage.get_term()
mortage.get_info()

