package com.gdsc.jobiskimkyungmin.domain.feed.service;

import com.gdsc.jobiskimkyungmin.domain.feed.domain.Post;
import com.gdsc.jobiskimkyungmin.domain.feed.domain.repository.PostRepository;
import com.gdsc.jobiskimkyungmin.domain.feed.dto.request.GetPostDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

// 게시물을 검색하는 서비스
@Transactional(readOnly = true)
public class GetPostService {
    final PostRepository postRepository;

    public GetPostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public GetPostDto searchPostById(Long id){
        // 게시물 번호로 조회
        Optional<Post> post = postRepository.findById(id);
        return new GetPostDto(
                post.get().getId(),
                post.get().getTitle(),
                post.get().getContent(),
                post.get().getLike(),
                post.get().getUser());
    }

    public List<Post> searchPostByName(String title) throws ClassNotFoundException{
            return postRepository.findByTitle(title);

    }
}
