package main;

public class homework {
	public static int check(int x) {
		int flag = 0;
		for (int i = 0; i <= 1; i++) {
			for (int j = 0; j <= 1; j++) {
				for (int k = 0; k <= 1; k++) {
					for (int l = 0; l <= 2; l++) {
						for (int m = 0; m <= 3; m++) {
							if (50 * i + 20 * j + 10 * k + 5 * l + m == x) {
								flag = 1;
								break;
							}
						}
					}
				}
			}
		}
		return flag;
	}

	public static void homework(int x) {
		if (check(x) == 1) {
			System.out.println("I can take out " + x + " yuan!");
		} else {
			System.out.println("I can't take out " + x + " yuan!");
		}
	}
}
