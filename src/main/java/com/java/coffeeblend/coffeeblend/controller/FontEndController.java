package com.java.coffeeblend.coffeeblend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/fontend")
public class FontEndController {
    @GetMapping(value = "/about")
    public String about(){
        return "fontend/about";
    }
    @GetMapping(value = "/blog")
    public String blog(){
        return "fontend/blog";
    }
    @GetMapping(value = "/blog-single")
    public String blogsingle(){
        return "fontend/blog-single";
    }
    @GetMapping(value = "/cart")
    public String cart(){
        return "fontend/cart";
    }
    @GetMapping(value = "/checkout")
    public String checkout(){
        return "fontend/checkout";
    }
    @GetMapping(value = "/contact")
    public String contact(){
        return "fontend/contact";
    }
    @GetMapping(value = "/index")
    public String index(){
        return "fontend/index";
    }
    @GetMapping(value = "/menu")
    public String menu(){
        return "fontend/menu";
    }
    @GetMapping(value = "/product-single")
    public String productsingle(){
        return "fontend/product-single";
    }
    @GetMapping(value = "/services")
    public String services(){
        return "fontend/services";
    }
    @GetMapping(value = "/shop")
    public String shop(){
        return "fontend/shop";
    }
}
