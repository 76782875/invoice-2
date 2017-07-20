package com.ahao.service;

import com.ahao.entity.*;
import com.ahao.util.UrlBuilder;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by Avalon on 2017/6/
 *
 * 抽象的分页Service
 */
public interface PageService<T extends BaseDO> extends DataService<T> {

    Collection<T> getByPage(Integer page);

    /**
     * 获取分页大小的下拉列表, 用于选择分页大小
     * @param page 当前页
     * @param urlBuilder url构建器
     * @return DropDownListDTO
     */
    DropDownListDTO getPageSize(int page, UrlBuilder urlBuilder);
}
