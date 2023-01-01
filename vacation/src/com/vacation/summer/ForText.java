package com.vacation.summer;

public class ForText {
	public static void main(String[] args) {
			for (int i = 0; i < 5; i++) {
				// �����-��
				for (int j = 0; j < 4 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < i + 1; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for (int m = 0; m < 4; m++) {
				for (int n = 0; n < m + 1; n++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 4 - m; k++) {
					System.out.print("* ");
				}
				System.out.println();


			}
		
	}

}
