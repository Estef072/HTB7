import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @org.junit.jupiter.api.Test
    void add() {

        BinaryTree<Word> bt = new BinaryTree<Word>();


        Word a = new Word("ae","as","ff");
        Word b = new Word("be","bs","gf");
        Word c = new Word("ce","cs","af");
        Word d = new Word("de","ds","bf");
        Word e = new Word("ee","es","df");
        Word f = new Word("fe","fs","cf");
        Word g = new Word("ge","gs","ef");

        bt.add(f);
        bt.add(c);
        bt.add(a);
        bt.add(d);
        bt.add(b);
        bt.add(g);
        bt.add(e);


        bt.printInorder();

    }

    @org.junit.jupiter.api.Test
    void locate() {
    }
}