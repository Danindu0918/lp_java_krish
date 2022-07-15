package com.clientv1.amnclientv1.modles.client.category;

import java.util.List;

public interface CategoryService {

    CategoryDTO save (CategoryDTO categoryDTO);

    List<CategoryDTO> getAll();
}
