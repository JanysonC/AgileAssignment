package Objects;

import Interface.LinkedListInterface;

public class LinkedList<T> implements LinkedListInterface<T> {

    private Node firstNode;
    private int numberOfEntries;

    @Override
    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);

        if (isEmpty()) {
            firstNode = newNode;
        } else {
            Node currentNode = firstNode;

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        numberOfEntries++;
        return true;
    }

    @Override
    public boolean add(int newPosition, T newEntry) {
        boolean correct = true;

        if ((newPosition >= 1) && (newPosition <= numberOfEntries + 1)) {
            Node newNode = new Node(newEntry);

            if (isEmpty() || newPosition == 1) {
                newNode.next = firstNode;
                firstNode = newNode;
            } else {
                Node previousNode = firstNode;

                for (int i = 1; i < newPosition - 1; ++i) {
                    previousNode = previousNode.next;
                }
                newNode.next = previousNode.next;
                previousNode.next = newNode;
            }
            numberOfEntries++;
        } else {
            correct = false;
        }
        return correct;
    }

    @Override
    public T remove(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            if (givenPosition == 1) {
                result = firstNode.data;
                firstNode = firstNode.next;
            } else {
                Node previousNode = firstNode;

                for (int i = 1; i < givenPosition - 1; ++i) {
                    previousNode = previousNode.next;
                }
                result = previousNode.next.data;
                previousNode.next = previousNode.next.next;
            }
            numberOfEntries--;
        }
        return result;
    }

    @Override
    public void clear() {
        firstNode = null;
        numberOfEntries = 0;
    }

    @Override
    public boolean replace(int givenPosition, T newEntry) {
        boolean correct = true;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            Node currentNode = firstNode;

            for (int i = 0; i < givenPosition - 1; ++i) {
                currentNode = currentNode.next;
            }
            currentNode.data = newEntry;
        } else {
            correct = false;
        }
        return correct;
    }

    @Override
    public T getEntry(int givenPosition) {
        T result = null;

        if ((givenPosition >= 1) && (givenPosition <= numberOfEntries)) {
            Node currentNode = firstNode;

            for (int i = 0; i < givenPosition - 1; ++i) {
                currentNode = currentNode.next;		// advance currentNode to next node
            }
            result = currentNode.data;	// currentNode is pointing to the node at givenPosition
        }
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        Node currentNode = firstNode;

        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }

        return found;
    }

    @Override
    public int getNumberEntries() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        boolean result;
        result = numberOfEntries == 0;
        return result;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    private class Node {

        private T data;
        private Node next;

        private Node(T data) {
            this.data = data;
            this.next = null;
        }

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
