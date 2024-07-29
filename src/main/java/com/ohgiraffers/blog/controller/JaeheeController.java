package com.ohgiraffers.blog.controller;

import com.ohgiraffers.blog.model.dto.JaeheeDTO;
import com.ohgiraffers.blog.model.entity.JaeheeEntity;
import com.ohgiraffers.blog.service.JaeheeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class JaeheeController {

    private final JaeheeService jaeheeService;

    // 생성자 주입을 통해 JaeheeService를 주입받음
    public JaeheeController(JaeheeService jaeheeService) {
        this.jaeheeService = jaeheeService;
    }

    @GetMapping("/page")
    public String getPage(Model model) {
        List<JaeheeDTO> posts = jaeheeService.getAllPosts();
        model.addAttribute("posts", posts);
        return "jaehee/page";
    }

    @GetMapping("/page/create")
    public String create() {
        return "jaehee/create";
    }

    @PostMapping("/page/save")
    public String savePost(@ModelAttribute JaeheeDTO jaeheeDTO) {
        jaeheeService.save(jaeheeDTO);
        return "redirect:/page";
    }

    @PostMapping("/page/create")
    public String createPost(@ModelAttribute JaeheeDTO jaeheeDTO) {
        jaeheeService.save(jaeheeDTO);
        return "redirect:/page";
    }

    @GetMapping("/jaehee/detail/{id}")
    public String detailinfo(@PathVariable("id") Long id, Model model) {
        JaeheeEntity jaeheeEntity = jaeheeService.findById(id);
        model.addAttribute("post", jaeheeEntity);
        return "jaehee/detail";
    }

    @DeleteMapping("/jaehee/delete/{id}")
    public String deletePost(@PathVariable Long id) {
        jaeheeService.deletePostById(id);
        return "redirect:/page";
    }

    @GetMapping("/jaehee/edit/{id}")
    public String editPost(@PathVariable Long id, Model model) {
        JaeheeEntity jaeheeEntity = jaeheeService.findById(id);
        model.addAttribute("post", jaeheeEntity);
        return "jaehee/edit";
    }

    @PostMapping("/page/update")
    public String updatePost(@ModelAttribute JaeheeDTO jaeheeDTO) {
        jaeheeService.update(jaeheeDTO);
        return "redirect:/page";
    }
}