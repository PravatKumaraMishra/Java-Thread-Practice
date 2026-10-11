# Java Thread Practice

Small Java exercises exploring threads, shared state, and asynchronous tasks. Each Git commit records a learning step; the current `Main` demonstrates an asynchronous mail task with `CompletableFuture`.

## Topics covered in history

- Starting, pausing, joining, and interrupting threads.
- Race conditions and confinement.
- Locks, `synchronized`, and visibility with `volatile`.
- Coordination with `wait` and `notifyAll`.
- Atomic counters, `LongAdder`, and synchronized collections.
- Executor services, `Callable`, futures, and an asynchronous API.

## Run the current example

Install a JDK with Java 10 or later (`var` is used in the source). There are no external dependencies or build tools.

```sh
git clone https://github.com/PravatKumaraMishra/Java-Thread-Practice.git
cd Java-Thread-Practice
mkdir -p out
javac -d out *.java
java -cp out Main
```

`Hello World` prints while the simulated mail task runs. After about three seconds, the task prints `Mail was sent`. The main thread waits five seconds before exiting.

## Files

| File | Purpose |
| --- | --- |
| `Main.java` | Runs the current asynchronous example. |
| `MailService.java` | Provides synchronous and asynchronous send methods. |
| `LongTask.java` | Simulates a slow operation using sleep. |
| `DownloadTask.java` | Runnable with interruption and completion notification. |
| `DownloadStatus.java` | Shared download state and a LongAdder counter. |

## Explore an earlier exercise

```sh
git log --oneline
# Replace <commit> with a hash from the log; this creates a separate checkout.
git worktree add ../thread-exercise <commit>
cd ../thread-exercise
mkdir -p out
javac -d out *.java
java -cp out Main
```

These exercises deliberately include intermediate approaches and race conditions. They are learning examples rather than a complete concurrency library. The current entry point does not invoke every class. Compile output belongs in `out/` and should not be committed.
