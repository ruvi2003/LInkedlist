package SingleLL;

		public class SingleLlist {
		    private static class Node {
		        int data;
		        Node next;

		        Node(int data) {
		            this.data = data;
		            this.next = null;
		        }
		    }

		    private Node head;

		    public SingleLlist() {
		        this.head = null;
		    }

		    public void insert(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		        } else {
		            Node current = head;
		            while (current.next != null) {
		                current = current.next;
		            }
		            current.next = newNode;
		        }
		    }

		    public void delete(int data) {
		        if (head == null) {
		            return;
		        }

		        if (head.data == data) {
		            head = head.next;
		            return;
		        }

		        Node current = head;
		        while (current.next != null && current.next.data != data) {
		            current = current.next;
		        }

		        if (current.next != null) {
		            current.next = current.next.next;
		        }
		    }

		    public void printList() {
		        Node current = head;
		        while (current != null) {
		            System.out.print(current.data + "  ");
		            current = current.next;
		        }
		        System.out.println("null");
		    }

		    public boolean search(int data) {
		        Node current = head;
		        while (current != null) {
		            if (current.data == data) {
		                return true;
		            }
		            current = current.next;
		        }
		        return false;
		    }

		    public int size() {
		        int count = 0;
		        Node current = head;
		        while (current != null) {
		            count++;
		            current = current.next;
		        }
		        return count;
		    }

		    public static void main(String[] args) {
		    	SingleLlist list = new SingleLlist();

		        list.insert(10);
		        list.insert(25);
		        list.insert(30);
		        list.insert(40);
		        list.insert(35);

		        list.printList();

		        list.delete(30);

		        list.printList();

		        System.out.println(list.search(25));
		        System.out.println(list.search(30));

		        System.out.println(list.size());
	}


}
