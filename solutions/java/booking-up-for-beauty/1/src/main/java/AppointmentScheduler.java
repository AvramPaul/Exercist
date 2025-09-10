import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        LocalDateTime datetime = LocalDateTime.parse(appointmentDateDescription, parser);
        return datetime;
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime currentDate = LocalDateTime.now();
        return appointmentDate.isBefore(currentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() < 18 && appointmentDate.getHour() >= 12;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        DateTimeFormatter printer = DateTimeFormatter.ofPattern("'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.");

    return printer.format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate year = LocalDate.now();
        LocalDate returnDate = LocalDate.of(year.getYear(), 9, 15);
        return returnDate;
    }
}
