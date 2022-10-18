package beginning.modifactors;

import beginning.modifactors.test1.Main1;
import beginning.modifactors.test1.Test1;

public class Main extends Main1 {
    public static void main(String[] args) {
        Test t = new Test();
        Test1 test1 = new Test1();
        t.id4 = 4;
        t.id1 = 1;
        t.id3 = 3;

        test1.nameID1 = 1;

    }
}
