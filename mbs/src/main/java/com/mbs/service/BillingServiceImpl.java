package com.mbs.service;

import com.mbs.entity.DailyRecord;
import com.mbs.repository.DailyRecordRepository;
import com.mbs.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceImpl implements BillingService {

    @Autowired
    private DailyRecordRepository dailyRecordRepository;

    @Override
    public double calculateMonthlyBill(Long userId, int month, int year) {
        // Fetch records for the specified customer, month, and year
        List<DailyRecord> records = dailyRecordRepository.findByUserIdAndMonthAndYear(userId, month, year);

        // Calculate the total bill
        return records.stream()
                .filter(record -> !record.isAbsent()) // Exclude records where the customer was absent
                .mapToDouble(record -> record.getQuantity() * record.getProduct().getPrice()) // Multiply quantity and price
                .sum(); // Sum up all the totals
    }
}
