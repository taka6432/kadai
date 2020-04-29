package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Model.Fruit;
import com.example.demo.Repository.FruitRepository;

@Controller
public class FruitController {

	@Autowired
	FruitRepository fruitRepository;

	@GetMapping("/")
	public String hello(Model model) {

		List<Fruit> fruits = fruitRepository.selectAll();
		model.addAttribute("fruits", fruits);

		System.out.println(model);
		return "inde";
	}
}
