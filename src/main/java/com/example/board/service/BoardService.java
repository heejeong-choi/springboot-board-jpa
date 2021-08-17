package com.example.board.service;

import com.example.board.model.Board;
import com.example.board.model.User;
import com.example.board.repository.BoardRepository;
import com.example.board.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private UserRepository userRepository;

    public Board save(String username, Board board) {
        User user = userRepository.findByUsername(username);
        board.setUser(user);
        return boardRepository.save(board);
    }

}