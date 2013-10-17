package org.n3r.demo;

import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.n3r.quartz.glass.job.annotation.JobArgument;

import java.util.Date;

@GlassJob(description = "网页演示任务", team = "火箭队", created = "2013年10月17日")
public class WebJob {
    @JobArgument(description = "人名")
    private String who;

    public void execute() {
        System.out.println("网页JOB" + new Date());
    }
}
