package org.n3r.demo;

import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.n3r.quartz.glass.job.annotation.JobArgument;
import org.n3r.quartz.glass.log.joblog.JobLog;
import org.n3r.quartz.glass.log.joblog.JobLogs;

import java.util.Date;

@GlassJob(description = "网页演示任务", team = "火箭队", created = "2013年10月17日")
public class WebJob {
    @JobArgument(description = "人名")
    private String who;

    public void execute() {
        JobLogs.info("网页JOB" + new Date());
    }
}
