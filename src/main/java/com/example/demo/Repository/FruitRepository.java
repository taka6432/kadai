package com.example.demo.Repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Model.Fruit;

@Mapper
public interface FruitRepository {

	List<Fruit> selectAll();
}
