### Type conversions & Casting

* We can't change the type of the variable
* Integer to Byte conversion is possible but not the vice versa
* to convert we need to do TypeCasting (similar concept in C as well)
    ```
    int a = 12;
    byte b;
    b = a; // not allowed
    b = (byte) a; // allowed
    ```