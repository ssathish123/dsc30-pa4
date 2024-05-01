/*
 * NAME: TODO
 * PID: TODO
 */

/**
 * TODO
 *
 * @author TODO
 * @since TODO
 */
public class RoundRobin {

    /* constants */
    private static final String TASKS_COMPLETED = "All tasks are already completed.";

    /* instance variables */
    private MyQueue<Task> waitlist, finished;
    private int quantum, burstTime, waitTime;

    /**
     * TODO
     *
     */
    public RoundRobin(Task[] toRun) {
        /* TODO */
    }

    /**
     * TODO
     *
     */
    public RoundRobin(int quantum, Task[] toRun) {
        /* TODO */
    }

    /**
     * TODO
     *
     */
    public String runAllTasks() {
        /* TODO */
        return null;
    }

    /**
     * Main method for testing.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        Task[] test1 = {new Task("A", 3), new Task("B", 4),
                        new Task("C", 4), new Task("D", 12),
                        new Task("E", 6), new Task("F", 3)};
        RoundRobin rr1 = new RoundRobin(3, test1);     // Quantum: 3, toRun: test1
        System.out.println(rr1.runAllTasks());   // Burst: 32, Wait: 86, Order: AFBCED
        System.out.println();
        System.out.println(rr1.runAllTasks());   // TASKS_COMPLETED
        System.out.println();

        Task[] test2 = {new Task("A", 9), new Task("B", 8),
                        new Task("C", 6), new Task("D", 4),
                        new Task("E", 4), new Task("F", 3)};
        RoundRobin rr2 = new RoundRobin(test2);  // Quantum: 4, toRun: test2
        System.out.println(rr2.runAllTasks());   // Burst: 34, Wait: 123, Order: DEFBCA
        System.out.println();
        System.out.println(rr2.runAllTasks());   // TASKS_COMPLETED
        System.out.println();

        Task[] test3 = {new Task("A", 7), new Task("B", 5),
                        new Task("C", 3), new Task("D", 1),
                        new Task("E", 2), new Task("F", 4),
                        new Task("G", 6), new Task("H", 8)};
        RoundRobin rr3 = new RoundRobin(3, test3);     // Quantum: 3, toRun: test3
        System.out.println(rr3.runAllTasks());   // Burst: 36, Wait: 148, Order: CDEBFGAH
        System.out.println();
        System.out.println(rr3.runAllTasks());   // TASKS_COMPLETED
        System.out.println();
    }
}