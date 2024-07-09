package com.gdsc.jobiskimkyungmin.domain.post.service;

import com.gdsc.jobiskimkyungmin.domain.post.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.post.domain.repository.PostRepository;
import com.gdsc.jobiskimkyungmin.domain.post.dto.PostDto;

import java.util.List;
import java.util.Optional;

public class GetPostService {
    final PostRepository postRepository;

    public GetPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public PostDto searchPostById(Long id){
        // 게시물 번호로 조회
        Optional<Post> post = postRepository.findById(id);
        PostDto postDto = new PostDto(
                post.get().getId(),
                post.get().getTitle(),
                post.get().getContent(),
                post.get().getLike(),
                post.get().getUser());
        return postDto;
    }

    public List<Post> searchPostByName(String title){

        List<Post> posts = postRepository.findByTitle(title);
        return posts;
    }
}
