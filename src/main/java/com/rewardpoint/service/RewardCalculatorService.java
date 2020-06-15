package com.rewardpoint.service;

import com.rewardpoint.dto.TransactionObj;

/**
 * This is the object where I implemented all the function to calculate reward points
 * @author sharatmeitei
 *
 */

public class RewardCalculatorService {

	
  /**
   * Implemented rewardPoint logic with the inputs given as parameters below
   * @param tranObj
   * @param transactionId
   * @return
   */
	public double totalAmoutByTransactionId(TransactionObj[] tranObj, String transactionId) {
		double rewardPoints = 0.0;
		double totalExpenAmout = 0.0;
		for (int i = 0; i < tranObj.length; i++) {
			String traId = tranObj[i].getTransactionId();
			if (transactionId.equalsIgnoreCase(traId)) {
				totalExpenAmout = totalExpenAmout + new Double(tranObj[i].getAmount());
			}

		}

		rewardPoints = rewardCalculator(totalExpenAmout);

		return rewardPoints;
	}

	/**
	 * Implemented rewardPoint logic with the inputs given as parameters below
	 * @param tranObj
	 * @param customerId
	 * @param month
	 * @return
	 */
	public double rewardPoinByCustIdPerMonth(TransactionObj[] tranObj, String customerId, String month) {

		double rewardPoints = 0;

		double totalExpenAmout = 0.0;
		for (int i = 0; i < tranObj.length; i++) {
			String custId = tranObj[i].getCustomerId();
			String day = tranObj[i].getDay();
			String monStr[] = day.split("-");
			if (customerId.equalsIgnoreCase(custId) && month.equalsIgnoreCase(monStr[0])) {
				totalExpenAmout = totalExpenAmout + new Double(tranObj[i].getAmount());
			}

		}

	   rewardPoints = rewardCalculator(totalExpenAmout);

	   return rewardPoints;
	   
	}
    /**
     * Implemented rewardPoint logic with the inputs given as parameters below
     * @param tranObj
     * @param customerId
     * @param year
     * @return
     */
	public double rewardPoinByCustIdPerYear(TransactionObj[] tranObj, String customerId, String year) {

		double rewardPoints = 0;

		double totalExpenAmout = 0.0;
		for (int i = 0; i < tranObj.length; i++) {
			String custId = tranObj[i].getCustomerId();
			String day = tranObj[i].getDay();
			String yearStr[] = day.split("-");
			if (customerId.equalsIgnoreCase(custId) && year.equalsIgnoreCase(yearStr[2])) {
				totalExpenAmout = totalExpenAmout + new Double(tranObj[i].getAmount());
			}

		}

		rewardPoints = rewardCalculator(totalExpenAmout);

		return rewardPoints;
	}
   
	/**
    * function to calculate the reward point from the total amount expended
    * @param totalExpenAmout
    * @return
    */
	public double rewardCalculator(double totalExpenAmout) {
		double rewardPoints = 0;
		if (totalExpenAmout > 50 && totalExpenAmout <= 100) {
			rewardPoints = rewardPoints + 1 * (totalExpenAmout - 50);
		} else if (totalExpenAmout > 100) {
			rewardPoints = rewardPoints + 2 * (totalExpenAmout - 100) + 1 * 50;
		}
		return rewardPoints;

	}

}
