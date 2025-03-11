BookHeist Application
Overview
BookHeist is a Spring Boot application designed to manage book inventory, orders, and purchases. The application leverages JWT (JSON Web Token) for secure authentication and authorization.

Features
Book Management: Add, update, delete, and retrieve books.
Order Management: Place orders for books.
Purchase Management: Complete purchases based on orders.
JWT Authentication: Secure endpoints with JWT tokens.
Endpoints
Books
GET /books/getallbooks - Retrieve all books.
POST /books/addbooks - Add a new book.
PUT /books/update/{id} - Update book details.
DELETE /books/delete/{id} - Delete a book.
Orders
POST /orders/order - Place an order for a book.
POST /orders/purchase/{orderId} - Complete a purchase based on an order.
Technologies Used
Spring Boot: Framework for building the application.
JWT: Secure authentication and authorization.
Postman: Tool for testing API endpoints.
Getting Started
Clone the repository:
git clone https://github.com/yourusername/bookheist.git
Navigate to the project directory:
cd bookheist
Build the project:
mvn clean install
Run the application:
mvn spring-boot:run
Testing
Use Postman to test the endpoints. Ensure you include the JWT token in the Authorization header for secured endpoints.
