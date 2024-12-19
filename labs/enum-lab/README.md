# Lab: Enum Usage in a Banking System

## Objective:
The goal of this lab is to familiarize yourself with Java enums and how they can be used in real-world applications. You'll work on creating an enum to define various account types and simulate a banking system with multiple operations like deposit, withdrawal, and account management.

## Instructions:

### 1. Create an Enum for Account Types
Define an enum called `AccountType` to represent three types of bank accounts: `SILVER`, `GOLD`, and `PLATINUM`. Each account type should have the following limits for withdrawal and deposit:
- **SILVER**: Withdrawal limit: $1,000, Deposit limit: $1,500
- **GOLD**: Withdrawal limit: $10,000, Deposit limit: $15,000
- **PLATINUM**: Withdrawal limit: $20,000, Deposit limit: $30,000

### 2. Add Methods to AccountType Enum
Add two fields to the `AccountType` enum: `withdrawLimit` and `depositLimit`. 
- Create a constructor that accepts `withdrawLimit` and `depositLimit` as arguments and assigns them to the fields.
- Add methods to retrieve these limits:
    - `getWithdrawLimit()`
    - `getDepositLimit()`

### 3. Create a Bank Account Class
Create a class `BankAccount` with the following fields:
- `accountNumber` (String)
- `accountType` (AccountType)
- `balance` (double)

Provide a constructor to initialize the `accountNumber`, `accountType`, and `balance`.

### 4. Add Deposit and Withdrawal Methods
Add methods in `BankAccount` to handle deposits and withdrawals. These methods should check whether the transaction is within the allowed limits based on the `AccountType`:
- `deposit(double amount)`: Should not exceed the `depositLimit` of the account type.
- `withdraw(double amount)`: Should not exceed the `withdrawLimit` of the account type and must ensure that the account has sufficient funds.

### 5. Account Management
Create a `BankingSystem` class with a `Map<String, BankAccount>` to store multiple bank accounts by account number. Implement the following methods:
- `createAccount(String accountNumber, AccountType accountType, double initialBalance)`: Create a new account and add it to the system.
- `getAccount(String accountNumber)`: Retrieve an account by its number.
- `transferFunds(String fromAccountNumber, String toAccountNumber, double amount)`: Transfer funds between two accounts, ensuring that both accounts are valid and the transaction doesn't exceed the limits.

### 6. Enum Operations
Demonstrate how to iterate over all values of the `AccountType` enum using `AccountType.values()` and display each account type along with its withdrawal and deposit limits.

Additionally, convert the `AccountType` to a String and manipulate the format by capitalizing the first letter and making the rest of the letters lowercase.

## Example Tasks for Testing:
- Create accounts with different account types.
- Perform valid and invalid deposits and withdrawals.
- Transfer funds between accounts.
- Display the account types and their limits.

## Deliverables:
1. A working implementation of the `AccountType` enum with withdrawal and deposit limits.
2. A `BankAccount` class that correctly handles deposit, withdrawal, and balance checking based on account type.
3. A `BankingSystem` class to manage multiple accounts, perform transfers, and display account types.
4. Test the implementation by running various scenarios:
    - Creating accounts with different account types.
    - Performing valid and invalid deposits and withdrawals.
    - Transferring funds between accounts.
    - Displaying the account types and their limits.

## Evaluation Criteria:
- Proper use of enums and enum constructors.
- Correct application of deposit and withdrawal limits based on account type.
- Proper management of bank accounts in the `BankingSystem`.
- Handling edge cases, such as invalid withdrawals or deposits exceeding limits.
- Correct and clear code comments and documentation.

## Extension (Optional):
For advanced students, you can extend this lab by adding the following features:
- Implementing interest rates for each account type (e.g., Platinum accounts earn higher interest).
- Adding account closure functionality in the `BankingSystem` class.
- Implementing a method to view account transactions (e.g., using a `List` of transactions).
