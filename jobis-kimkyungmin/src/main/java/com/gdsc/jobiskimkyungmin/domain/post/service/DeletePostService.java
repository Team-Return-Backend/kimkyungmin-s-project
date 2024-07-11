package com.gdsc.jobiskimkyungmin.domain.post.service;

import com.gdsc.jobiskimkyungmin.domain.post.domain.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeletePostService {
    PostRepository postRepository;

    public void deletePost(Long id){
        postRepository.findById(id).orElseThrow(()->new RuntimeException("id is not exist"));
        postRepository.deleteById(id);
    }
}
