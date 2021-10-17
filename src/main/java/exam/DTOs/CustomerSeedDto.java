package exam.DTOs;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.gson.annotations.Expose;
import exam.model.Town;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
public class CustomerSeedDto {
    @Expose
    @NotNull
    @Size(min = 2)
    private String firstName;
    @Expose
    @NotNull
    @Size(min = 2)
    private String lastName;
    @Expose
    @NotNull
    @Email
    private String email;
    @Expose
    @NotNull
    @JsonFormat(pattern="dd-MM-yyyy")
    private LocalDate registeredOn;
    @Expose
    @NotNull
    private Town town;
}
