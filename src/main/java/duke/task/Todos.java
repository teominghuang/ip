package duke.task;

//A variant of duke.task
public class Todos extends Tasks {

    // Constructor of Todos
    public Todos(String taskName) {
        super(taskName);
    }

    public Todos(String taskName, boolean completion) {
        super(taskName, completion);
    }

    // Completion of duke.task
    @Override
    public Todos completeTask() {
        return new Todos(name, true);
    }

    // Uncomplete the duke.task
    @Override
    public Todos uncompleteTask() {
        return new Todos(name, false);
    }

    // Save to database format
    public String toDatabaseString() {
        return "T | " + (super.getCompletion() ? "X" : " ")
                + " | " + super.getName() + "\n";
    }

    // toString returning Todos
    public String toString() {
        return "[T][" + (this.getCompletion() ? "X" : " ")
                + "] " + super.getName();
    }
}
