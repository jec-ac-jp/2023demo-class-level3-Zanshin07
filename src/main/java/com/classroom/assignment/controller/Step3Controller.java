package com.classroom.assignment.controller;

import com.classroom.assignment.model.request.Comment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/step3")
public class Step3Controller {

  @GetMapping
  public String index(Model model) {
    return "step3/index";
  }

  @PostMapping("/comment")
  public String evening(Comment comment, Model model) {
    model.addAttribute("name", comment.getName());
    model.addAttribute("content", comment.getContent());
    model.addAttribute("mail", comment.getMail());

    // 課題 level2 step3
    // メールアドレスの項目を追加してください。
    return "step3/confirm";
  }
}
