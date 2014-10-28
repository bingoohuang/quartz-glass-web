package org.n3r.demo;

import org.n3r.quartz.glass.job.annotation.GlassJob;
import org.n3r.quartz.glass.job.annotation.JobArgument;
import org.n3r.quartz.glass.log.joblog.JobLogs;
import org.quartz.*;

@GlassJob(description = "静态化演示任务", team = "火箭队", created = "2013-10-16")
@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class MyJob implements Job {
    @JobArgument(description = "静态化类型", sampleValues = {"hotSale", "discountSale"})
    private String staticType;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();

        Integer count = (Integer)jobDataMap.get("count");
        if (count == null) count = 0;

        jobDataMap.put("count", ++count);
        JobLogs.warn("静态化类型是: {}, this:{}, count:{}", staticType, this, count);
    }
}
