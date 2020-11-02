package Data.RBtree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RBTreeTest {

    public static void main(String[] args) throws IOException {

        RBTreeZ<String, Object> rbTree = new RBTreeZ<>();
        while(true){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入节点的key");
            String s = reader.readLine();
            rbTree.insert(s, null);
            TreeOperation.show(rbTree.getRoot());
        }

    }
}
