package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.transaction.Transaction;

public class Main {

	public static void main(String[] args) {

		Transaction transaction = new Transaction();

		int[] transaction_arr;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");

		int size = sc.nextInt();

		transaction_arr = new int[size];

		System.out.print("\nEnter the value:\n");

		for (int i = 0; i < size; i++) {

			int value = sc.nextInt();

			transaction_arr[i] = value;

		}

		System.out.print("\nEnter the total no of targets that needs to be achieved:");

		int total_targets = sc.nextInt();

		while (total_targets-- != 0) {

			System.out.print("\n\nEnter the value of target:");

			int target_value = sc.nextInt();

			transaction.checkTargetAchieved(transaction_arr, target_value);

		}

		System.out.print("\n\nTarget value can not be zero");

	}

}
