package com.telusko.JobApp.service;

import com.telusko.JobApp.model.JobPost;
import com.telusko.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    
    public void addJob(JobPost jobPost){
        repo.addJobPost(jobPost);

    }

    public List<JobPost> returnAllJobPost(){
        return repo.returnAllJobPosts();
    }
}
