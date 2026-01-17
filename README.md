# Bank Account Management System (Java OOP)

## 📌 Overview
This project is a simple **Bank Account Management System** built using **Java Object-Oriented Programming (OOP)** concepts.  
The purpose of this exercise is to **practice and apply OOP fundamentals** such as encapsulation, constructors, methods, and object interaction in a real-world scenario.

---

## 🎯 Exercise Objective
The goal of this exercise is to design a `Bank_Account` class that represents a real bank account and allows the user to:

- Create a bank account
- Deposit money
- Withdraw money with validation
- Check account balance
- Display account information

This project focuses on **logic implementation**, **data protection**, and **clean code structure**.

---

## 🧠 OOP Concepts Applied

### 1️⃣ Encapsulation
All attributes are declared as `private` to protect account data:
- `accountNumber`
- `ownerName`
- `balance`

Access to these attributes is controlled through public methods.

---

### 2️⃣ Constructor
A constructor is used to initialize the bank account when an object is created:

```java
public Bank_Account(int accountNumber, String ownerName, double balance)
