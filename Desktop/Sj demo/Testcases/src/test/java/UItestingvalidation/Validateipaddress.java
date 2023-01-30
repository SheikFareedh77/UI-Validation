package UItestingvalidation;

public class Validateipaddress {
	public static int validateipaddress(String a) {
		if (a.contains(".")) {
			String[] ipv4 = a.split("\\.", -1);
			for (String eachaddress : ipv4) {
				int result = verifyeachpart(eachaddress);
				if (result == 1) {
					return 1;
				} else {
					return 0;
				}
			}
		} else if (a.contains(":")) {
			String[] ipv6 = a.split("\\:", -1);
			for (String eachadrress1 : ipv6) {
				int result = verifyeachpart1(eachadrress1);
				if (result == 1) {
					return 1;
				} else {
					return 0;
				}
			}
		}
		return 0;
	}

	public static int verifyeachpart(String eachpart) {
		int eachnumber = Integer.parseInt(eachpart);
		char[] chareachpart = eachpart.toCharArray();
		int n = chareachpart.length;
		if (n > 1) {
			if (chareachpart[0] != 0) {
				if (eachnumber >= 0 && eachnumber <= 255) {
					return 1;
				} else {
					return 0;
				}
			}
		} else if (n == 1) {
			return 1;
		}

		return 0;
	}

	// Function for validating the ipv6 address
	public static int verifyeachpart1(String eachpart1) {
		if (eachpart1.length() > 4) {
			return 0;
		} else if (Integer.parseInt(eachpart1, 16) >= 0 && eachpart1.charAt(0) != '-') {
			return 1;
		}
		return 0;
	}
}
