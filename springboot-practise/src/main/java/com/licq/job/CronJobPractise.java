package com.licq.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.licq.utils.DateFormatUtils;

@Component
public class CronJobPractise {
		
	int i = 0;
	 @Scheduled(cron = "${job.everysecond.cron}")
	 public void everySecond() {
		 System.out.println("第" + (++i) + "次调用，每秒任务，当前时间：" + DateFormatUtils.nowTime());
	 }
	     
}
