from mpmath import mp

digits = int(10000)
def calculate_pi(digits):
    mp.dps = digits
    return mp.pi

while True:
    user_input = (input("\nEnter which digit you want to see: "))
    if user_input == "exit":
        print("\n\nCya\n")
        break
    try:
        number_str = str(calculate_pi(digits))
        user_input = int(user_input) + 1
        n_char = number_str[user_input]
        print(f"The number at position {user_input - 1} is {n_char}\n")
    except ValueError:
        print("\nInput a number or 'exit'\n")