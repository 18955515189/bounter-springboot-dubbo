package cn.bounter.dubbo.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.bounter.dubbo.model.ResponseData;
import cn.bounter.dubbo.service.BounterService;

@RestController
@CrossOrigin
@RequestMapping("/api/bounter")
public class BounterController {
	
	@Reference
	private BounterService bounterService;


	@GetMapping("/{id}")
	public ResponseData<?> get(@PathVariable Long id) {
		return new ResponseData<>().success().data(bounterService.findById(id));
	}

}
