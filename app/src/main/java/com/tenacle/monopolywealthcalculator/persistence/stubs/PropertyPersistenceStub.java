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
        return this.propertyList.get(this.propertyList.indexOf(property));
    }

    @Override
    public Property getProperty(String name) {
        return getProperty(new Property(name, -1, false));
    }

    @Override
    public boolean storeProperty(Property property) {
        return this.propertyList.add(property);
    }

    @Override
    public boolean updateProperty(Property property) {
        boolean updated = false;
        if( this.propertyList.remove(property) ) {
            updated = this.propertyList.add(property);
        }
        return updated;
    }

    @Override
    public boolean deleteProperty(Property property) {
        return this.propertyList.remove(property);
    }

    @Override
    public boolean deleteProperty(String name) {
        return deleteProperty(new Property(name, -1, false));
    }
}
