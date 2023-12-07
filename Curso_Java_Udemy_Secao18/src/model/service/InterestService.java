package model.service;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterestRate();
	
	default Double payment(Double amount, Integer months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1 + (getInterestRate() / 100), months);
	}
}
