package com.nhnacademy.shoppingmall.controller.admin;

import com.nhnacademy.shoppingmall.common.mvc.annotation.RequestMapping;
import com.nhnacademy.shoppingmall.common.mvc.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RequestMapping(method = RequestMapping.Method.GET, value = "/admin/addProduct.do")
public class ProductAddFormController implements BaseController {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        return "layout/addproductForm";
    }
}
