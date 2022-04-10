package com.greatlearning.transaction;

public class Transaction {

	// TODO Auto-generated constructor stub

	public void checkTargetAchieved(int[] transaction_arr, int target_value) {

		int sum = 0;

		for (int i = 0; i < transaction_arr.length; i++) {

			sum += transaction_arr[i];

			if (sum >= target_value) {

				System.out.print("\nTarget achieved after " + (i + 1) + " transactions");

				return;
			}

		}

		System.out.print("\nGiven target is not achieved");

	}

}
