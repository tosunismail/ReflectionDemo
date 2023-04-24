package org.example;

public class MyClass {
    private int myPrivateField;

    public MyClass(int field) {
        this.myPrivateField = field;
    }

    public int getMyField() {
        return myPrivateField;
    }

    public void setMyField(int field) {
        this.myPrivateField = field;
    }
}
