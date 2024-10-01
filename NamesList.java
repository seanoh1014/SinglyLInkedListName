import java.util.NoSuchElementException;

public class NamesList {

    Node head = null;

/**
 * This method adds/inserts the name in the 
 * correct alphabetical order in the linked list
 */
public void add(String name) {
    // make new node 
    Node newNode = new Node(name);

    // if list is empty, add element in the first place
    if (head == null) {
        newNode.next = head;
        head = newNode;
        return;
    }

    Node current = head;

    // if name has greater alphabetical order than head, add element ahead 
    if (current.data.compareTo(name) >= 0) {
        newNode.next = current;
        head = newNode;
        return;
    }

    while (current.next != null) {
        // compare data alphabetically
        if (current.next.data.compareTo(name) >= 0) {
            newNode.next = current.next;
            current.next = newNode;
            return;
        }

        current = current.next;
    }

    // if name is in the last order
    current.next = newNode;
    newNode.next = null;
}

/**
 * This method returns the name at the head of 
 * the list but does not remove it. Throws 
 * NoSuchElementException if the list is empty.
 */
public String getFirst() {
    if (head == null) {
        throw new NoSuchElementException("the list is empty");
    }
    return head.data;
}

/**
 * This method removes and returns the name at
 * the head of the list. Throws 
 * NoSuchElementException if the list is empty.
 */
public String removeFirst() {
    if (head == null) {
        throw new NoSuchElementException("the list is empty");
    }

    // store value of head and remove it
    String value = head.data;
    head = head.next;
    return value;
}

/**
 * This method returns true if the list is
 * empty. Otherwise, it should return false.
 */
public boolean isEmpty() {
    if (head == null) {
        return true;
    }
    return false;
}

/**
 * Removes the given string from the list
 * and return true. Returns false if the
 * name does not exist.
 */
public boolean remove(String name) {
    Node current = head;

    // compare first element
    if (current.data.equals(name)) {
        head = current.next;
        return true;
    }

    while (current.next != null) {
        if (current.next.data.equals(name)) {
            // remove that Node
            current.next= current.next.next;
            return true;
        }
        current = current.next;
    }

    return false;
}

/**
 * This method returns true if the list
 * contains the specified name. Otherwise
 * it returns false.
 */
public boolean contains(String name) {
    if (head == null) {
        throw new NoSuchElementException("the list is empty");
    }
    Node current = head;
    
    while (current != null) {
        if (current.data.equals(name)) {
            return true;
        }
        current = current.next;
    }
    return false;
}

/**
 * The toString method should return a
 * String containing all of the names in
 * the list in the correct order. For example
 * [Andy, Katie, Nisha, Rohit, Nalla]
 */
public String toString() {
    // if empty, return []
    if (head == null) {
        return "[]";
    }
    
    String text = "[" + head.data;

    Node current = head.next;
    while (current != null) {
        System.out.println("DFJSDFKLJSDFJ");
        text += ", " + current.data;

        current = current.next;
    }

    text += "]";

    return text;
}



}
