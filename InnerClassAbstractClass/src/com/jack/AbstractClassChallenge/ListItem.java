package com.jack.AbstractClassChallenge;

import java.util.List;

public abstract class ListItem {

    protected Object value;
    protected ListItem rightLink = null;
    protected ListItem leftLink = null;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);
    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
