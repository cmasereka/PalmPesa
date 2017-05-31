package com.palmpesa.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.palmpesa.domain.Product;
import com.palmpesa.service.ProductService;
import com.palmpesa.service.RoutesService;

@Controller
public class HomeController {
	@Autowired
	RoutesService routesService;
	@Autowired
	ProductService productService;

	@GetMapping({ "/" })
	public String homePage() {
		return "redirect:/home";
	}

	@GetMapping({ "/home" })
	public String homePage(ModelMap model, Authentication auth) {
		final Collection<? extends GrantedAuthority> roles = auth.getAuthorities();
		String role = "";
		if(roles.iterator().hasNext()){
			role = roles.iterator().next().toString();
		}
		return routesService.getRoute(role);
	}

	@GetMapping({ "/error" })
	public String logout() {
		return "redirect:/logout";
	}

	@GetMapping({ "/admin" })
	public String adminPage(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "admin";
	}
	
	@GetMapping({ "/parent" })
	public String parentPage(Model model) {
		return "parent";
	}

	@GetMapping({ "/merchant" })
	public String visitorPage(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "merchant";
	}
}
