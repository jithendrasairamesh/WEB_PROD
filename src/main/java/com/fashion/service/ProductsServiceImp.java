package com.fashion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashion.model.Products;
import com.fashion.repository.ProductsRepository;

@Service
public class ProductsServiceImp implements ProductService{
	@Autowired
	private ProductsRepository userRepository;
	

	@Override
	public String addproduct(Products pro) {
		// TODO Auto-generated method stub
		userRepository.save(pro);
		return "Product Added Success";
	}
	 public void addAllProducts(List<Products> products) {
	        // Implement the logic to add all products to the database
	        for (Products product : products) {
	            addproduct(product); // You may need to update your addproduct method to handle single product insertion
	        }
	    }

	@Override
	public String updateproduct(Products updatedUser) {
	    // Check if the user with the given ID exists
	    Optional<Products> existingUserOptional = userRepository.findById(updatedUser.getId());
	    
	    if (existingUserOptional.isPresent()) {
	        // Get the existing user
	        Products existingUser = existingUserOptional.get();
	        
	        // Update the user's information with the new data
	       

	        // Save the updated user
	        userRepository.save(existingUser);
	        
	        return "User updated successfully";
	    } else {
	        // User with the given ID not found
	        return "User not found, update failed";
	    }
	}


	@Override
	public Products viewuserbyid(String eid) 
	{
		Optional<Products> obj = userRepository.findById(eid);
	    if(obj.isPresent())
	    {
	      Products emp = obj.get();
	      return emp;
	    }
	    else
	    {
	      return null;
	    }
	}


	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return userRepository.findAll(); 
	}

	


	

}
