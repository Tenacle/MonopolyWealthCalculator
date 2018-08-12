package com.tenacle.monopolywealthcalculator.persistence.stubs;

import com.tenacle.monopolywealthcalculator.objects.Property;
import com.tenacle.monopolywealthcalculator.persistence.PropertyPersistence;

import java.util.List;

public class PropertyPersistenceStub implements PropertyPersistence {
    private List<Property> propertyList;

    PropertyPersistenceStub(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public List getAllProperties() {
        return this.propertyList;
    }

    @Override
    public Property getProperty(Property property) {
        return this.getProperty(property.getName());
    }

    @Override
    public Property getProperty(String name) {
        return null;
    }

    @Override
    public boolean storeProperty(Property property) {
        return false;
    }

    @Override
    public boolean updateProperty(Property property) {
        return false;
    }

    @Override
    public boolean deleteProperty(Property property) {
        return this.deleteProperty(property.getName());
    }

    @Override
    public boolean deleteProperty(String name) {
        return false;
    }
}
