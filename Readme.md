# Java Collection and File Handling Exercises

## Level 1

### Exercise 1: Month Management
Create a class named `Month` with an attribute `name` to store the name of the month. Perform the following tasks:
- Add 11 `Month` objects to an `ArrayList`, each with a unique month name except for "August".
- Insert the missing "August" month at the correct position to maintain the proper order.
- Demonstrate that the `ArrayList` maintains the correct order.

#### HashSet Conversion
- Convert the `ArrayList` to a `HashSet` to ensure no duplicates are allowed.
- Iterate over the list using both a `for` loop and an `Iterator`.

---

### Exercise 2: Reversing List with ListIterator
- Create and fill a `List<Integer>` with some integers.
- Create a second `List<Integer>`.
- Use a `ListIterator` to read elements from the first list and insert them in reverse order into the second list.

---

### Exercise 3: Capitals Game with HashMap
- Read data from a file named `countries.txt` containing countries and their capitals.
- Store the data in a `HashMap<String, String>`.
- Ask the user for their name.
- Randomly show a country from the `HashMap`.
- The user must input the capital of the displayed country.
- Award 1 point for each correct answer.
- Repeat this process 10 times.
- Save the user's name and score in a file named `classification.txt`.

## Level 2

### Exercise 1: Restaurant Class with HashSet
- Create a class named `Restaurant` with two attributes: `name` (String) and `rating` (int).
- Implement the necessary methods to prevent adding `Restaurant` objects with the same `name` and `rating` to a `HashSet`.
- It should allow the same `name` with a different `rating` but not both the same.

---

### Exercise 2: Sorted Restaurant List
- Using the `Restaurant` class from the previous exercise, implement a way to sort the objects by `name` and then by `rating` in descending order.

**Example Output:**
```
Name: restaurant1, Rating: 8
Name: restaurant1, Rating: 7
```

