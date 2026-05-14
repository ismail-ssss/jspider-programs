import java.util.Stack;
// class stack {
//     public static void main(String[] args) {
//         String s = "{{(q)}}";
//         System.err.println(isB(s)); 
//     }
    // static boolean pair(char ch1, char ch2) {
    //     return ch1 == '{' && ch2 == '}' || ch1 == '[' && ch2 == ']' || ch1 == '(' && ch2 == ')';
    // }
    // static boolean isB(String s) {
    //     Stack<Character> stk = new Stack<>();
    //     for (char ch : s.toCharArray()) {
    //         if (ch == '{' || ch == '[' || ch == '(') {
    //             stk.push(ch); 
    //         }else if (stk.isEmpty() || !pair(stk.pop(), ch)) {
    //             return false;
    //         }
    //     }
    //     return stk.isEmpty();
    // }

        // static boolean isBalenced(String s) {
    //     Stack<Character> stk = new Stack<>();
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch1 = s.charAt(i);
    //         if (ch1 == '{' || ch1 == '[' || ch1 == '(') {
    //             stk.push(ch1);
    //         } else if (!stk.isEmpty() && ch1 == '}' || ch1 == ']' || ch1 == ')') {
    //             if (!pair(stk.pop(), ch1)) {
    //                 return false;
    //             }
    //         } else {
    //             return false;
    //         }

    //     }
    //     return stk.isEmpty();
    // }

// }

 class stack {
	public static void main(String[] args) {
		System.out.println(isBalanced("[]")); // true
	}
	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			} else if (c == ')' || c == '}' || c == ']') {
				if (stack.isEmpty()) {
					return false;
				}

				char o = stack.pop();
				if ((c == ')' && o != '(') || (c == '}' && o != '{') || (c == ']' && o != '[')) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
}
