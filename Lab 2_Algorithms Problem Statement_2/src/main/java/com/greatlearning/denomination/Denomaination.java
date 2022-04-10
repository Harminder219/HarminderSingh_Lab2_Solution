package com.greatlearning.denomination;

import java.util.ArrayList;

public class Denomaination {

	public ArrayList<String> createDenomination(int[] denomination_arr, int amount, int size,
			ArrayList<String> denomainationList) {

		int last_value = denomination_arr[size - 1];

		int count = 0;

		while (last_value <= amount && last_value > 0)

		{
			count += 1;

			amount = amount - last_value;

		}

		if (count > 0) {

			denomainationList.add(last_value + ":" + count);
		}

		if (amount > 0 && size > 1) {

			return createDenomination(denomination_arr, amount, size - 1, denomainationList);
		}

		if (amount > 0) {

			return null;
		}

		return denomainationList;

	}
	

}
