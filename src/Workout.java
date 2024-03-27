import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Workout {
    private String name;
    private LocalDate date;
    private Duration duration;
    private List<Exercise> exercises;

    public Workout(String name, LocalDate date, Duration duration) {
        this.name = name;
        this.date = date;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public String toString() {
        return "Name: " + this.name + "\nDate: " + this.date + "\nDuration: " + this.duration;
    }
}