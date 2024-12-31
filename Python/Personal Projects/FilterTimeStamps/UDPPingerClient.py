from socket import *
import time

serverName = 'localhost'
serverPort = 12000
clientSocket = socket(AF_INET, SOCK_DGRAM)
clientSocket.settimeout(1)

for i in range(1, 11):  # Use sequence numbers from 1 to 10
    message = f"Ping {i}"
    clientSocket.sendto(message.encode(), (serverName, serverPort))
    start_time = time.time()
    try:
        modifiedMessage, serverAddress = clientSocket.recvfrom(1024)
        end_time = time.time()
        print(modifiedMessage.decode() + f" RTT: {end_time - start_time:.4f} seconds")
    except timeout:
        print("Request timed out")