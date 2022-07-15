package com.clientv1.amnclientv1.modles.client.category;

import java.util.List;

public class CategoryServiceImpl implements CategoryService{

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {

        if (categoryDTO.getCategoryName().trim().equals(null) || categoryDTO.getCategoryName().trim().equals("")){
            throw new RuntimeException("category name is invalid...");
        }if (categoryDTO.getCustomerNumberLength() < 3){
            throw new RuntimeException("Number length must be greater than 2");
        }

        return categoryRepository.save(categoryDTO);
    }

    @Override
    public List<CategoryDTO> getAll() {
        return categoryRepository.findAll();
    }
}
