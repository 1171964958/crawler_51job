package com.zk.service;


import com.zk.domain.JobInfo;

import java.util.List;

public interface JobInfoService {
    void  save(JobInfo jobInfo);

    List<JobInfo> findAll(JobInfo jobInfo);
}
