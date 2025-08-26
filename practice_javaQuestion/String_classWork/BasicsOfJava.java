package String_classWork;

public class BasicsOfJava {
    /*
    1. Diffrence between JDK (java development kit) & JRE (java runtime environment):-
                => JRE is the subPart of the JDK , where JRE provide the runtume environment for java appli.
                => JDK includes everything found in JRE, plus additional development tools such sa the java
                    compiler,java debugger,and other utilities for creating, compiling, and debugging Java code.
                    The JDK is essential for Java developers as it provides the necessary tools to write and build
                    Java applications
    2. what is Java Virtual Machine?
           => it works as a middle layer between java code and your computer's hardware
              JVM makes Java platform-independent (that’s why we say “Write once, run anywhere”).
    3. What are the different types of memory areas allocated by JVM?
          => When a Java program runs, the JVM divides memory into different parts to manage variables, objects, methods, and threads.
             1. Heap area 2. Stack area 3. Method area 4. PC(program counter) Register 5. Native Method Stack
    4. what is JIT compiler?
          => JIT (Just-In-Time) compiler converts frequently used bytecode into native machine code at runtime, speeding up execution.
    5. How Java platform is different from other platforms?
          => Other platforms (like C/C++) → code is compiled into machine-dependent code, runs only on one OS.
             Java → code is compiled into bytecode, which runs on JVM.
             JVM makes Java platform-independent → “Write Once, Run Anywhere”.
             Java platform also provides built-in libraries (APIs) + JRE for easier development.
    6. Why people say that Java is ‘write once and run anywhere’ language?
          => Java code → compiled into bytecode.
             Bytecode is platform-independent.
             JVM on each OS executes the same bytecode.
             Hence, no need to rewrite for different systems.
             "Same program runs everywhere → WORA."
     7. How does ClassLoader work in Java?
          => Loads .class files into JVM at runtime.
             Follows delegation model:
             Bootstrap → core classes
             Extension → ext folder classes
             Application → user classes
             Steps: Loading → Linking → Initialization.
      8. Do you think ‘main’ used for main method is a keyword in Java?
           =>No, main is not a keyword.
             It’s just the name of the method where program execution starts.
             Signature: public static void main(String[] args).
      9. Can we write main method as public void static instead of public static void?
           =>No, order matters.
             In Java, modifiers (public, static) can be in any order,
             but return type (void) must come after modifiers
     */
}
