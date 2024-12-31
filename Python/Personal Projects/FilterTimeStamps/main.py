import re

print("Type in a file name to filter timestamps from")
userinput = ""

while True:
    line = input()
    if line.lower() == "done":
        break
    userinput += line + "\n"

pattern = r'\b(?:\d{2}:)?\d{2}:\d{2}\b'
pattern2 = r'\b\d{1}:\d{2}\b'

cleantext = re.sub(pattern, '', userinput)
cleantext = re.sub(pattern2, '', cleantext)

print("Filtered text:\n" + cleantext)
