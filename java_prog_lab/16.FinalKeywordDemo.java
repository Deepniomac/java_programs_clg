// Ex6-c Final variable method and class demo
public class FinalKeywordDemo {
    public static void main(String[] args) {
        FinalMethodChild child = new FinalMethodChild();
        child.show();

        FinalClass finalClass = new FinalClass();
        finalClass.print();
    }
}

class FinalVariableDemo {
    final int maxMarks = 100;

    void printMax() {
        System.out.println("Max Marks: " + maxMarks);
    }
}

class FinalMethodParent {
    final void show() {
        System.out.println("This final method cannot be overridden");
    }
}

class FinalMethodChild extends FinalMethodParent {
}

final class FinalClass {
    void print() {
        FinalVariableDemo obj = new FinalVariableDemo();
        obj.printMax();
        System.out.println("This is a final class");
    }
}
