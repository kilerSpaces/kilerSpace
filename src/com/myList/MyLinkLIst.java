package com.myList;

public interface MyLinkLIst<T> {
    /**
     * 添加方法
     */
    boolean add(T t);

    /**
     *删除方法
     */
    boolean delete(int i);

    /**
     *查询方法
     */
    Object get(int i);

    /**
     * 修改数据方法
     */
    boolean update(int i,T t);

    /**
     * 判断是否为空
     */
    boolean isempty();

    /**
     * 查看大小方法
     */
    Integer size();
}
