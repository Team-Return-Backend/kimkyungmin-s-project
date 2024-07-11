package com.gdsc.jobiskimkyungmin.domain.post.service;

import com.gdsc.jobiskimkyungmin.domain.post.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.post.domain.repository.PostRepository;
import com.gdsc.jobiskimkyungmin.domain.post.dto.request.PostPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
// 캐시, redis, mongoDB공부
// 기초개념 BEAN 등
@Service
@RequiredArgsConstructor
public class UpdatePostService {
    PostRepository postRepository;
    @Transactional
    public void fixPost(Long id, PostPostDto postPostDto){

        Post post = postRepository.findById(id).orElseThrow(()-> new RuntimeException("user not founded"));
        if(post.getUser().getId() != postPostDto.getUser().getId()){
            throw new RuntimeException("");
        }

        post.setTitle(postPostDto.getTitle());
        post.setContent(postPostDto.getContent());

    }
}
