package collection;
import java.util.Stack;
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s= new Stack();
		System.out.println(s.empty());//true
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);//A B C D
		System.out.println(s.empty());//false
		System.out.println(s.pop());//D(remove and retrun(Top of stack))
		System.out.println(s);//A B C
		System.out.println(s.peek());//C (return top element)
		System.out.println(s);//A B C
		System.out.println(s.search("B"));//2
		System.out.println(s.search("Z"));//-1

	}

}
