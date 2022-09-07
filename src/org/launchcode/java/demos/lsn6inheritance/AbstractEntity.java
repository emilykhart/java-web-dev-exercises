package org.launchcode.java.demos.lsn6inheritance;

public abstract class AbstractEntity {

    private static int counter = 1;

    private int idField;

    public AbstractEntity(){
        this.idField = counter;
        counter++;
    }

    public int getIdField() {
        return idField;
    }
}
