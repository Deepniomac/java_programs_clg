// Ex6-b Static property method and block demo
public class StaticDemo {
    public static void main(String[] args) {
        College s1 = new College(1, "Asha");
        College s2 = new College(2, "Vikram");

        s1.show();
        s2.show();
        College.showCollegeCode();
    }
}

class College {
    private int id;
    private String name;
    private static String collegeName;
    private static int collegeCode;

    static {
        collegeName = "KITS";
        collegeCode = 505;
    }

    College(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println(id + " " + name + " " + collegeName);
    }

    static void showCollegeCode() {
        System.out.println("College Code: " + collegeCode);
    }
}
