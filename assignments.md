# Java Intro OOP Assignments

# Ex. 1 Person
Create a `Person` class that can be consumed in the following manner:
```java
var p1 = new Person();
var p2 = new Person("Jon", "Smith");
var p3 = new Person("Mary", "Jane", (byte) 12, 123456789);

System.out.println(p1.speak());
System.out.println(p2.speak());
System.out.println(p3.speak());

System.out.println(p1);
System.out.println(p2);
System.out.println(p3);

System.out.println("Person count: " + Person.getPersonCount());
```

Output:
```
I don't have a name.
My name is Jon Smith.
My name is Mary Jane and I am 12 years old.
N/A
Jon Smith
Mary Jane 6789
Person count: 3
```

# Ex. 2 Awesome Number

Create an `AwesomeNumber` class that can be consumed in the following manner:

```java
var n1 = new AwesomeNumber(4);
var n2 = new AwesomeNumber(2);
var result1 = AwesomeNumber.add(n1, n2);
var result2 = AwesomeNumber.subtract(n1, n2);
System.out.println(result1);
System.out.println(result2);
```

The `AwesomeNumber` class wraps the primitive `int` type.

Output
```
6
2
```

# Ex. 3 Calculator

Create a `Calculator` class that implements the following interface:

```Java
public interface Calculatable {

    Integer add(Integer number1, Integer number2);
    Integer subtract(Integer number1, Integer number2);
    Integer multiply(Integer number1, Integer number2);
    Integer divide(Integer number1, Integer number2);

    String getHistory();
}
```

The `Calculator` class can be consumed in the following manner:




# Ex. 4 Shopping Cart

# Ex. 5 Polymorphism


