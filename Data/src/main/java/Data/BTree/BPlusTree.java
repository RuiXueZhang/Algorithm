package Data.BTree;

/**
 * b+ 树
 * b+树 多路平衡查找树
 *
 */
public class BPlusTree<T , V extends Comparable<V>> {

    //B+树的阶
    private Integer bTreeOrder;

   //B+树的非叶子节点拥有的最大的节点数量
    private Integer maxNumber;

    private Node<T,V> root;

    private LeafNode<T, V> left;

    /**
     * 节点父类，因为 在 B+树中，存在 叶子节点 和 索引节点两种节点
     * 非叶子节点 不存储具体数据，只做索引  ，叶子节点包括索引和存储的数据
     * node  作为父类表示所有的节点
     * @param <T>
     * @param <V>
     */
    abstract class Node<T,V extends  Comparable<V>>{

        //父节点
        protected Node<T,V> parent;

        //子节点
        protected Node<T,V>[] childs;

        //子节点数量
        protected Integer numnber;

        //键
        protected Object keys[];

        //构造函数
        public Node() {
            this.parent = null;
            this.childs = new Node[numnber];
            this.numnber = 0;
            this.keys = new Object[numnber];
        }

        //查找
        abstract T find(V v);

        //插入
        abstract Node<T,V> insert(T value, V key);


    }

    //非叶子节点
    class BPlusNode<T, V extends  Comparable<V>> extends Node<T, V>{
        public BPlusNode() {
            super();
        }

        /**
         * 递归查找
         *
         * @param v
         * @return
         */

        @Override
        T find(V v) {
            return null;
        }

        @Override
        Node<T, V> insert(T key, V value) {
            return null;
        }
    }

    class LeafNode<T,V extends Comparable<V>> extends Node<T, V>{


        @Override
        T find(V v) {
            return null;
        }

        @Override
        Node<T, V> insert(T key, V value) {
            return null;
        }
    }

    }
