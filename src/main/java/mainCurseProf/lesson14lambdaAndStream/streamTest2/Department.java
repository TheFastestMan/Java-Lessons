package mainCurseProf.lesson14lambdaAndStream.streamTest2;

import java.util.List;

public class Department {
    private int id;
    private int code;
    private String side;

    public Department(int id, int code, String side) {
        this.id = id;
        this.code = code;
        this.side = side;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public <E> List getChild() {
        return null;
    }

    public int getParent() {
        return 0;
    }
}
