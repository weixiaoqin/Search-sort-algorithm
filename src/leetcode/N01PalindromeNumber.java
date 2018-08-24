package leetcode;
//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//Input: 121  Output: true
//Input: -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//Coud you solve it without converting the integer to a string?

public class N01PalindromeNumber {
	public boolean isPalindrome(int x) {
        if(x<0) return false;
        int a[]=new int[100];
        int n=x;
        int i=0;
        while(n!=0) {
        	a[i]=n%10;
        	i++;
        	n=n/10;
        }
        
        for(int j=0;j<a.length/2;) {
        	if(a[j]==a[a.length-1-j]) j++;
        	else return false;
        }
        return true;
     }
}
