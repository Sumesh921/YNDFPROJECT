package com.mbs.service;

import java.util.List;

public interface BillingService {
    double calculateMonthlyBill(Long UserId, int month, int year);
}
