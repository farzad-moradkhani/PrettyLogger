# ✨ PrettyLogger

<div align="center">

**A pretty and colorful logging tool for Java's terminal console**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![ANSI](https://img.shields.io/badge/ANSI-Colors-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)


</div>

---

## 📋 Overview

PrettyLogger is a lightweight Java library that transforms your terminal logs into beautifully colored and formatted messages. With support for multiple log levels (INFO, DEBUG, WARNING, ERROR) and both foreground and background color modes, PrettyLogger makes your console output more readable and visually appealing.

## ✨ Features

- 🎨 **Color-coded log levels** - Each level has its own distinctive color
  - ✅ INFO (Green)
  - 🐛 DEBUG (Cyan)
  - ⚠️ WARNING (Yellow)
  - ❌ ERROR (Red)

- 📝 **Automatic timestamps** - Every log entry includes precise timestamps
- 🏷️ **Custom tags** - Easily identify the source of each log message
- 🎭 **Two display modes**
  - Foreground colors (default)
  - Background colors (for extra visibility)
- ⚡ **Zero configuration** - Works out of the box
- 🪶 **Lightweight** - Minimal dependencies (uses JANSI for ANSI color support)

## 📦 Installation

### Prerequisites
- Java 8 or higher
- Maven

### Add to your `pom.xml`

```xml
<dependency>
    <groupId>org.fusesource.jansi</groupId>
    <artifactId>jansi</artifactId>
    <version>2.4.0</version>
</dependency>
```

### Import the PrettyLogger class

Add the `PrettyLogger.java` file to your project under `src/main/java/com/farzadmoradkhani/`

## 🚀 Quick Usage

### Use the logging methods

```java
// INFO level
PrettyLogger.printInfo("MyApp", "Application started successfully");

// DEBUG level
PrettyLogger.printDebug("Database", "Query executed in 125ms");

// WARNING level
PrettyLogger.printWarining("API", "Slow response detected");

// ERROR level
PrettyLogger.printError("Auth", "Failed to authenticate user");
```

## 📖 Usage Guide

### Foreground Colors (Default Mode)

Display colored text on a dark background (most common use case):

```java
PrettyLogger.printInfo("tag", "message");
PrettyLogger.printDebug("tag", "message");
PrettyLogger.printWarining("tag", "message");    // Note: typo in original
PrettyLogger.printError("tag", "message");
```

**Output:**
```
[2024-11-15T14:32:45.123456] [info] [MyApp]: Application started
[2024-11-15T14:32:45.234567] [debug] [Database]: Connected successfully
[2024-11-15T14:32:46.345678] [warning] [API]: Slow response detected
[2024-11-15T14:32:47.456789] [error] [Auth]: Authentication failed
```

### Background Colors (Highlight Mode)

Use background colors to make messages stand out more:

```java
PrettyLogger.printInfo("tag", "message", true);
PrettyLogger.printDebug("tag", "message", true);
PrettyLogger.printWarining("tag", "message", true);
PrettyLogger.printError("tag", "message", true);
```

The messages will be displayed with colored backgrounds instead of just colored text.

## 💡 Examples

### Example : Application Startup

```java
public class Main {
    public static void main(String[] args) {
        // Initialize the logger
        new PrettyLogger();
        
        try {
            PrettyLogger.printInfo("Main", "Starting application...");
            
            // Initialize database
            PrettyLogger.printDebug("Database", "Connecting to database");
            // ... database connection code ...
            PrettyLogger.printInfo("Database", "Connected successfully");
            
            PrettyLogger.printInfo("Main", "Application ready!");
            
        } catch (Exception e) {
            PrettyLogger.printError("Main", "Error: " + e.getMessage());
        }
    }
}
```


## 🎯 Best Practices

**Use appropriate log levels**
   - INFO for general operations
   - DEBUG for diagnostic information
   - WARNING for potential issues
   - ERROR for actual errors

## 📝 License

This project is licensed under the MIT License - see the LICENSE file for details.

## 🤝 Contributing

Contributions are welcome! Feel free to submit issues and enhancement requests.

---

<div align="center">

**Made with ❤️ by Farzad Moradkhani**

</div>
