// Ex7-b Multiple inheritance through interfaces
public class MultipleInheritanceInterfaceDemo {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.takePhoto();
        phone.useGps();
    }
}

interface Camera {
    void takePhoto();
}

interface GPS {
    void useGps();
}

interface Phone {
    void call();
}

class SmartPhone implements Camera, GPS, Phone {
    @Override
    public void takePhoto() {
        System.out.println("Photo captured");
    }

    @Override
    public void useGps() {
        System.out.println("GPS navigation started");
    }

    @Override
    public void call() {
        System.out.println("Calling... ");
    }
}
