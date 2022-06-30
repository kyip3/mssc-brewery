package kyip.framework.msscbrewery.services;

import kyip.framework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomer(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomer(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);
}
