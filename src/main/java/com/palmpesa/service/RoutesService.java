package com.palmpesa.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class RoutesService {
	public Map<String, String> routes;

	{
		routes.put("ROLE_ADMIN", "redirect:/admin");
		routes.put("ROLE_MERCHANT", "redirect:/merchant");
		routes.put("ROLE_STUDENT", "redirect:/student");
		routes.put("ROLE_PARENT", "redirect:/parent");
		routes.put("ROLE_DIRECTOR", "redirect:/director");
		routes.put("ROLE_SCHOOL_ADMIN", "redirect:/school_admin");
	}
	public RoutesService() {
		this.routes = new HashMap<>();
	}
	
	public String getRoute(String role){
		return routes.containsKey(role) ? routes.get(role) : "redirect:/login";
	}
}