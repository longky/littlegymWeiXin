package com.thelittlegym.mobile.service;

import com.thelittlegym.mobile.entity.Activity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Created by TONY on 2017/8/27.
 */
public interface IActivityService {
    public Page<Activity> findAllByIsDeleteAndNameLike(Boolean isDelete,String name,Pageable pageable);
    public Activity findOne(Integer id);
}
