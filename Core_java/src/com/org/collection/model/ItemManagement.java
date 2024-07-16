package com.org.collection.model;

import com.org.collection.model.Item;

public interface ItemManagement {
    void addItem(Item item);
    void removeItem(int itemId);
    void updateItem(Item item);
    void listItems();
}
