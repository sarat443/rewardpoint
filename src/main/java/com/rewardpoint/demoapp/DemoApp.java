package com.rewardpoint.demoapp;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rewardpoint.service.RewardCalculatorService;
import com.rewardpoint.dto.TransactionObj;

public class DemoApp {

	public static void main(String[] args) {

		try {
			ObjectMapper objectMapper = new ObjectMapper();
			File file = new File(
					"/Users/sharatmeitei/Documents/workspace-spring-tool-suite-4-4.6.1.RELEASE/demo/src/main/java/com/rewardpoint/demoapp/datajson.json");
			TransactionObj[] tranObj = objectMapper.readValue(file, TransactionObj[].class);

			RewardCalculatorService rewardCalculatorService = new RewardCalculatorService();

			double pointPerTransaction = rewardCalculatorService.totalAmoutByTransactionId(tranObj, "ABC_1234");

			System.out.println("---------******* totalAmoutByTransactionId ------------- :  " + pointPerTransaction);

			double outMonth = rewardCalculatorService.rewardPoinByCustIdPerMonth(tranObj, "cust-3000", "05");

			System.out.println("---------******* rewardPoinByCustIdPerMonth ------------- : " + outMonth);

			double pointPerYear = rewardCalculatorService.rewardPoinByCustIdPerYear(tranObj, "cust-3000", "2020");

			System.out.println("---------******* rewardPoinByCustIdPerYear--------------- : " + pointPerYear);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
