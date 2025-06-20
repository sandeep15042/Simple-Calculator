# Simple-Calculator

This is a basic Java-based web calculator built using **Servlets** (Jakarta EE) that performs arithmetic operations like addition, subtraction, multiplication, and division. It uses a simple HTML form and a `GenericServlet` to handle operations.

---

## Project Structure
SimpleCalculator/ <br>
src/   <br>
└── main/  <br>
    ├── java/  <br>
    │   └── Demo1Package1/  <br>
    │       └── Calculater.java  <br>
    └── webapp/   <br>
        ├── Cal.html  <br>
        └── WEB-INF/   <br>
            └── web.xml  <br>

##  Features

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)

---

##  Technologies Used

- Java Servlet API (Jakarta EE)
- HTML
- Apache Tomcat (or any servlet container)

---

## How It Works

1. **User Input:** The user enters two numbers and selects an arithmetic operation.
2. **Servlet Execution:** The servlet (`Calculater.java`) handles the request and performs the selected operation.
3. **Result Displayed:** The result is returned as an HTML response to the user.

---

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-username/SimpleCalculator.git
