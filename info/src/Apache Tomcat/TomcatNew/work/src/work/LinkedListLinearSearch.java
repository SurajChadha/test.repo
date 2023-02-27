package work;

public class LinkedListLinearSearch {
	// ----- ----- Class 1: Node ----- -----



	

	// ----- ----- Class 2: DemoTranslation ----- -----

	package demo;

	import com.mtsystems.coot.Container;

	public class DemoTranslation {
		public static Container<Node> first = null;

		public static void create(int[] a, int n) {
			Container<Node> t, last;
			first = new Container<Node>(true, 1){};
			first.get().setData(a[0]);
			first.get().setNext(null);
			last = first;

			for(int i = 1; i < n; i++) {
				t = new Container<Node>(true, 1){};
				t.get().setData(a[i]);
				t.get().setNext(null);
				last.get().setNext(t);
				last = t;
			}
		}

		public static Container<Node> lSearch(Container<Node> p, int key) {
			while(p != null) {
				if(key == p.get().getData()) {
					return p;
				}
				p = p.get().getNext();
			}
			return null;
		}

		public static Container<Node> rSearch(Container<Node> p, int key) {
			if(p == null) {
				return null;
			}
			if(key == p.get().getData()) {
				return p;
			}
			return rSearch(p.get().getNext(), key);
		}

		public static void main(String[] args) {
			Container<Node> temp;
			int[] a = {8, 3, 7, 12};
			create(a, 4);
			temp = lSearch(first, 7);
			System.out.print(" " + temp.get().getData());
		}
	}
}
