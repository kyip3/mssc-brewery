package kyip.framework.msscbrewery.services;

import kyip.framework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomer(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Queen Elizabeth").build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO
        log.debug("updating customer...");
    }

    @Override
    public void deleteCustomer(UUID customerId) {
        //TODO
        log.debug("deleting customer...");
    }


}
