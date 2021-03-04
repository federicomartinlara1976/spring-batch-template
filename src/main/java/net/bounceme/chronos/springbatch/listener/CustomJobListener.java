package net.bounceme.chronos.springbatch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomJobListener implements JobExecutionListener{

    @Override
    public void beforeJob(JobExecution jobExecution) {
        log.debug("JOBLISTENER: Se va a ejecutar el Job con ID: ".concat(jobExecution.getJobId().toString()));
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
    	log.debug("JOBLISTENER: Se ha terminado de ejecutar el Job con ID: ".concat(jobExecution.getJobId().toString()));
    }

}
