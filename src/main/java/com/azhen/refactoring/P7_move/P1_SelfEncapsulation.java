package com.azhen.refactoring.P7_move;

public class P1_SelfEncapsulation {
    class Account {
        private double _interestRate;

        double interestForAmount_days(double amount, int days) {
            return getInterestRate() * amount * days / 365;
        }

        public double getInterestRate() {
            return _interestRate;
        }

        public void setInterestRate(double _interestRate) {
            this._interestRate = _interestRate;
        }
    }

    class AccountType {
        private double _interestRate;
        public double getInterestRate() {
            return _interestRate;
        }

        public void setInterestRate(double _interestRate) {
            this._interestRate = _interestRate;
        }
    }
    class Account2 {
        private AccountType _type;

        double interestForAmount_days(double amount, int days) {
            return getInterestRate() * amount * days / 365;
        }

        public double getInterestRate() {
            return _type.getInterestRate();
        }

        public void setInterestRate(double _interestRate) {
            _type.setInterestRate(_interestRate);
        }
    }
}
