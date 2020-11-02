package Data.map;

/**
 * 主要方法实现 get(), insert()
 *
 */
public class HashMapSelf {

    private Node[] nodes;

    public Object get(Object t){
        if(nodes != null) {
            for (Node node : nodes) {
                if (node.v.equals(t)){
                    return node.v;
                }
                boolean flag = true;
                while (flag){
                    if(node.next.v.equals(t)){
                        flag = false;
                        return node.v;
                    }else {
                        node = node.next;
                    }

                }
            }
        }
        return null;
    }

    public void insert(Node node){
        int index = node.k.hashCode();
        if(nodes[index] == null){
            nodes[0] = node;
        }else {
            //遍历链表 长度是否大于16
            //CAS
            synchronized (node){

            }
        }

    }



    class Node<K,V extends Comparable<V>>{
        private String hash;
        private K k;
        private V v;
        private Node next;
    }
}
