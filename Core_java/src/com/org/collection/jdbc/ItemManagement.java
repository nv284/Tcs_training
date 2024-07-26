package com.org.collection.jdbc;

import com.org.collection.jdbc.Item;

public interface ItemManagement {
    void addItem(Item item);
    void removeItem(int itemId);
    void updateItem(Item item);
    void listItems();
}
