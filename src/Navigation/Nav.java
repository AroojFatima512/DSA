package Navigation;
public class Nav {
    Node head;
    Node tail;
    class Node{
        String url;
        Node next;
        Node prev;
        Node(String url){
            this.url = url;
            this.next=null;
            this.prev=null;
        }
    }

    void insert(String n) {
        Node node = new Node(n);
        if (head == null) {
            head = tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    void forward(){
        Node cur = head;
        while (cur!=null){
            System.out.println(cur.url+ " ");
            cur= cur.next;
        }
        System.out.println();

    }

    void backward() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }
        if (tail.prev == null) {
            System.out.println("List is empty");
            head = tail = null;
            return;
        }
        tail = tail.prev;
        System.out.println(tail.url);
        tail.next = null;
    }

    public void print(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node cur = head;
            while (cur != null){
                System.out.print(cur.url+ " -> ");
                cur = cur.next;
            }
            System.out.println("NULL");
        }


    public static void main(String[] args) {
        Nav navigation = new Nav();
        navigation.insert("www.google.com");
        navigation.insert("www.w3Schools.com");
        navigation.insert("www.netflix.com");

        System.out.println("Forward Navigation: ");
        navigation.forward();
        System.out.println("Backward Navigation: ");
        navigation.backward();

    }
}
