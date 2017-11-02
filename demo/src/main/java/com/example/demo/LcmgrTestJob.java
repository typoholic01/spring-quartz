package com.example.demo;

import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class LcmgrTestJob implements Job {
	 
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        /*
         * Job Interface를 implements하여
         * execute 메소드에 로직을 넣는다.
         * */
        System.out.println("--------------------------job수행---------------------------");
        System.out.println("스케쥴러: " + System.currentTimeMillis());
    }
 
}