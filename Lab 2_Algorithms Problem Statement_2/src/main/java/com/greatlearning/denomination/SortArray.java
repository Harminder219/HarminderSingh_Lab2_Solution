package com.greatlearning.denomination;

public class SortArray {

	public void sortArrayList(int[] arr1, int s, int e) {

		if (e - s == 1) {

			return;

		}

		int m = (s + e) / 2;

		sortArrayList(arr1, s, m);

		sortArrayList(arr1, m, e);

		mergeArrays(arr1, s, m, e);

	}

	public void mergeArrays(int[] arr1, int s, int m, int e)

	{

		int[] new_arr = new int[e - s];

		int i = s;

		int j = m;

		int k = 0;

		while (i < m && j < e) {
			if (arr1[i] < arr1[j]) {
				new_arr[k] = arr1[i];
				k++;
				i++;
			}

			else {
				new_arr[k] = arr1[j];
				k++;
				j++;

			}

		}

		while (i < m) {
			new_arr[k] = arr1[i];
			k++;
			i++;

		}

		while (j < e) {

			new_arr[k] = arr1[j];
			k++;
			j++;

		}

		for (int p = 0; p < new_arr.length; p++) {
			arr1[p + s] = new_arr[p];
		}

	}

}
