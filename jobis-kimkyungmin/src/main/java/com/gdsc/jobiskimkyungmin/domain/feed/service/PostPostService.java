package com.gdsc.jobiskimkyungmin.domain.feed.service;

import com.gdsc.jobiskimkyungmin.domain.feed.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.feed.domain.repository.PostRepository;
import com.gdsc.jobiskimkyungmin.domain.feed.dto.request.PostPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// 게시물을 올릴 때 사용되는 서비스
@Service
@RequiredArgsConstructor
public class PostPostService {
    PostRepository postRepository;

    public void postPost(PostPostDto postPostDto){
        Post post = Post.builder()
                .title(postPostDto.getTitle())
                .content(postPostDto.getContent())
                .like(0)
                .user(postPostDto.getUser())
                .build();
        postRepository.save(post);
    }
}
