package beginning;

public class AStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("I ");
        sb.append("know a place, ");
        sb.append("where the grass is really greener");
        sb.toString();
        System.out.println(sb.toString());
    }
}
