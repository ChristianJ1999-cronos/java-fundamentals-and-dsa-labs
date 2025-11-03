# 📚 Java Fundamentals & DSA Labs

Curated Java fundamentals & data structures labs with runnable demos and **Big-O notes**.  
Each topic is organized by folder for clean, modular learning and review.

---

## 🗂 Structure

```
src/
├─ fundamentals/
│  ├─ basics/            # variables, loops, conditionals, methods
│  ├─ oop/               # encapsulation, inheritance, polymorphism, interfaces
│  ├─ collections/       # List, Set, Map; generics; iterators
│  ├─ exceptions/        # try/catch, throws, custom exceptions
│  ├─ io/                # Scanner, file I/O, streams
│  └─ concurrency/       # threads, runnables, timers
└─ dsa/
   ├─ arrays/            # dynamic arrays, 2D arrays
   ├─ linkedlist/        # singly/doubly linked lists
   ├─ stacks_queues/     # stacks, queues, priority queues
   ├─ hashing/           # hash maps, hash tables
   ├─ trees/             # binary trees, BSTs
   ├─ graphs/            # adjacency lists, BFS/DFS
   ├─ recursion/         # factorial, Fibonacci, backtracking
   ├─ sorting/           # bubble, merge, quick, selection
   └─ searching/         # linear, binary, interpolation
```

---

## ▶️ How to Run

### 🧩 IntelliJ IDEA
1. Open the repo folder (`File → Open…` → select `java-fundamentals-and-dsa-labs`).
2. Ensure **Project SDK = Java 17+** (`File → Project Structure → Project`).
3. Right-click any demo file (e.g. `TwoSum.java` or `Polymorphism.java`) → **Run**.

### 🧰 Command Line
```bash
# compile and run a single file
javac -d out src/dsa/arrays/TwoSum.java
java -cp out dsa.arrays.TwoSum
```

---

## 🧠 Big-O Header Convention

Each algorithm file begins with a standard comment header:

```java
/**
 * Problem: Two Sum (array + hash map)
 * Time: O(n)
 * Space: O(n)
 */
```

---

## ✅ What This Repo Shows

- Mastery of **Java fundamentals**
- Clean project structure, organized by topic
- Hands-on **OOP, collections, exceptions, and threading**
- Strong **DSA foundations** with working code samples

---

## 🧩 Related Repos

- [java-console-projects](https://github.com/ChristianJ1999-cronos/java-console-projects) — Mini console apps built for problem-solving.
- *(Private)* `java-banking-system` — Object-oriented banking program with transactions and exception handling.

---

## 📄 License
MIT License — free for educational and reference use.
