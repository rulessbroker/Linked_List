package com.bridgelabz.linkedlist;

public class LinkedList {

	Node head;
	Node tail;

	public Node push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			this.head = newNode;
			newNode.next = temp;
		}
		return newNode;
	}

	public void print() {
		Node node = head;

		while (node.next != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.print(node.data);
	}

	public void insertAtStart(int data) {
		Node newNode = new Node(data);
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			this.tail.next = newNode;
			tail = newNode;
		}
	}

	public void insertInBetween(Node previousNode, Node newNode) {
		Node tempNode = previousNode.next;
		previousNode.next = newNode;
		newNode.next = tempNode;
	}

	public void pop() {
		if (this.head == null) {

		}
		Node temp = head;
		head = temp.next;
		temp = null;
	}

	public void popLast() {
		if (head == null)
			System.out.println("No elements to delete..");
		else if (head.next == null)
			head = null;
		else {
			Node temp = head;

			while (temp.next.next != null) {
				temp = temp.next;
			}

			temp.next = null;
		}
	}
}
