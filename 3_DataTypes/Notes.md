DataTypes
---------
2 major types
    1. Primitive

Primitive further classified as
    1. Integer --> byte, short, long int, etc
    2. Float --> double
    3. Character
    4. Boolean

int = 4 bytes
long = 8 bytes
short = 2 bytes
byte = 1 byte --> -2^7 to +(2^7)-1

float = 4 bytes
double = 8 bytes (maximum precision)

For float, variable initialization is bit different in JAVA
'''
Working Definition --> float a = 5.6f;
Non-Working Definition --> float a = 5.6;

Character Datatypes:
In JAVA, size of character is 2 bytes (it follows UNICODE Characters) in other languages it is 1 bytes
Use single quotes and it will accept only *single character*
Example: char a = 'a';

Boolean DataType:
TRUE or FALSE (no usage of 0 or 1 -> not allowed in JAVA)

Since there is no separation of unsigned and signed, these integer datatypes itself signed by default

Example: 
```
byte => -128 to 127
short => -32768 to 32767
```
and goes on...

for long integers, need to append 'l' at the end
```
long long_l = 56545l;
```
