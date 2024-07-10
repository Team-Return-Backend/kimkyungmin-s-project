package com.gdsc.jobiskimkyungmin.domain.feed.service;

import com.gdsc.jobiskimkyungmin.domain.feed.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.feed.domain.repository.PostRepository;
import com.gdsc.jobiskimkyungmin.domain.feed.dto.request.PostPostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
