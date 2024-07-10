package com.gdsc.jobiskimkyungmin.domain.post.domain.repository;

import com.gdsc.jobiskimkyungmin.domain.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post,Long> {
    // 최신순 검색
    @Query("SELECT post FROM Post post WHERE post.title LIKE %:title% ORDER BY post.id DESC")
    List<Post> findByTitle(String title);
}