// IntList: a linked list of ints that keeps its own first.
//
// On 10-28 every exercise had its own variable first, and any line in
// main could change it. Here first is private: only the methods of
// IntList can touch it. Code outside the class calls the methods.
//
//     list.first
//       |
//       v
//     [ 4 | next ]---->[ 8 | next ]---->[ 15 | null ]
//
// addFirst and toString are done in class together.
// You write size, contains, and addLast. Then run:
//
//     javac *.java
//     java IntListLab

public class IntList {
    private Node first;   // null means the list is empty

    // Done in class: insert at the head (10-28 Exercise 4).
    public void addFirst(int item) {
        first = new Node(item, first);
    }

    // Done in class: walk with current, add each item to a String.
    // The list 4 -> 8 -> 15 gives "4 -> 8 -> 15 -> null".
    // The empty list gives "null".
    public String toString() {
        String s = "";
        Node current = first;
        while (current != null) {
            s = s + current.item + " -> ";
            current = current.next;
        }
        return s + "null";
    }

    // Part 1: return how many items are in the list (10-28 Exercise 8).
    // The empty list has size 0.
    public int size() {
        // TODO
        return -1;
    }

    // Part 2: return true if target is somewhere in the list, else false.
    // Walk with current. Return true as soon as you find it.
    public boolean contains(int target) {
        // TODO
        return false;
    }

    // Part 3: put item at the end of the list (10-28 Exercise 9).
    // Careful: if the list is empty, there is no last Node.
    // Then the new Node is the first Node.
    public void addLast(int item) {
        // TODO
    }

    // Challenge: remove the first item and return it.
    // If the list is empty, return -1 and change nothing.
    public int removeFirst() {
        // TODO
        return 0;
    }

    // Part 4: return true if the list has no items, else false.
    public boolean isEmpty() {
        // TODO
        return false;
    }

    // Part 5: return the last item. Do not remove it.
    // The list 4 -> 8 -> 15 gives 15.
    // If the list is empty, return -1.
    public int getLast() {
        // TODO
        return 0;
    }

    // Part 6: return the item at position index. The first item is at 0.
    // In 4 -> 8 -> 15, get(0) is 4 and get(2) is 15.
    // If there is no item at that position, return -1.
    public int get(int index) {
        // TODO
        return 0;
    }

    // Challenge: remove the last item and return it.
    // Three cases: the empty list (return -1 and change nothing),
    // a list with one item, and a list with two or more items.
    public int removeLast() {
        // TODO
        return 0;
    }
}
