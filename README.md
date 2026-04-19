# 🌡️ Temperature Statistics in Java

## 📌 Description

This Java program calculates basic temperature statistics using an array. It finds:

* ✅ Highest temperature
* ✅ Lowest temperature
* ✅ Average temperature

The program demonstrates the use of arrays, loops, conditional statements, and basic arithmetic operations in Java.

---

## 🚀 Features

* Uses an integer array to store temperature values
* Iterates through the array using an enhanced `for` loop
* Calculates:

  * Maximum value (highest temperature)
  * Minimum value (lowest temperature)
  * Average value (mean temperature)
* Displays output in a clean formatted way

---

## 🧠 How It Works

1. An array of temperatures is initialized.
2. The first element is assumed as both highest and lowest.
3. A loop runs through all values:

   * Updates highest and lowest values
   * Adds each value to the total sum
4. The average is calculated using:

   ```
   average = sum / total number of elements
   ```
5. Results are printed using `System.out.println` and `System.out.printf`.

---

## 📊 Sample Output

```
Highest temperature: 25
Lowest temperature: 17
Average temperature: 20.29
```

---

## 🛠️ Requirements

* Java JDK 8 or above
* Any IDE (IntelliJ IDEA, Eclipse, VS Code) or command line

---

## ▶️ How to Run

1. Save the file as `TemperatureStats.java`
2. Open terminal/command prompt
3. Compile the program:

   ```
   javac TemperatureStats.java
   ```
4. Run the program:

   ```
   java TemperatureStats
   ```

---

## 📚 Concepts Used

* Arrays
* Enhanced for loop
* Conditional statements (`if`)
* Type casting
* Basic arithmetic operations

---

## ✨ Future Improvements

* Take user input instead of fixed array
* Handle dynamic number of temperatures
* Add graphical representation (charts)

---

## 📄 License

This project is open-source and free to use for learning purposes.
