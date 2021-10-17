package exam.service.impl;

import com.google.gson.Gson;
import exam.DTOs.CustomerSeedDto;
import exam.common.GlobalConstants;
import exam.repository.CustomerRepository;
import exam.service.CustomerService;
import exam.util.ValidationUtil;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static exam.common.GlobalConstants.CUSTOMER_FILE_PATH;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ValidationUtil validationUtil;
    private final ModelMapper modelMapper;
    private final Gson gson;

    public CustomerServiceImpl(CustomerRepository customerRepository, ValidationUtil validationUtil, ModelMapper modelMapper, Gson gson) {
        this.customerRepository = customerRepository;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return customerRepository.count() > 0;
    }

    @Override
    public String readCustomersFileContent() throws IOException {
        return Files.readString(Path.of(CUSTOMER_FILE_PATH));
    }

    @Override
    public String importCustomers() throws IOException {
        StringBuilder resultInfo = new StringBuilder();

        CustomerSeedDto[] dtos = this.gson.fromJson(new
                FileReader(CUSTOMER_FILE_PATH),CustomerSeedDto[].class);

        System.out.println();



        return null;
    }

}
