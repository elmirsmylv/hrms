package kodlamaio.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="job_advertisements")
public class JobAdvertisement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="job_description")
    private String jobDescription;

//    @Column(name="city_id")
//    private int cityId;
//
//    @Column(name="company_id")
//    private int companyId;
//
//    @Column(name="job_title_id")
//    private int jobTitleId;

    @ManyToOne()
    @JoinColumn(name="city_id")
    private City city;

    @CreatedBy
    @ManyToOne()
    @JoinColumn(name="company_id")
    private Company company;

    @ManyToOne()
    @JoinColumn(name="job_title_id")
    private JobTitle jobTitle;

    @Column(name="max_salary")
    private int maxSalary;

    @Column(name="min_salary")
    private int minSalary;

    @Column(name="number_of_open_position")
    private int numberOfOpenPosition;

    @Column(name="deadline")
    private LocalDateTime deadline;

    @CreatedDate
    @Column(name="created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name="active")
    private boolean active;



}
