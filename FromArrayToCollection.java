import java.util.ArrayList;

public class FromArrayToCollection {

	public static void main(String[] args) {
			Integer[] a = {1,2,3,4,5,6,7};
			ArrayList<Integer> b = new ArrayList<>();
			moveToCollection(a, b);
			for (Integer x : b) {
				System.out.println(x);
			}
	}
	
	public static<E> void moveToCollection(E[] array, ArrayList<E> collection) {
		for (E x : array) {
			collection.add(x);
		}
	}
}
