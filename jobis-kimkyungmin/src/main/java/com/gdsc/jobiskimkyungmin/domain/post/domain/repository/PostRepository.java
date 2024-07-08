package com.gdsc.jobiskimkyungmin.domain.post.domain.repository;

import com.gdsc.jobiskimkyungmin.domain.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
