package Data.tree;

/**
 * 手写红黑树
 * ①创建RBTree，定义颜色
 * ②创建RBNode
 * ③辅助方法定义：parentOf(node)，isRed(node)，setRed(node)，setBlack(node)，inOrderPrint()
 * ④左旋方法定义：leftRotate(node)
 * ⑤右旋方法定义：rightRotate(node)
 * ⑥公开插入接口方法定义：insert(K key, V value);
 * ⑦内部插入接口方法定义：insert(RBNode node);
 * ⑧修正插入导致红黑树失衡的方法定义：insertFIxUp(RBNode node);
 * ⑨测试红黑树正确性
 */
public class RBTree< K extends Comparable, V> {

    // 定义颜色
    private final static boolean RED = true;

    private final static boolean BLACK = false;

    private RBNode root;

    //定义辅助方法
    private RBNode parentOf(RBNode node){
        if(node != null){
            return node.parent;
        }
        return null;
    }

    private boolean isRed(RBNode node){
        if(node != null){
            return node.color == RED;
        }
        return false;
    }

    private boolean isBlack(RBNode node){
        if(node != null){
            return node.color == BLACK;
        }
        return false;
    }

    private void setRed(RBNode node){
        if(node != null){
            node.color = RED;
        }
    }

    private void setBlack(RBNode node){
        if(node != null){
            node.color = BLACK;
        }
    }

    private void print(){
        if(this.root != null){
            inOrderPrint(this.root);
        }

    }

    private void inOrderPrint(RBNode node){
        if(node != null){
            inOrderPrint(node.left);
            System.out.println("key:"+node.key+",value:"+node.value);
            inOrderPrint(node.right);
        }
    }

  /**
   * 以node为旋转点左旋
   * 1.将旋转点 右子树的 左节点 的父节点指向 左子树的 右节点， 旋转点 左节点指向 右节点的左子树
   * 2.旋转点的子节点  指向 旋转点的右子节点， 旋转点右子节点的父节点指向旋转点的父节点
   * 3.将旋转点的父节点指向 旋转点的右子节点， 将旋转点右子节点的 左节点指向旋转点
   */
    public void leftRoteta(RBNode node){

        RBNode rightChild = node.right;

        //将旋转点 的右节点指向 旋转点 右节点的左子节点
        node.right = rightChild.left;
        if (rightChild.left != null) {
            //旋转点 右节点的左子节点的父节点指向 旋转点
            rightChild.left.parent = node;
        }

        //如果当前节点就是根节点，不存在将 旋转点 的右节点与 旋转点 父节点建立关系这一步，只需要将 根节点 更新为 旋转点的右节点
        if(node != root){
            //将 旋转点右节点的父节点 指向 旋转点的父节点
            rightChild.parent = node.parent;
            //将旋转点父节点的左子节点（右子节点）指向 旋转点的右子节点
            if(node.parent.left == node){
                 node.parent.left = rightChild;
            }else {
                node.parent.right = rightChild;
            }
        }else {
            this.root = rightChild;
            this.root.parent = null;
        }

        //将旋转点的父节点指向旋转点的右子节点
        node.parent = rightChild;
        //将旋转点右子节点的左节点指向旋转点
        rightChild.left = node;

    }

    /**
     * 右旋方法定义
     * 1.将旋转点 左节点的 右节点  父节点指向 旋转点的左节点，旋转点的左节点指向 左节点的右节点
     * 2.旋转点的父节点的左子节点（右子节点）指向旋转点的左节点， 旋转点的左节点的父节点指向旋转点的父节点
     * 3.旋转点左节点的右节点指向旋转点，旋转点的父节点指向旋转点的左子节点
     */
    private void rightRoteta(RBNode node){
        RBNode leftChild = node.left;
        //将旋转点的左节点指向 左子节点的右节点
       node.left = leftChild.right;
       //将左子节点 的右节点的父节点 指向 旋转点（需要考虑 左子节点 右节点为空的情况，如果为空，获取父节点可能会有null）
        if(leftChild.right != null) {
            leftChild.right.parent = node;
        }

        //如果旋转点是根节点，不需要建立左节点与旋转点父节点的关系，将根节点更新为旋转点的左节点即可
        if(node != root){
            //将旋转点左节点 父节点指向旋转点的父节点
            leftChild.parent = node.parent;
            //将旋转点父节点的左子节点（右子节点）指向旋转点的左子节点
            if(node.parent.left == node){
                node.parent.left =leftChild;
            }else {
                node.parent.right = leftChild;
            }
        }else {
            root = node.left;
        }
       //将旋转点的父节点指向旋转点的左子节点
        node.parent = node.left;
        //将旋转点 左子节点的右节点指向旋转点
        leftChild.right = node;
    }

    /**
     * 插入操作
     * @param <K>
     * @param <V>
     */

    //对外插入接口
    public void insert(K key, V value) {
        RBNode newNode = new RBNode();
        newNode.setKey(key);
        newNode.setValue(value);
        newNode.setColor(RED);
        insert(newNode);
    }

    private void insert(RBNode node) {

        RBNode parent = root;

      //找到插入的位置
        while (parent != null){

            int index= node.key.compareTo(parent.key);

            if(index > 0){
                parent = parent.right;
            }else if(index == 0){
                parent.setValue(node.value);
                return;
            }else {
                parent = parent.left;
            }
        }

        node.parent = parent;
        if(root != null){
            if(node.parent.key.compareTo(node.key) >0){
                node.parent.left = node;
            }else {
                node.parent.right = node;
            }
        }else {
            root = node;
        }

       //红黑树矫正
        insertFixUp(node);

    }

    /**
     * 插入后修复红黑树平衡的方法
     * case1：红黑树为空树
     * case2：插入的节点已经存在
     * case3：插入的节点父节点为黑色
     * case4：插入的节点父节点为红色
     *        4.1 叔叔节点存在并且为红色（父-叔双红）
     *        4.2 叔叔节点不存在（或者为黑色），父亲节点为 爷爷节点的左子树
     *            4.2.1 插入节点为父节点的左子树(LL插入）
     *            4.2.1 插入节点为父节点的右子树(LR插入）
     *        4.3 叔叔节点不存在（或者为黑色），父亲节点为 爷爷节点的右子树
     *            4.3.1 插入节点为父节点的左子树(RL插入)
     *            4.3.2 插入节点父节点的右子树（RR插入)
     *
     *
     * @param node
     */
    private void insertFixUp(RBNode node) {
        if(node.parent == null){
            root = node;
            node.setColor(BLACK);
            return;
        }

        RBNode parent = parentOf(node);
        RBNode gParent = parentOf(parent);


        //case4: 插入的节点父节点为红色
        if(isRed(node.parent)){
            if(gParent.left == parent){
                /*
                case 4.1 叔叔节点存在并且为红色
                  将父亲和叔叔节点染黑，爷爷节点染黑，将爷爷节点设置为当前节点，进入下一轮判断
                 */
                if(gParent.right != null && isRed(gParent.right)){
                    setBlack(parent);
                    setBlack(gParent.right);
                    setRed(gParent);
                    insertFixUp(gParent);
                }


                if(gParent.right == null || isBlack(gParent.right)){
                 /*
                 case 4.2.1 叔叔节点不存在，插入为父亲节点的左子节点
                 */
                    if (parent.left == node) {
                        setBlack(parent);
                        setRed(gParent);
                        rightRoteta(gParent);
                    } else {
                 /*
                case 4.2.2 叔叔节点不存在，插入节点为父亲节点的右子节点
                 */
                        leftRoteta(parent);
                        insertFixUp(parent);
                        return;
                    }
                }

            }else{
                /**
                 * 插入节点的父节点为爷爷节点的右节点
                 */
                /*
                 4.1 叔叔节点存在并且为红色
                 */
                if(gParent.left != null && isRed(gParent.left)){
                    setBlack(gParent.left);
                    setBlack(node);
                    setRed(gParent);
                    insertFixUp(gParent);
                    return;
                }
                /*
                4.3.1 插入节点为父节点的左节点
                 */
                if(parent.left == node){

                    rightRoteta(parent);
                    insertFixUp(parent);
                    return;
                }

                /**
                 * 插入节点为父节点的右节点
                 */
                if(parent.right == node){
                    setBlack(parent);
                    setRed(gParent);
                    leftRoteta(gParent);
                }
            }

        }



    }

    static class RBNode< K extends Comparable, V>{

        private boolean color;

        private K key;

        private V value;

        private RBNode parent;

        private RBNode left;

        private RBNode right;

        public boolean isColor() {
            return color;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public RBNode getParent() {
            return parent;
        }

        public void setParent(RBNode parent) {
            this.parent = parent;
        }

        public RBNode getLeft() {
            return left;
        }

        public void setLeft(RBNode left) {
            this.left = left;
        }

        public RBNode getRight() {
            return right;
        }

        public void setRight(RBNode right) {
            this.right = right;
        }

        public RBNode() {
        }

        public RBNode(boolean color, K key, V value, RBNode parent, RBNode left, RBNode right) {
            this.color = color;
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.left = left;
            this.right = right;
        }
    }
}
