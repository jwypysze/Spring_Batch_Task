package com.kodilla.csvtask;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final JobLauncher jobLauncher;
    private final Job job;

    public PersonController(JobLauncher jobLauncher, Job job) {
        this.jobLauncher = jobLauncher;
        this.job = job;
    }

//    @GetMapping(path = "/readAndWrite")
//    public void readPeopleDatasAndWriteAges() throws JobInstanceAlreadyCompleteException,
//            JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
//        jobLauncher.run(job, new JobParameters());
//    }
}
