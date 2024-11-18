package com.Projects.jobPortal.repository;

import com.Projects.jobPortal.entity.post;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface searchRepository {
    List<post> findByText(String text);
}
