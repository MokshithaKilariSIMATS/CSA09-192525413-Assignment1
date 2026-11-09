# CSA09-RegisterNumber-Assignment1

## Campus Smart-Parking System
### Assignment 1 – CO1

**Name:** Mokshitha Kilari  
**Register Number:** ____________________  
**Course:** B.Tech Artificial Intelligence and Machine Learning  
**Subject:** Programming in Java  
**Java Version:** Java 17 or above  

---

## Repository Organization

Each task is kept in a separate folder as required. Every folder contains the Java source file, input file where required, and the corresponding output screenshot.

```text
CSA09-RegisterNumber-Assignment1/
├── README.md
├── Task01/
├── Task02/
├── Task03/
├── Task04/
├── Task05/
├── Task06/
├── Task07/
├── Task08/
├── Task09/
├── Task10/
├── Task11/
└── Task12/
```

## Software Requirements

- Java JDK 17 or later
- Command Prompt / PowerShell / Terminal
- Any Java IDE or a Java compiler

Check the installed version:

```bash
java -version
javac -version
```

---

## Task 01 – Object Identification and Responsibilities

**Source:** `Task01/Task01.java`

**Compile:**
```bash
cd Task01
javac Task01.java
```

**Run:**
```bash
java Task01
```

**Result:** Core Campus Smart-Parking objects such as Vehicle, ParkingSlot and ParkingTicket are created and their responsibilities are demonstrated.

---

## Task 02 – Data Types and Jagged Arrays

**Source:** `Task02/Task02.java`

**Compile:**
```bash
cd Task02
javac Task02.java
```

**Run:**
```bash
java Task02
```

**Result:** Java primitive data types and a jagged array representing floors with unequal parking capacities are demonstrated.

---

## Task 03 – Control Logic, Allocation and Fee Calculation

**Source:** `Task03/Task03.java`

**Input:** `Task03/input.txt`

**Compile:**
```bash
cd Task03
javac Task03.java
```

**Run:**
```bash
java Task03
```

**Result:** Control statements, parking-slot allocation and fee calculation are implemented. The sample input is 3 parking hours.

---

## Task 04 – Constructors and Constructor Chaining

**Source:** `Task04/Task04.java`

**Compile:**
```bash
cd Task04
javac Task04.java
```

**Run:**
```bash
java Task04
```

**Result:** Default, overloaded and parameterized constructors are demonstrated, including constructor chaining using `this()`.

---

## Task 05 – Static Members and Object Lifecycle

**Source:** `Task05/Task05.java`

**Compile:**
```bash
cd Task05
javac Task05.java
```

**Run:**
```bash
java Task05
```

**Result:** A static vehicle counter, object creation, reference release and a garbage-collection request are demonstrated.

---

## Task 06 – Inheritance Hierarchy

**Source:** `Task06/Task06.java`

**Compile:**
```bash
cd Task06
javac Task06.java
```

**Run:**
```bash
java Task06
```

**Result:** A Vehicle superclass and Car, Bike and ElectricVehicle subclasses demonstrate inheritance.

---

## Task 07 – Method Overriding and Object Methods

**Source:** `Task07/Task07.java`

**Compile:**
```bash
cd Task07
javac Task07.java
```

**Run:**
```bash
java Task07
```

**Result:** `@Override`, `toString()`, `equals()` and `hashCode()` are customized for parking objects.

---

## Task 08 – Runtime Polymorphism

**Source:** `Task08/Task08.java`

**Compile:**
```bash
cd Task08
javac Task08.java
```

**Run:**
```bash
java Task08
```

**Result:** A parent-class reference invokes different overridden parking-fee methods for Car, Bike and ElectricVehicle.

---

## Task 09 – Abstraction and Interface

**Source:** `Task09/Task09.java`

**Compile:**
```bash
cd Task09
javac Task09.java
```

**Run:**
```bash
java Task09
```

**Result:** An abstract parking vehicle and a `Chargeable` interface are used to separate common structure from specific implementation.

---

## Task 10 – Packages and Encapsulation

**Source:** `Task10/Task10.java`

**Compile:**
```bash
cd Task10
javac -d . Task10.java
```

**Run:**
```bash
java task10.Task10
```

**Result:** A package is used together with private fields and public getter methods to demonstrate encapsulation.

---

## Task 11 – Implementation and Testing

**Source:** `Task11/Task11.java`

**Input:** `Task11/input.txt`

**Compile:**
```bash
cd Task11
javac Task11.java
```

**Run:**
```bash
java Task11
```

**Result:** Parking allocation is validated for normal, boundary and invalid slot conditions. Sample input is slot 2.

---

## Task 12 – Changed Requirements

**Source:** `Task12/Task12.java`

**Compile:**
```bash
cd Task12
javac Task12.java
```

**Run:**
```bash
java Task12
```

**Result:** The model is extended for e-bikes, delivery vans, visitor day passes and five floors with unequal capacities.

---

## Output Screenshots

Each task folder contains an `output.png` showing the program result in a terminal-style screen. The screenshots are intended as execution evidence for the submitted programs.

## Overall Result

The repository demonstrates:

- Classes and objects
- Constructors and constructor chaining
- Primitive data types
- Arrays and jagged arrays
- Conditional statements and loops
- Encapsulation
- Inheritance
- Method overriding
- Polymorphism
- Abstraction
- Interfaces
- Packages
- Static members
- Object lifecycle
- Parking allocation
- Parking fee calculation
- Requirement modification

## Author

**Mokshitha Kilari**
