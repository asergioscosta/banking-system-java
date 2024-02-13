# Banking System

### Index

- [Project Description](#project-description)
- [Requirements](#requirements)
- [Features](#features)
- [Techniques and Technologies Used](#techniques-and-technologies-used)
- [Accessing the Project](#accessing-the-project)
- [Opening and Running the Project](#opening-and-running-the-project)
- [Developers](#developers)

## Project Description

This Java project implements a simple banking system with abstract and concrete classes, as well as interfaces to represent different entities of the bank. The system allows for the creation of bank employees, clients with associated addresses, and the performance of basic banking operations such as deposits, withdrawals, and transfers.

## Requirements

1. **Creation of Abstract Classes:**
   - The `Account` and `Person` classes are abstract classes, meaning objects cannot be instantiated from these classes.

2. **Creation of the `IUser` Interface:**
   - The `IUser` interface has only the signature of a method.
   - The method, when implemented in the classes that perform the interface, must return only `True`.

3. **Creation of Concrete Classes:**
   - The concrete classes correspond to all other classes, and some of them have inheritance relationships with the abstract classes of the model.

Considerations about Methods in Concrete Classes:

   a. **`listAddresses()` Method of the `Client` Class:**
      - The method should print to the console all addresses stored for a client.

   b. **`deposit()` Method of the `Account` Class:**
      - Creates an object of type `Credit` linked to the account receiving the deposit.

   c. **`withdraw()` Method of the `Account` Class:**
      - Creates an object of type `Debit` linked to the account undergoing the withdrawal.
      - The account cannot have a negative balance beyond its limit.

   d. **`transfer()` Method of the `CheckingAccount` Class:**
      - Withdraws money from the source checking account and sends it to a destination account.
      - The account cannot have a negative balance beyond its limit.

   e. **`calculateBalance()` Method of the `SavingsAccount` Class:**
      - Sums the value of all credits and subtracts it by the sum of the values of all debits.

   f. **`calculateBalance()` Method of the `CheckingAccount` Class:**
      - Sums the value of all credits and subtracts it by the sum of the values of all debits.
      - Then, adds the value of the limit.
      - Finally, returns the value.

## Features

**`Feature 1:`**

- Create two bank employees, one manager and one teller.

**`Feature 2:`**

- Create a client and add 3 addresses to him/her.
- Print the addresses of this client.

**`Feature 3:`**
- Create a client who has a CheckingAccount.
- Make three deposits of 100 into this CheckingAccount.
- Make a withdrawal of 50 from this CheckingAccount.
- Print the balance of this CheckingAccount.

**`Feature 4:`**

- Create a client who has a CheckingAccount.
- Make a deposit of 1000 into this CheckingAccount.
- Create a client who has a SavingsAccount.
- Make a deposit of 1000 into this SavingsAccount.
- Transfer 500 from the CheckingAccount to the SavingsAccount.

## Techniques and Technologies Used

- **Programming Language:** ``Java-8``
- **IDE (Integrated Development Environment):** ``IntelliJ IDEA``
- **Programming Paradigm:** ``Object-Oriented Programming``
- **Version Control Tools:** ``Git`` and ``GitHub``

## Accessing the Project

You can access the project files [by clicking here](https://github.com/asergioscosta/sistema-bancario-java/tree/main/src) or [download them as a zip file](https://github.com/asergioscosta/sistema-bancario-java/archive/refs/heads/main.zip).

## Opening and Running the Project

1. Choose or create a folder on your computer to store the project.
2. Create a repository on GitHub or use an existing one.
3. Clone the repository to your local machine using the command `git clone <repository_URL>` in your terminal or Git Bash.
4. Open IntelliJ IDEA.
5. In the main menu, select "File" -> "Open" and navigate to the directory where you cloned the project.
6. Select the project folder and click "Open".
7. Wait for IntelliJ IDEA to load the project.
8. Locate the folder named ``src`` or similar in the project.
9. Open the project in IntelliJ IDEA and wait for indexing.
10. Make sure the Java SDK settings are correctly configured in IntelliJ IDEA. If necessary, IntelliJ should automatically suggest configuring the Java SDK.
11. After setting up the SDK, you can start working with the project code.
12. To run the project, find the main entry point (e.g., a class with the ``main`` method) and execute it by clicking on the green execution icon next to the method or main class.
13. Make sure to follow the project-specific instructions to test its functionalities.
14. If you wish to make modifications to the project, make changes to the Java files using IntelliJ IDEA.
15. After making the desired changes, save the files and follow the steps to run the project again to test your modifications.
16. Once you have completed your modifications, you can upload the changed code to GitHub following the Git instructions.

Be sure to review and test your code before committing to ensure that the project's functionalities are working as expected.

Make sure that all necessary dependencies are installed and configured correctly in your development environment.

## Developers

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/102989796?v=4" width=115>](https://github.com/asergioscosta)
