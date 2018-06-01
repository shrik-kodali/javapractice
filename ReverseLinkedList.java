package com.practice.llist.wallmart;

public class ReverseLinkedList {

	public static void main(String[] args) {

		Node<Integer> head = new Node<>(5).add(7).add(9).add(11).add(12).add(13);
		Node<String> head2 = new Node<>("Five").add("Seven").add("Nine").add("Eleven").add("Thirteen").add("Fifteen");
		System.out.println(reverseList(head));
		System.out.println(reverseList(head2));
	}

	private static <E> Node<E> reverseList(Node<E> head) {

		Node<E> prev = null, next = null;
		Node<E> current = head;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	static class Node<E> {
		E obj;
		Node<E> next;

		public Node(E obj) {
			this.obj = obj;
			next = null;
		}

		public Node<E> add(E n) {
			Node<E> nNode = new Node<>(n);
			Node<E> h = this;
			while (h.next != null) {
				h = h.next;
			}
			h.next = nNode;
			return this;
		}

		public String toString() {
			StringBuilder str = new StringBuilder("");
			Node<E> n = this;
			while (n != null) {
				str.append(n.obj + " - ");
				n = n.next;
			}
			return str.toString();
		}
	}

}
