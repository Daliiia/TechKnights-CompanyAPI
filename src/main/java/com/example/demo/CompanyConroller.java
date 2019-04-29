package com.example.demo;



import com.example.demo.Company;

import com.example.demo.FormRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@RestController
@RequestMapping("/company")
class CompanyController {

    @Autowired
    public CompanyRepository companyRepository;


    /**
     * Get all users list.
     *
     * @return the list
     */
    @GetMapping("/all")
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();

    }



    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ResponseEntity<Company> getUsersByName(@RequestParam(value = "Name") String name, @RequestParam("password") String pass) {
        Company company = new Company();
        List<Company> companies =
                getAllCompanies();

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getName().equals(name)) {
                if (companies.get(i).getPassword().equals(pass)) {
                    company = companies.get(i);
                    break;

                }
            }

        }
        return ResponseEntity.ok().body(company);
    }


/*
    /**
     * Create company company.
     *
     * @param company the company
     * @return the company
     */

   /* @PostMapping("/company")
    public Company createCompany(@Valid @RequestBody Company company) {
        return companyRepository.save(company);
    }*/

    @PostMapping("/signup")
    public Company signUp(@RequestParam(value = "Name")String name, @RequestParam(value = "password" ) String pass, @RequestParam(value = "description") String d,
                          @RequestParam(value = "jobs") String jobs, @RequestParam(value = "address") String address) {
        Company company = new Company(name, pass, d, jobs, address);
        return companyRepository.save(company);

    }


    /**
     * Update company response entity.
     *


     * @return the response entity
     * @throws ResourceNotFoundException the resource not found exception
     */
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public ResponseEntity<Company> updateUser(@RequestParam(value = "Name" ) String name, @RequestParam("password") String pass, @RequestParam("description") String d,
                                              @RequestParam("jobs") String jobs, @RequestParam("address") String address){


        int index =-1;
        Company UserDetails=new Company(name,pass,d,jobs,address);
        //Company company =new Company();
        List<Company> companies =
                getAllCompanies();

        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getName().equals(name)) {
                 index = i;
                break;
            }
        }
        if(index!=-1) {
            companies.get(index).setAddress(UserDetails.getAddress());
            companies.get(index).setDescription(UserDetails.getDescription());
            companies.get(index).setPassword(UserDetails.getPassword());
            companies.get(index).setJobs(UserDetails.getJobs());
            companies.get(index).setId(companies.get(index).getId());


            final Company updatedUser = companyRepository.save(companies.get(index));

            return ResponseEntity.ok(updatedUser);
        }
        return ResponseEntity.badRequest().body(UserDetails);

    }

   /*


    /**
     * Delete user map.
     *
     * @param name  the user id
     * @return response
     * @throws Exception the exception
     */

    @DeleteMapping("/deleteaccount")
    @ResponseBody
    public String deleteUser(@RequestParam("Name") String name) {
        Company company = new Company();
        int index=-1;
        List<Company> companies =
                getAllCompanies();
        for (int i = 0; i < companies.size(); i++) {
            if (companies.get(i).getName().equals(name)) {
                company = companies.get(i);
                index=i;
                break;
            }
        }

        companyRepository.delete(company);

        if(index==-1){return name+" account not found !";}
        return name + " User deleted successfully :)";
    }
}




