package org.n3r.demo;

import org.n3r.quartz.glass.configuration.Configuration;
import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.n3r.quartz.glass.log.joblog.JobLogs;
import org.springframework.beans.factory.annotation.Autowired;

@GlassJob(description = "Test job for autowired supporting",
        team = "火箭队", created = "2014-09-02")
public class AutoWirePojoJob {
    @Autowired
    private Configuration configuration;

    public void run() {
        JobLogs.info("AutoWirePojoJob {}, configuration :{}", this, configuration);
    }
}

