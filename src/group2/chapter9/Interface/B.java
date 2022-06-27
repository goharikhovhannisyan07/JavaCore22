package group2.chapter9.Interface;

public class B implements A.NestedIF {
    @Override
    public boolean isNotNegetive(int x) {
        return x < 0 ? false : true;
    }
}
