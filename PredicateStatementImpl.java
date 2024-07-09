import java.util.function.Predicate;

public class PredicateStatementImpl {
	
	//Result function that uses predicate and int to run whether a argument is true or false
	public static void result(Predicate<Integer>p, int arg) {
		if(p.test(arg)) {
			System.out.printf("The Predicate is true for value %d\n",arg);
		}
		else {
			System.out.printf("The Predicate is false for value %d\n", arg);
		}
	}

	public static void main(String[] args) {
		Predicate<Integer> predi = x->x<100;
		for(int i=10;i<130;i+=7) {
			result(predi.or(x->x%2==1).negate().and(x->x>20),i);
		}


	}

}
