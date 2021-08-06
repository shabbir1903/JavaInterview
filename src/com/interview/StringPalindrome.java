package com.interview;

public class StringPalindrome {

	public static boolean checkPalindrome(String str) {

			char c[] = str.toCharArray();
			String reverse = "";
			for (int i = c.length - 1;i>=0; i--) {
				reverse = reverse + c[i];
			}
			if (reverse.equals(str)) {
				System.out.println("The provide String is Palindrome:::" + str);
				return true;
			} else {
				System.out.println("The provide String is Not a Palindrome:::" + str);
				return false;
			}
		

	}

	/*
	 * checkPalindrome(a); String ab = "ab"; checkPalindrome(ab); String empty =
	 * "empty"; checkPalindrome(empty);
	 * 
	 * 
	 */
	public static void main(String[] args) {
		String abba = "abba";
		checkPalindrome(abba);
		String aba = "aba";
		checkPalindrome(aba);
		String aa = "aa";
		checkPalindrome(aa);
		String a = "a";
		checkPalindrome(a);
		String ab = "ab";
		checkPalindrome(ab);
		String empty = "empty";
		checkPalindrome(empty);

	}

}
