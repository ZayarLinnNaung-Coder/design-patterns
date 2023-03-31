package org.example.prototype;

public interface Prototype extends Cloneable{
    Prototype reproduce() throws CloneNotSupportedException;
}
