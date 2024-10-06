package light;

import interfaces.Checkbox;

public class DarkCheckbox implements Checkbox {
    @Override
    public void display() {
        System.out.println("Dark Checkbox");
    }
}
