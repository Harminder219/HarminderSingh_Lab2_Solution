package com.greatlearning.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.greatlearning.denomination.Denomaination;
import com.greatlearning.denomination.SortArray;

public class Main {

	public static void main(String[] args) {

		Denomaination denomination = new Denomaination();

		SortArray sortarray = new SortArray();

		int[] denomination_arr;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array :");

		int size = sc.nextInt();

		denomination_arr = new int[size];

		System.out.print("\nEnter the denominations value:\n");

		for (int i = 0; i < size; i++) {

			int value = sc.nextInt();

			denomination_arr[i] = value;

		}

		sortarray.sortArrayList(denomination_arr, 0, denomination_arr.length);

		System.out.print("\nEnter the amount you want to pay :");

		int amount = sc.nextInt();

		if (amount > 0) {

			ArrayList<String> denomainationList = new ArrayList<>();

			denomainationList = denomination.createDenomination(denomination_arr, amount, denomination_arr.length,
					denomainationList);

			if (denomainationList == null) {

				System.out.print("\nDenomination is not possible");
			}

			else {

				System.out.print("\nYour payment approach in order to give min no of notes will be");

				for (String eleString : denomainationList) {

					System.out.print("\n\n" + eleString);
				}

			}

		}

		else {

			System.out.print("\nAmount can not be zero");
		}
		sc.close();
	}
}
