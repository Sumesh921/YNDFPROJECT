package com.mbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbs.repository.UserRepository;
import com.mbs.service.BillingService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	 
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BillingService billingService;
	
	@GetMapping("/{customerId}/bill")
    public double generateMonthlyBill(@PathVariable Long customerId, @RequestParam int month, @RequestParam int year) {
        return billingService.calculateMonthlyBill(customerId, month, year);
    }
	
	

}
