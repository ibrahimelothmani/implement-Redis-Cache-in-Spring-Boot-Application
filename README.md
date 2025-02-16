# redis-server

![Redis-server](https://github.com/user-attachments/assets/de4474a8-0a84-4047-aa18-dfcc4ec869b3)

# MySQL

![mysql](https://github.com/user-attachments/assets/e89f6cfc-1c59-4106-8d75-efa980cb7d62)

# How to test the application after implementing Redis Cache?

1) Start Redis Server.

2) Start your Spring Boot Application.

3) Make a Rest Call using any REST client on operations which are get, update & delete. You can use any REST client such as any User Interface, RestTemplate or Postman etc. However, we have used Postman just to test the functionality.

4) When you call an operation for the first time, you should see a DB query in the console.

5) If you call the same operation for the second time, you should not see the DB query in the console. If it is, you have successfully applied the Redis Cache.
