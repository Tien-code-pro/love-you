package buoi6;

public class codeLearnA {
    public void methodPublic() {
        methodPrivate();
    }
    protected void methodProtected(){
        methodPrivate();
    }
    void methodDefault(){
        methodPrivate();
    }
    private void methodPrivate(){}
}
