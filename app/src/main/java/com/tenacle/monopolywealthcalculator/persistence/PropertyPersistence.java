package com.tenacle.monopolywealthcalculator.persistence;


import com.tenacle.monopolywealthcalculator.objects.Property;

import java.util.List;

public interface PropertyPersistence {
    List getAllProperties();

    Property getProperty(Property property);
    Property getProperty(String name);

    boolean storeProperty(Property property);

    boolean updateProperty(Property property);

    boolean deleteProperty(Property property);
    boolean deleteProperty(String name);
}
