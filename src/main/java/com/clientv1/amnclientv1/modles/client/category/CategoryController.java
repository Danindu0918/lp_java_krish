package com.clientv1.amnclientv1.modles.client.category;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/category")
@AllArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<CategoryDTO> saveClientCategory(@RequestBody CategoryDTO categoryDTO){
        return new ResponseEntity<>(categoryService.save(categoryDTO), HttpStatus.CREATED);
    }

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public List<CategoryDTO> getAllClientCategory(){
        return categoryService.getAll();
    }
}
