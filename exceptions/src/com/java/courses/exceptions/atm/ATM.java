package com.java.courses.exceptions.atm;

public class ATM {
    int totalMoney;

    public ATM(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public void getMoney(int sum) throws InsufficientFundsException, NetworkException {
        if (sum > totalMoney) {
            throw new InsufficientFundsException("No money");
        }

        if (!updateDatabaseServer(sum)) {
            throw new NetworkException("No connection");
        }
    }

    public boolean updateDatabaseServer(int sum) {
        return true;
    }
}
