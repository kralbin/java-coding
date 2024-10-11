import java.util.Stack;
import java.util.StringTokenizer;
public class TestTokenizer {
	public static void main(String[] args){
		String  s = "Java is Simple";
		StringTokenizer token = new StringTokenizer(s, " ");
		
		//using stack to store words for easy reversal
		Stack<String> stack = new Stack<>();
		
		
		//to add to stack
		while(token.hasMoreTokens()){
			stack.push(token.nextToken());
		}
		
		// print words  in reverse
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		if(!stack.isEmpty()){
			//System.out.println(" ");
		}
	}
}
