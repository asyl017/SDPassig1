package light;

import interfaces.Button;

public class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Dark Button");
    }
}
