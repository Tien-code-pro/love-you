package buoi6;
import buoi6.CodeLearnB;
public class codeLearnE extends CodeLearnB {
    public static void main(String[] args) {
        new CodeLearnB().methodPublic();
        new CodeLearnB().methodProtected();

        new codeLearnE().methodProtected();
    }
}
