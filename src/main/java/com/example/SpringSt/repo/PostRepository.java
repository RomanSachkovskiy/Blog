package com.example.SpringSt.repo;

import com.example.SpringSt.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
