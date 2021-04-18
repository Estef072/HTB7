public class Node<E>{
    E value;
    Node<E> left;
    Node<E> right;

    Node(E value) {
        this.value = value;
        right = null;
        left = null;
    }

    public E getValue(){
        return value;
    }
}
