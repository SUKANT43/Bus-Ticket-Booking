# 🚌 Bus Booking System (Java)

A simple command-line Java application that simulates a bus seat booking system. Users can view available buses and book seats based on availability and date.

---

## 🚀 Features

- View available buses
- Book a seat by entering:
  - Passenger name
  - Bus number
  - Date (in `dd-MM-yyyy` format)
- Booking only confirmed if seats are available on that date

---

## 📂 Files Included

| File Name     | Description                                |
|---------------|--------------------------------------------|
| `Bus.java`    | Defines the `Bus` class with properties like bus number, AC status, and capacity |
| `Booking.java`| Handles the booking process and checks availability |
| `BusDemo.java`| Contains the `main` method to run the program and interact with users |

---

## 🛠️ How to Run

1. **Clone or download** this repository.
2. Open the project in IntelliJ IDEA (or any Java IDE).
3. Ensure all `.java` files are placed inside the `src` folder (if using IntelliJ).
4. Compile and run `BusDemo.java`.

### 🔧 Using Terminal:
```bash
javac Bus.java Booking.java BusDemo.java
java BusDemo
